package com.project.Accounting.acc.entity.menu.account;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class AccountControlCodeId implements Serializable {
    private String acctCode;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "acct_control_code")
    @JsonManagedReference
    private AccountControlDetail accountControlDetail;
}
