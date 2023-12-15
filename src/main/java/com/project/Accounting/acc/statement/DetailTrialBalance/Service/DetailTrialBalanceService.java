package com.project.Accounting.acc.statement.DetailTrialBalance.Service;

import com.project.Accounting.acc.statement.DetailTrialBalance.dto.DetailTrialBalanceDTO;

import java.util.ArrayList;

public interface DetailTrialBalanceService {
    ArrayList<DetailTrialBalanceDTO> getDetailTrialBalance(String fromDate, String toDate);
}
