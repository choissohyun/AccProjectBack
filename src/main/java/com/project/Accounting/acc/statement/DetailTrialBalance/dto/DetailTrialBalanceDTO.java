package com.project.Accounting.acc.statement.DetailTrialBalance.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class DetailTrialBalanceDTO {
    private int lev;
    private String accountInnerCode;
    private int debitsSum;
    private int exceptCashDebits;
    private int cashDebits;
    private String accountName;
    private int cashCredits;
    private int exceptCashCredits;
    private int creditsSum;
}
