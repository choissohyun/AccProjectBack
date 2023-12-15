package com.project.Accounting.acc.entity.menu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.Accounting.hr.workplace.entity.Workplace;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class DepartmentID implements Serializable {


    @Column(name = "dept_code")
    private String deptCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WP_CODE")
    private Workplace workplace;

}