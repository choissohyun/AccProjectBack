package com.project.Accounting.acc.account.dto;

import com.project.Accounting.acc.entity.menu.account.Account;
import lombok.Data;

@Data
public class AccountCodeDto {

    private String acctInnerCode;

    private String acctName;


    public AccountCodeDto(Account account) {
        this.acctInnerCode = account.getId();
        this.acctName = account.getAcctName();
    }

    public AccountCodeDto() {
    }
}
