package com.project.Accounting.acc.currentAsset.service;

import com.project.Accounting.acc.entity.menu.curAsset.CurAsset;

import java.util.List;

public interface CurAssetService {

    List<CurAsset> findAll();

    List<CurAsset> getCurAssetByAssetName(String assetName);

    void saveAsset(CurAsset asset);

    List<CurAsset> getCurAssetByDepartment(String department);

    List<CurAsset> getCurAssetByProgress(String progress);

    List<CurAsset> getCurAssetByAcctCode(String acctCode);
}
