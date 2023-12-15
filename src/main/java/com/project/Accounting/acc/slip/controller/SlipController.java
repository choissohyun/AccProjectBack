package com.project.Accounting.acc.slip.controller;

import com.project.Accounting.acc.entity.menu.Slip;
import com.project.Accounting.acc.entity.menu.journal.Journal;
import com.project.Accounting.acc.journal.dto.JournalDTO;
import com.project.Accounting.acc.slip.dto.SlipDTO;
import com.project.Accounting.acc.journal.service.JournalServiceFacade;
import com.project.Accounting.acc.slip.service.SlipServiceFacade;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/acc/account/")
@CrossOrigin("*")
@Tag(name = "전표", description = "전표 관련 API입니다.")
public class SlipController {

    @Autowired
    private final SlipServiceFacade slipServiceFacade;

    @Autowired
    private final JournalServiceFacade journalServiceFacade;

    @GetMapping("/slips")
    @Operation(summary = "전표 전체 조회", description = "연관관계 포함 전표 조회입니다.")
    public ResponseEntity<Map<String,Object>> Slips() {

        HashMap<String, Object> map = new HashMap<>();

        List<Slip> slipList = slipServiceFacade.getSlipList();


        if(slipList.size()==0){
            return ResponseEntity.notFound().build(); //없을경우
        }

        map.put("SlipList", slipList);

        return ResponseEntity.ok(map);

    }

    @GetMapping("/onlyslips")
    @Operation(summary = "전표만 전체 조회", description = "전표만 전체 조회입니다.")
    public ResponseEntity<Map<String,Object>> onlySlips() {

        HashMap<String, Object> map = new HashMap<>();

        List<SlipDTO> onlySlipList = slipServiceFacade.getOnlySlipList();


        if(onlySlipList.size()==0){
            return ResponseEntity.notFound().build(); //없을경우
        }

        map.put("SlipList", onlySlipList);

        return ResponseEntity.ok(map);

    }


    @PostMapping("/slip")
    @Operation(summary = "전표 등록", description = "연관관계 포함해서 전표를 등록하는 메서드")
    public ResponseEntity<String> registerSlip(@RequestBody Slip slip){
        System.out.println("@RequestBody="+slip );
        System.out.println("carName="+slip.getJournals().get(0).getJournalDetail().getCarName() );
        try {
            String slipNumber = slipServiceFacade.registerSlip(slip);
            return ResponseEntity.ok(slipNumber);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }




    @GetMapping("/slip/{SlipNo}")
    @Operation(summary = "전표 번호로 전표 단일 조회")
    public ResponseEntity<HashMap<String,Slip>> getSlipById(@PathVariable("SlipNo") String id){
        HashMap<String, Slip> map = new HashMap<>();

        Optional<Slip> slip = slipServiceFacade.getSlip(id);

        if(slip.isEmpty()){
            return ResponseEntity.badRequest().build();
        }

        map.put("slip", slip.get());

        return ResponseEntity.ok(map);
    }


    @PutMapping("/slip")
    @Operation(summary = "전표 수정")
    public ResponseEntity<HashMap<String,Slip>> UpdateSlip(@RequestBody Slip slip){
        HashMap<String,Slip> map = new HashMap<>();
        System.out.println("넘어온데이터 = "+ slip);

            Slip save = slipServiceFacade.SlipUpdate(slip);
            map.put("slip",save);
            return ResponseEntity.ok(map);

    }

    @GetMapping("/slipsApprove")
    @Operation(summary = "승인 전표 조회")
    public ResponseEntity<HashMap<String,List<SlipDTO>>> GetNoneApproveSlip(){
        HashMap<String, List<SlipDTO>> map = new HashMap<>();
        List<SlipDTO> slipList = slipServiceFacade.getNoneApproveSlipList();

        map.put("slip",slipList);
        return ResponseEntity.ok(map);

    }

    @PutMapping("/slipsApprove")
    @Operation(summary = "전표 승인 처리")
    public ResponseEntity<HashMap<String,List<String>>> approveSlip(@RequestBody ArrayList<String> list){
        HashMap<String, List<String>> map = new HashMap<>();

        System.out.println("list = " + list);

        List<String> slipsId = slipServiceFacade.ApproveSlip(list);


        map.put("list",slipsId);
        return ResponseEntity.ok(map);

    }

    @PutMapping("/slipsReject")
    @Operation(summary = "전표 반려 처리")
    public ResponseEntity<HashMap<String,List<String>>> rejectSlip(@RequestBody ArrayList<String> list){
        HashMap<String, List<String>> map = new HashMap<>();

        System.out.println("list = " + list);

        List<String> slipsId = slipServiceFacade.rejectSlip(list);


        map.put("list",slipsId);
        return ResponseEntity.ok(map);

    }

    @GetMapping("/slipTest")
    public ResponseEntity<HashMap<String,Slip>> SlipTest(@RequestParam String id){
        HashMap<String, Slip> map = new HashMap<>();

        Slip byId = slipServiceFacade.findById(id);

        map.put("list",byId);
        return ResponseEntity.ok(map);

    }



}
