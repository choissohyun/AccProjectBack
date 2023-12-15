package com.project.Accounting.acc.customer.service;

import com.project.Accounting.acc.customer.dto.CustomerCodeDto;
import com.project.Accounting.acc.customer.dto.CustomerFindDTO;
import com.project.Accounting.acc.entity.menu.Customer;

import java.util.List;

public interface CustomerService {
    List<CustomerCodeDto> getCustomerCodes(String wpCode);

    List<CustomerFindDTO> getCustomers();

    void saveCustomers(Customer customer);

    void deleteCustomer(String id);

    void updateCustomers(Customer customer);
}
