package com.project.Accounting.acc.account.repository;

import com.project.Accounting.acc.entity.menu.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account,String> {


    List<Account> findAccountsByAcctName(String acctName);

    List<Account> findAccountsByIdBetween(String start, String end);

}
