package com.project.Accounting.acc.slip.dto;


import lombok.Data;


@Data
public class SlipDTO {

    private String id;

    private String deptCode;

    private String slipType;

    private String expenseReport;

    private String authorizationStatus;

    private String reportingEmpCode;

    private String reportingDate;

    private String approvalEmpCode;

    private String approvalDate;

    private String slipDescription;

    private String slipStatus;

    private String acctPeriodNo;

    private String cterCode;

    private String cterName;




    public SlipDTO(
            String slipNo,
            String deptCode,
            String slipType,
            String expenseReport,
            String authorizationStatus,
            String reportingEmpCode,
            String reportingDate,
            String approvalEmpCode,
            String approvalDate,
            String slipDescription,
            String slipStatus,
            String acctPeriodNo
    ) {
                this.id = slipNo;
                this.deptCode = deptCode;
                this.slipType = slipType;
                this.expenseReport = expenseReport;
                this.authorizationStatus = authorizationStatus;
                this.reportingEmpCode = reportingEmpCode;
                this.reportingDate = reportingDate;
                this.approvalEmpCode = approvalEmpCode;
                this.approvalDate = approvalDate;
                this.slipDescription = slipDescription;
                this.slipStatus = slipStatus;
                this.acctPeriodNo = acctPeriodNo;
    }

    protected SlipDTO() {
    }
}
