package com.project.Accounting.acc.statement.CashJournal.Service;

import com.project.Accounting.acc.statement.CashJournal.dto.CashJournalDTO;

import java.util.ArrayList;

public interface CashJournalService {
    ArrayList<CashJournalDTO> getCashJournal(String fromDate, String toDate);
}
