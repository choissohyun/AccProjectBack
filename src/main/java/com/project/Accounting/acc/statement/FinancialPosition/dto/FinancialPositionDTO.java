package com.project.Accounting.acc.statement.FinancialPosition.dto;

import lombok.Data;


@Data
public class FinancialPositionDTO {

    private long lev;
    private String category;
    private String acctName;
    private long balanceDetail;
    private long balanceSummary;
    private long periodNo;
    private String acctCode;

    private long preBalanceSummary;
//
    private long preBalanceDetail;


}
