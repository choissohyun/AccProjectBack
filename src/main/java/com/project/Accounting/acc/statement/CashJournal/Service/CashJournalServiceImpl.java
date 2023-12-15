package com.project.Accounting.acc.statement.CashJournal.Service;

import com.project.Accounting.acc.statement.CashJournal.dao.CashJournalDAO;
import com.project.Accounting.acc.statement.CashJournal.dto.CashJournalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class CashJournalServiceImpl implements CashJournalService {

    @Autowired
    private CashJournalDAO cashJournalDAO;

    @Override
    public ArrayList<CashJournalDTO> getCashJournal(String fromDate, String toDate) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("fromDate", fromDate);
        param.put("toDate", toDate);
        System.out.println("param =========== " + param);
        return cashJournalDAO.selectCashJournalList(param);
    }
}
