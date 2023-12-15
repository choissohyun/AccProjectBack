package com.project.Accounting.acc.journal.service;

import com.project.Accounting.acc.entity.menu.journal.Journal;
import com.project.Accounting.acc.journal.dto.JournalDTO;
import com.project.Accounting.acc.journal.dto.JournalReportingDateDTO;

import java.util.List;

public interface JournalServiceFacade {

    List<JournalDTO> getJournalList();

    List<JournalReportingDateDTO> getJournalBetweenDate(String start, String end);
}
