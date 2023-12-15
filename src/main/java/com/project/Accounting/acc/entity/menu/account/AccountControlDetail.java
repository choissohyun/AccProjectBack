package com.project.Accounting.acc.entity.menu.account;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class AccountControlDetail {
    @Id
    @Column(name = "acct_control_code")
    private String id;

    @OneToMany(mappedBy = "accountControlCode.accountControlDetail")
    @JsonBackReference
    private List<AccountControlCode> accountControlCode;


    private String acctControlName;


    private String acctControlType;


    private String description;




}
