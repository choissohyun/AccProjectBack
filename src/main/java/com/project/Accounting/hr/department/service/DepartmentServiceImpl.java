package com.project.Accounting.hr.department.service;

import com.project.Accounting.acc.account.dto.AccountCodeDto;
import com.project.Accounting.acc.entity.menu.Department;
import com.project.Accounting.hr.department.dto.DepartmentDTO;
import com.project.Accounting.hr.department.repository.DepartmentRepository;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public List<DepartmentDTO> getDepartment(String compCode, String wpCode) {
        List<Department> departments = departmentRepository.findByCompCodeAndId_Workplace_Id(compCode,wpCode);


        List<DepartmentDTO> departmentDTOS = departments.stream().map(DepartmentDTO::new).collect(Collectors.toList());




        return departmentDTOS;
    }
}
