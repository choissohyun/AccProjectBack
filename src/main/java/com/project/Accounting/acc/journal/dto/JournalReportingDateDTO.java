package com.project.Accounting.acc.journal.dto;

import lombok.Data;
@Data
public class JournalReportingDateDTO {


        private String journalNo;

        private String slipNo;

        private String balanceDivision;

        private String acctInnerCode;

        private String acctName;

        private String cterCode;

        private Long leftDebtorPrice;

        private Long rightCreditsPrice;

        private String reportingDate;

        private String expenseReport;

        private String cterName;

        public JournalReportingDateDTO(String journalNo,
                          String slipNo,
                          String balanceDivision,
                          String acctInnerCode,
                          String acctName,
                          String cterCode,
                          Long leftDebtorPrice,
                          Long rightCreditsPrice,
                          String reportingDate,
                          String expenseReport,
                          String cterName
                          ) {
            this.journalNo = journalNo;
            this.slipNo = slipNo;
            this.balanceDivision = balanceDivision;
            this.acctInnerCode = acctInnerCode;
            this.acctName = acctName;
            this.cterCode = cterCode;
            this.leftDebtorPrice = leftDebtorPrice;
            this.rightCreditsPrice = rightCreditsPrice;
            this.reportingDate = reportingDate;
            this.expenseReport = expenseReport;
            this.cterName = cterName;
        }


    public JournalReportingDateDTO(String journalNo,
                                   String slipNo,
                                   String balanceDivision,
                                   String acctInnerCode,
                                   String acctName,
                                   String cterCode,
                                   Long leftDebtorPrice,
                                   Long rightCreditsPrice

    ) {
        this.journalNo = journalNo;
        this.slipNo = slipNo;
        this.balanceDivision = balanceDivision;
        this.acctInnerCode = acctInnerCode;
        this.acctName = acctName;
        this.cterCode = cterCode;
        this.leftDebtorPrice = leftDebtorPrice;
        this.rightCreditsPrice = rightCreditsPrice;

    }
    }



