package com.project.Accounting.acc.statement.CostStatement.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class CostStatementDTO {
    private String accountInnerCode;
    private String accountName;
    private String parentAccountCode;
    private String cost;
    private String costSummary;
    private String earlyCost;
    private String earlyCostSummary;
    private String isThisYear;

}
