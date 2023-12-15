package com.project.Accounting.acc.entity.menu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.Accounting.acc.entity.menu.journal.Journal;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Slip {
    @Id
    @Column(name = "slip_no")
    private String id;

    private String deptCode;

    @OneToMany(mappedBy = "slip", cascade = CascadeType.ALL)
    private List<Journal> journals;

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





}
