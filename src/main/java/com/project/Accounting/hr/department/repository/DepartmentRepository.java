package com.project.Accounting.hr.department.repository;

import com.project.Accounting.acc.entity.menu.Department;
import com.project.Accounting.acc.entity.menu.DepartmentID;
import com.project.Accounting.hr.workplace.entity.Workplace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, DepartmentID> {

    List<Department> findByCompCodeAndId_Workplace_Id(String compCode, String wpCode);

}
