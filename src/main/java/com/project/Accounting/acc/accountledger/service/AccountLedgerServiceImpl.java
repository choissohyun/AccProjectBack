package com.project.Accounting.acc.accountledger.service;

import com.project.Accounting.acc.accountledger.dao.AccountLedgerDAO;
import com.project.Accounting.acc.accountledger.dto.GeneralAccountLedgerDTO;
import com.project.Accounting.acc.accountledger.repository.AccountLedgerRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
@Data
public class AccountLedgerServiceImpl implements AccountLedgerService {

    @Autowired
    private final AccountLedgerRepository accountRepository;

    @Autowired
    private AccountLedgerDAO accountLedgerDAO;


    @Override
    public HashMap<String, Object> getLedgerbyAccountInfo(String accountCode, String startDate, String endDate) {
        System.out.println("///////계정별원장 서비스임플 시작 ////// ");
        HashMap<String, Object> param = new HashMap<>();
        param.put("accountCode", accountCode);
        param.put("startDate", startDate);
        param.put("endDate", endDate);
        accountLedgerDAO.getLedgerbyAccountInfo(param);
        return param;
    }

    @Override
    public ArrayList<GeneralAccountLedgerDTO> findGeneralAccountLedgerList(String fromDate, String toDate) {
        HashMap<String, String> map = new HashMap<>();
        map.put("fromDate", fromDate);
        map.put("toDate", toDate);
        return accountLedgerDAO.selectGeneralAccountLedgerList(map);
    }


}
