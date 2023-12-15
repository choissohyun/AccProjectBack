package com.project.Accounting.acc.customer.repository;

import com.project.Accounting.acc.customer.dto.CustomerFindDTO;
import com.project.Accounting.acc.entity.menu.Customer;
import com.project.Accounting.acc.entity.menu.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {
    List<Customer> findCustomersByWpCode(String wpCode);


}
