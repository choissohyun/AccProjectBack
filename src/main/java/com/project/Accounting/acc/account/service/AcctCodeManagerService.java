package com.project.Accounting.acc.account.service;

import com.project.Accounting.acc.account.dto.AcctCodeManagerDTO;
import com.project.Accounting.acc.entity.menu.account.Account;

import java.util.List;

public interface AcctCodeManagerService {
    public List<AcctCodeManagerDTO> getAccountCodeList();

    void deleteAccount(String id);
    void saveAccount(AcctCodeManagerDTO account);

}
