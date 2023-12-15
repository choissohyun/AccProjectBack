package com.project.Accounting.acc.entity.menu.period;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Financial_position {
    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_period_no")
    private Period period;

    private Long LEV;

    private String category;

    private String acctName;

    private Long balanceDetail;

    private Long balanceSummary;

    private String acctCode;

}
