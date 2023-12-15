package com.project.Accounting.acc.account.controller;

import com.project.Accounting.acc.account.dto.AcctCodeManagerDTO;
import com.project.Accounting.acc.account.service.AcctCodeManagerService;
import com.project.Accounting.acc.entity.menu.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@CrossOrigin("*")
@RestController
@RequestMapping("/acc/account")
public class AcctCodeManagerController {

    @Autowired
    private AcctCodeManagerService acctCodeManagerService;

    //계정과목관리
    @GetMapping( "/accountCodes")
    public HashMap<String, Object> getAccountList() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("accountCodeList", acctCodeManagerService.getAccountCodeList());
        return map;
    }

    //계정과목삭제
    @DeleteMapping("/{accountInnerCode}")
    public void deleteAccount(@PathVariable("accountInnerCode") String id){
        System.out.println("계정과목삭제 ======== " + id);
        acctCodeManagerService.deleteAccount(id);
    }

    //계정과목등록
    @PostMapping("/accountCodes")
    public void saveAccount(@RequestBody AcctCodeManagerDTO account){
        System.out.println("계정과목등록 ======== " + account);
        acctCodeManagerService.saveAccount(account);
    }



}
