package com.project.Accounting.acc.journal.service;

import com.project.Accounting.acc.entity.menu.journal.Journal;
import com.project.Accounting.acc.journal.dto.JournalDTO;
import com.project.Accounting.acc.journal.dto.JournalReportingDateDTO;
import com.project.Accounting.acc.journal.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalServiceFacadeImpl implements JournalServiceFacade{

    @Autowired
    private JournalRepository journalRepository;
    @Override
    public List<JournalDTO> getJournalList() {
        List<JournalDTO> journals = journalRepository.findAllJournals();


        return journals;
    }

    @Override
    public List<JournalReportingDateDTO> getJournalBetweenDate(String start, String end) {
        List<JournalReportingDateDTO> bySlipReportingDate = journalRepository.findBySlipReportingDateBetween2(start, end);
        return bySlipReportingDate;
    }


}
