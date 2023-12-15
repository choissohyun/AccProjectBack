package com.project.Accounting.acc.accountControlCode.service;

import com.project.Accounting.acc.accountControlCode.repository.AccountControlCodeRepository;
import com.project.Accounting.acc.entity.menu.account.AccountControlCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountControlCodeService {


    List<AccountControlCode> getAccountControlCodeList();


}
