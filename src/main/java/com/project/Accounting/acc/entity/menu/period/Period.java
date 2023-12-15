package com.project.Accounting.acc.entity.menu.period;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Period {

    @Id
    @Column(name = "account_period_no")
    private String id;

//    @OneToMany(mappedBy = "period")
//    @JsonIgnoreProperties("period")
//    private List<Slip> slip;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "early_closing_id")
//    private Early_closing earlyClosing;

//    @OneToOne(mappedBy = "period")
//    private Accounting_settlement_status accountingSettlementStatus;

//    @OneToOne(mappedBy = "period")
//    private Total_trial_balance totalTrialBalance;

//    @OneToMany(mappedBy = "id.period", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Budget> budgets;

    private String periodStartDate;

    private String periodEndDate;

}
