package com.project.Accounting.acc.statement.TotalTrialBalance.dto;

import lombok.Data;

@Data
public class TotalTrialBalanceDTO {
    private int lev;
    private String acctName;
    private String acctInnerCode;
    private long debitsSumBalance;
    private long debitsSum;
    private long creditsSum;
    private long creditsSumBalance;

}
