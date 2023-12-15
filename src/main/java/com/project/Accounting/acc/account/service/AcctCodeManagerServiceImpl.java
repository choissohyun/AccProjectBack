package com.project.Accounting.acc.account.service;

import com.project.Accounting.acc.account.dao.AcctCodeManagerDAO;
import com.project.Accounting.acc.account.dto.AcctCodeManagerDTO;
import com.project.Accounting.acc.account.repository.AccountRepository;
import com.project.Accounting.acc.entity.menu.account.Account;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AcctCodeManagerServiceImpl implements AcctCodeManagerService {

    @Autowired
    private AcctCodeManagerDAO accountSubjectDAO;
    @Autowired
    private AccountRepository accountRepository;


    @Override
    public List<AcctCodeManagerDTO> getAccountCodeList() {
        return accountSubjectDAO.getAccountCodeList();

    }

    @Override
    public void deleteAccount(String id) {
        accountRepository.deleteById(id);
    }

    @Override
    public void saveAccount(AcctCodeManagerDTO acctCodeManagerDTO) {

        Account account = new Account(acctCodeManagerDTO);

        accountRepository.save(account);

    }


}
