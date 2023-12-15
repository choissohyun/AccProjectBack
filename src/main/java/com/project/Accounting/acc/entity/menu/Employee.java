package com.project.Accounting.acc.entity.menu;

import com.project.Accounting.hr.workplace.entity.Workplace;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @Column(name ="emp_code")
    private String id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Department department;

    private String empName;

    private String compCode;

    private String positionCode;

    private String socialSecurityNumber;

    private String birthDate;

    private String gender;

    private String email;

    private String phoneNumber;

    private String image;

    private String userPw;

    private String zipCode;

    private String basicAddress;

    private String detailAddress;

    private String levelOfEducation;

    private String userOrNot;

    private String positionName;

    private String authorityLevel;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name= "wp_code", insertable=false, updatable=false)
//    private Workplace workplace;
}
