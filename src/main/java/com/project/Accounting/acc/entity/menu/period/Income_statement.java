package com.project.Accounting.acc.entity.menu.period;

import com.project.Accounting.acc.entity.menu.account.Account;
import jakarta.persistence.*;

@Entity
public class Income_statement {
    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_period_no")
    private Period period;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_account_inner_code")
    private Account parentAccount;

    private Long income;

    private Long incomeSummary;


}
