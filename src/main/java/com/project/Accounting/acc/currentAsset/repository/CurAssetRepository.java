package com.project.Accounting.acc.currentAsset.repository;

import com.project.Accounting.acc.entity.menu.curAsset.CurAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurAssetRepository extends JpaRepository<CurAsset, String> {
    List<CurAsset> findAll();

    List<CurAsset> findCurAssetByAssetName(String assetName);

    List<CurAsset> findCurAssetByDepartment(String department);

    List<CurAsset> findCurAssetByProgress(String progress);

    List<CurAsset> findCurAssetByAcctCode(String acctCode);
}
