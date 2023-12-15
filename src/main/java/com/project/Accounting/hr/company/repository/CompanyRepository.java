package com.project.Accounting.hr.company.repository;

import com.project.Accounting.hr.company.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,String> {
}
