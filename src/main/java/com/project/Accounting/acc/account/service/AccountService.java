package com.project.Accounting.acc.account.service;

import com.project.Accounting.acc.account.dto.AccountCodeDto;


import java.util.List;

public interface AccountService {
    List<AccountCodeDto> getAccountCodeNameList();

    List<AccountCodeDto> getAccountCodeBetweenId(String start, String end);


}
