package com.project.Accounting.acc.currentAsset.service;

import com.project.Accounting.acc.currentAsset.repository.AssetTypeCodeRepository;
import com.project.Accounting.acc.entity.menu.account.Account;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class AssetTypeCodeServiceImpl implements AssetTypeCodeService {
   @Autowired
    private final AssetTypeCodeRepository assetTypeCodeRepository;

    @Override
    public List<Account> findAll() {
        List<Account> assetTypeCode = assetTypeCodeRepository.findAll();
        return assetTypeCode;
    }
}
