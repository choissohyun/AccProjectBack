package com.project.Accounting.hr.company.service;

import com.project.Accounting.hr.company.entity.Company;
import com.project.Accounting.hr.company.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceFacadeImpl implements CompanyServiceFacade{

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> getCompanyList() {
        List<Company> companyList = companyRepository.findAll();
        return companyList;
    }
}
