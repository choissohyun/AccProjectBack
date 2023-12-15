package com.project.Accounting.acc.account.controller;

import com.project.Accounting.acc.account.dto.AccountCodeDto;
import com.project.Accounting.acc.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/acc/account/")
@RequiredArgsConstructor
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/accountList")
    public ResponseEntity<Map<String, Object>> getAccountCodeNameList() {
        Map<String,Object> map = new HashMap<>();

        List<AccountCodeDto> accountList = accountService.getAccountCodeNameList();

        if(accountList.size() == 0)
            return ResponseEntity.notFound().build();


        map.put("accountList",accountList);

        return ResponseEntity.ok(map);

    }


    @GetMapping("/between")
    public ResponseEntity<Map<String, Object>> getAccountBetweenId(@RequestParam String start,@RequestParam String end) {
        Map<String,Object> map = new HashMap<>();

        List<AccountCodeDto> accountList = accountService.getAccountCodeBetweenId(start,end);

        if(accountList.size() == 0)
            return ResponseEntity.notFound().build();


        map.put("accountList",accountList);

        return ResponseEntity.ok(map);

    }


}
