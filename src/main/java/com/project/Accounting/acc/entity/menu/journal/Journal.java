package com.project.Accounting.acc.entity.menu.journal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.Accounting.acc.entity.menu.Slip;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Journal {

    @Id
    @Column(name = "journal_no")
    private String id;

    @OneToOne(mappedBy = "id.journal",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private JournalDetail journalDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "slip_no")
    @JsonIgnore
    private Slip slip;

    private String balanceDivision;

    private String acctInnerCode;

    private String acctName;

    private String cterCode;

    private String cterName;

    private Long leftDebtorPrice;

    private Long rightCreditsPrice;


}
