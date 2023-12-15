package com.project.Accounting.acc.entity.menu.account;

import com.project.Accounting.acc.account.dto.AcctCodeManagerDTO;
import com.project.Accounting.acc.entity.menu.period.Income_statement;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Account implements Serializable {
    @Id
    @Column(name = "acct_inner_code")
    private String id;

    private String parentAcctInnerCode;

    private String acctCode;


//    @OneToMany(mappedBy = "id.acc", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Budget> budgets;


    private String acctCharacter;

    private String acctName;

    private String acctDisplayNameWithCode;

    private String acctDisplayName;

    private String acctDivision;

    private String acctUseCheck;

    private String acctDescription;


    private String groupCode;

    private Boolean editable;

    private String target;

    private String budget;


    public Account(AcctCodeManagerDTO acctCodeManagerDTO) {
        this.id = acctCodeManagerDTO.getAcctInnerCode();
        this.acctCode = acctCodeManagerDTO.getAcctCode();
        this.acctCharacter = acctCodeManagerDTO.getAcctCharacter();
        this.acctName = acctCodeManagerDTO.getAcctName();
        this.acctDivision = acctCodeManagerDTO.getAcctDivision();
        this.parentAcctInnerCode = acctCodeManagerDTO.getParentAcctInnerCode();
        this.groupCode = acctCodeManagerDTO.getGroupCode();

    }

    protected Account() {
    }
}
