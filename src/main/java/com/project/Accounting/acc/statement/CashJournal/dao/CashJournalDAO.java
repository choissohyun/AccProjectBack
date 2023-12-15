package com.project.Accounting.acc.statement.CashJournal.dao;

import com.project.Accounting.acc.statement.CashJournal.dto.CashJournalDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface CashJournalDAO {
    ArrayList<CashJournalDTO> selectCashJournalList(HashMap<String, Object> param);
}
