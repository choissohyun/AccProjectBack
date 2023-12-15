package com.project.Accounting.acc.accountControlCode.service;

import com.project.Accounting.acc.accountControlCode.repository.AccountControlCodeRepository;
import com.project.Accounting.acc.entity.menu.account.AccountControlCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountControlCodeServiceImpl implements AccountControlCodeService {

    @Autowired
    private AccountControlCodeRepository accountControlCodeRepository;

    @Override
    public List<AccountControlCode> getAccountControlCodeList() {
        List<AccountControlCode> all = accountControlCodeRepository.findAll();

        return all;
    }
}
