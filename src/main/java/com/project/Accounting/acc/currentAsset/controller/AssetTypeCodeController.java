package com.project.Accounting.acc.currentAsset.controller;

import com.project.Accounting.acc.currentAsset.service.AssetTypeCodeService;
import com.project.Accounting.acc.entity.menu.account.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
@RequestMapping("/acc/currentAsset")
public class AssetTypeCodeController {

    @Autowired
    private AssetTypeCodeService assetTypeCodeService;

    @GetMapping("/assetTypeCode")
    public List<Account> getAllList() {
        List<Account> list = assetTypeCodeService.findAll();
        return list;
    }
}
