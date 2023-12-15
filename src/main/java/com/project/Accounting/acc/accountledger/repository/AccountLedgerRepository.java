package com.project.Accounting.acc.accountledger.repository;

import com.project.Accounting.acc.entity.menu.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountLedgerRepository extends JpaRepository<Account,String> {

}
