package com.project.Accounting.acc.currentAsset.repository;

import com.project.Accounting.acc.entity.menu.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AssetTypeCodeRepository extends JpaRepository<Account, String> {

    @Query(value = "select a from Account a " +
            "where a.groupCode = '2.비유동자산' " +
            "and a.acctName != '사용자설정계정과목' " +
            "and a.acctName != '감가상각누계액' ")
    List<Account> findAll();

}
