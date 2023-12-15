package com.project.Accounting.acc.accountControlCode.controller;

import com.project.Accounting.acc.accountControlCode.service.AccountControlCodeService;
import com.project.Accounting.acc.entity.menu.account.AccountControlCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/account/control/")
public class AccountControlCodeController {

    @Autowired
    private AccountControlCodeService accountControlCodeService;

    Map<String, List<AccountControlCode>> map = new HashMap<String, List<AccountControlCode>>();

    @GetMapping("list")
    public ResponseEntity<Map<String, List<AccountControlCode>>> getAccountCodeDetail(){

        List<AccountControlCode> accountControlCodeList = accountControlCodeService.getAccountControlCodeList();

        if(accountControlCodeList.isEmpty())
            return ResponseEntity.noContent().build();

            map.put("accountControlCodeList",accountControlCodeList);

        return ResponseEntity.ok(map);

    }

}
