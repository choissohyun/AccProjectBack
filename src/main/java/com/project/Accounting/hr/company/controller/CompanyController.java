package com.project.Accounting.hr.company.controller;

import com.project.Accounting.hr.company.entity.Company;
import com.project.Accounting.hr.company.repository.CompanyRepository;
import com.project.Accounting.hr.company.service.CompanyServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/hr/company/*")
@CrossOrigin("*")
public class CompanyController {

    @Autowired
    private CompanyServiceFacade companyServiceFacade;


    @GetMapping( "/searchCompany")
    public ResponseEntity< List<Company>> getCompanyList() {


        List<Company> companyList = companyServiceFacade.getCompanyList();
        if (companyList.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Collections.emptyList());
        }

        System.out.println("날라가는데이터"+companyList.get(0).getId());
        return ResponseEntity.ok(companyList);
    }
}
