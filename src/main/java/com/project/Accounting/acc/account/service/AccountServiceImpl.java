package com.project.Accounting.acc.account.service;

import com.project.Accounting.acc.account.dto.AccountCodeDto;
import com.project.Accounting.acc.account.repository.AccountRepository;
import com.project.Accounting.acc.entity.menu.account.Account;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
public class AccountServiceImpl implements AccountService{

    @Autowired
    private final AccountRepository accountRepository;
    

    @Override
    public List<AccountCodeDto> getAccountCodeNameList() {

        List<Account> accountList = accountRepository.findAll();


        List<AccountCodeDto> dto = accountList.stream()
                .filter((account -> !account.getAcctName().contains("사용자")))
                .map(AccountCodeDto::new)
                .collect(Collectors.toList());

        return dto;
    }

    @Override
    public List<AccountCodeDto> getAccountCodeBetweenId(String start, String end) {

        List<Account> accountsByIdBetween = accountRepository.findAccountsByIdBetween(start, end);

        List<AccountCodeDto> dto = accountsByIdBetween.stream()
                .filter((account -> !account.getAcctName().contains("사용자")&&account.getParentAcctInnerCode()!=null))
                .map(AccountCodeDto::new)
                .collect(Collectors.toList());

        return dto;
    }


}
