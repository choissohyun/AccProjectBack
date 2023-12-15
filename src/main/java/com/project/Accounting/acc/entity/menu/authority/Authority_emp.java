package com.project.Accounting.acc.entity.menu.authority;

import com.project.Accounting.acc.entity.menu.Employee;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Authority_emp {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authority_code")
    private Authority authority;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_code")
    private Employee employee;


    private String empName;


    private String authorityName;

}