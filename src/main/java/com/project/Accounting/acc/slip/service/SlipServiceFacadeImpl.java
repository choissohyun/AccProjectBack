package com.project.Accounting.acc.slip.service;

import com.project.Accounting.acc.entity.menu.Slip;
import com.project.Accounting.acc.entity.menu.journal.Journal;
import com.project.Accounting.acc.entity.menu.journal.JournalDetail;
import com.project.Accounting.acc.entity.menu.journal.JournalDetailId;
import com.project.Accounting.acc.journal.service.JournalDetailService;
import com.project.Accounting.acc.slip.dto.SlipDTO;
import com.project.Accounting.acc.journal.repository.JournalDetailRepository;
import com.project.Accounting.acc.journal.repository.JournalRepository;
import com.project.Accounting.acc.slip.repository.SlipRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Data
@Transactional
public class SlipServiceFacadeImpl implements SlipServiceFacade {

    @Autowired
    private final SlipRepository slipRepository;

    @Autowired
    private final JournalDetailService journalDetailService;

    @Autowired
    private final JournalRepository journalRepository;

    @Autowired
    private final JournalDetailRepository journalDetailRepository;

    @Autowired
    private final EntityManager entityManager;



    /*
    전표 연관관계 포함 전체 조회
     */
    @Override
    public List<Slip> getSlipList() {
        List<Slip> slipList = slipRepository.findAllFetch();


        return slipList;
    }
    
    /*
    전표만 조회
     */

    @Override
    public List<SlipDTO> getOnlySlipList() {
        List<SlipDTO> onlySlipList = slipRepository.findOnlySlipList();
        return onlySlipList;
    }


    /*
    전표번호로 조회
     */
    @Override
    public Optional<Slip> getSlip(String slipId) {
        Optional<Slip> slip = slipRepository.findById(slipId);
        System.out.println("slip.get() = " + slip.get());

        return slip;
    }

    /*
    전표 등록
     */
    @Override
    public String registerSlip(Slip slipForm) {

        StringBuffer slipNo= new StringBuffer();

        String count = slipRepository.countSlipByReportingDate(slipForm.getReportingDate())+1 + "";
        slipNo.append(slipForm.getReportingDate().replace("-",""));
        slipNo.append("SLIP");
        String countFormat = String.format("%05d",Integer.parseInt(count));
        slipNo.append(countFormat);
        String slipNoResult = slipNo.toString();

        slipForm.setId(slipNoResult);
        slipForm.setSlipStatus("대기");


        slipForm.getJournals().forEach( journal -> {
            StringBuffer journalNo = new StringBuffer();
            journalNo.append(slipNoResult);
            journalNo.append("JOURNAL");
            journalNo.append(journal.getId());
            Slip slip = new Slip();
            slip.setId(slipNoResult);
            journal.setSlip(slip);
            journal.setId(journalNo.toString());


            JournalDetail journalDetail = journal.getJournalDetail();
            journalDetail.setId(new JournalDetailId());

            Journal journal1 = new Journal();
            journal1.setId(journalNo.toString());

            journalDetail.getId().setJournal(journal1);
            String sql = "SELECT JOURNAL_DETAIL_NO.NEXTVAL FROM dual";
            Query query = entityManager.createNativeQuery(sql);
            Object singleResult = query.getSingleResult();

            journalDetail.getId().setId(Long.parseLong(singleResult.toString()));


            JournalDetail regiser = journalDetailService.regiser(journalDetail);
            System.out.println("regiser = " + regiser);
            journal.setJournalDetail(regiser);


        });



        slipRepository.save(slipForm);

        System.out.println("Journal 출력"+slipForm.getJournals());

        return slipNoResult;
    }
    


    /*
    전표 업데이트
     */
    @Override
    public Slip SlipUpdate(Slip slipForm) {


        slipForm.getJournals().forEach( j -> {

            j.setSlip(slipForm);
            j.getJournalDetail().getId().setJournal(j);


        });




        Slip save = slipRepository.save(slipForm);

        System.out.println("업데이트 후");
        return save;
    }

    @Override
    public List<SlipDTO> getNoneApproveSlipList() {
        List<SlipDTO> onlySlipList = slipRepository.findOnlySlipList();

        List<SlipDTO> filterList = onlySlipList.stream().filter(slip -> slip.getSlipStatus().contains("대기")).toList();
        System.out.println("filterList = " + filterList);

        return filterList;
    }

    @Override
    public List<String> ApproveSlip(List<String> idList) {
        List<Slip> slips = slipRepository.findByIdIn(idList);

        slips.stream().forEach( slip -> slip.setSlipStatus("승인완료"));

        List<String> slipIdList = slips.stream().map(slip -> slip.getId()).collect(Collectors.toList());

        return slipIdList;
    }

    @Override
    public List<String> rejectSlip(List<String> idList) {

        List<Slip> slips = slipRepository.findByIdIn(idList);

        slips.stream().forEach( slip -> slip.setSlipStatus("반려"));

        List<String> slipIdList = slips.stream().map(slip -> slip.getId()).collect(Collectors.toList());

        return slipIdList;

    }

    @Override
    public Slip findById(String id) {
        Optional<Slip> slip = slipRepository.findById(id);

        Slip slip1 = slip.get();
        return slip1;
    }


}
