package com.project.Accounting.hr.department.dto;

import com.project.Accounting.acc.entity.menu.Department;
import lombok.Data;

@Data
public class DepartmentDTO {
    private String deptCode;

    private String wpCode;

    private String compCode;

    private String deptEndData;

    private String deptName;

    private String deptStartDate;

    private String wpName;

    public DepartmentDTO(Department department) {
        this.deptCode = department.getId().getDeptCode();
        this.wpCode = department.getId().getWorkplace().getId();
        this.compCode = department.getCompCode();
        this.deptEndData = department.getDeptEndDate();
        this.deptName = department.getDeptName();
        this.deptStartDate = department.getDeptStartDate();
        this.wpName = department.getWpName();
    }
}
