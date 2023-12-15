package com.project.Accounting.acc.customer.dto;

import com.project.Accounting.acc.entity.menu.Customer;
import com.project.Accounting.acc.entity.menu.account.Account;
import lombok.Data;

@Data
public class CustomerCodeDto {

    private String customerCode;

    private String customerName;

    public CustomerCodeDto(Customer customer) {
        this.customerCode = customer.getId();
        this.customerName = customer.getCterName();
    }
}
