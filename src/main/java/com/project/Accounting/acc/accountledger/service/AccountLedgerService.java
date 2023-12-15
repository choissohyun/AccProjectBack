package com.project.Accounting.acc.accountledger.service;

import com.project.Accounting.acc.accountledger.dto.GeneralAccountLedgerDTO;

import java.util.ArrayList;
import java.util.HashMap;

public interface AccountLedgerService {

    HashMap<String, Object> getLedgerbyAccountInfo(String accountCode, String startDate, String endDate);

    ArrayList<GeneralAccountLedgerDTO> findGeneralAccountLedgerList(String fromDate, String toDate);



}
