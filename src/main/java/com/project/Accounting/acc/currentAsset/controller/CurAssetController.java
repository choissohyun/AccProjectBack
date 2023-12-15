package com.project.Accounting.acc.currentAsset.controller;

import com.project.Accounting.acc.currentAsset.service.CurAssetService;
import com.project.Accounting.acc.entity.menu.curAsset.CurAsset;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/acc/currentAsset")
@RequiredArgsConstructor
public class CurAssetController {

    @Autowired
    private CurAssetService curAssetService;

    @GetMapping("/assetList")
    public List<CurAsset> getAllList() {
        List<CurAsset> list = curAssetService.findAll();
        return list;
    }

    @GetMapping("/findAssetName")
    public List<CurAsset> getCurAssetName(@RequestParam String assetName) {
        List<CurAsset> list = curAssetService.getCurAssetByAssetName(assetName);
        return list;
    }

    @PostMapping("/saveAsset")
    public void saveAsset(@RequestBody CurAsset asset){
        System.out.println("S"+asset);
        curAssetService.saveAsset(asset);
    }

    @GetMapping("/findDepartment")
    public List<CurAsset> getDepartment(@RequestParam String department){
        List<CurAsset> dept = curAssetService.getCurAssetByDepartment(department);
        return dept;
    }

    @GetMapping("/findProgress")
    public List<CurAsset> getProgress(@RequestParam String progress){
        List<CurAsset> prog= curAssetService.getCurAssetByProgress(progress);
        return prog;
    }

    @GetMapping("/findAcctCode")
    public List<CurAsset> getAcctCode(@RequestParam String acctCode){
        List<CurAsset> acode = curAssetService.getCurAssetByAcctCode(acctCode);
        return acode;
    }

}
