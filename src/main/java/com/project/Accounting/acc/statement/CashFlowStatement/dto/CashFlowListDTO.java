package com.project.Accounting.acc.statement.CashFlowStatement.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class CashFlowListDTO {
    private String accountInnerCode;
    private String accountName;
    private String parentAccountCode;
    private String cashFlow;
    private String cashFlowSummary;
    private String earlyCashFlow;
    private String earlyCashFlowSummary;
}
