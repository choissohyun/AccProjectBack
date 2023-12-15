package com.project.Accounting.hr.department.service;

import com.project.Accounting.acc.entity.menu.Department;
import com.project.Accounting.hr.department.dto.DepartmentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    List<DepartmentDTO> getDepartment(String compCode, String wpCode);
}
