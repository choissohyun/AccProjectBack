package com.project.Accounting.acc.accountledger.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper=false)
@Data
public class GeneralAccountLedgerDTO {
    private String reportingDate;
    private String acctName;
    private String leftDebtorPrice;
    private String rightCreditsPrice;
    private String cterName;
    private String expenseReport;

}
