package com.project.Accounting.hr.workplace.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.project.Accounting.acc.entity.menu.Customer;
import com.project.Accounting.acc.entity.menu.Department;
import com.project.Accounting.acc.entity.menu.Employee;
import com.project.Accounting.acc.entity.menu.Position;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Workplace implements Serializable {

    @Id
    @Column(name = "WP_CODE")
    private String id;



//    @OneToMany(mappedBy = "workplace")
//    private List<Employee> employees;

//    @OneToMany(mappedBy = "workplace")
//    private List<Customer> customers;

//    @OneToMany(mappedBy = "workplace")
//    private List<Position> positions;


//    @OneToMany(mappedBy = "id.workplace", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Budget> budgetingList;

//    @OneToMany(mappedBy = "id.workplace", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Menu_available_by_position> menuAvailableByPosition;

//    @OneToMany(mappedBy = "id.workplace", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Department> departmentid;

    private String compCode;


    private String wpName;

    private String businessLicenseNumber;

    private String corporationLicense;
    private String wpCeoName;
    private String wpBusinessConditions;
    private String wpBusinessItems;
    private String wpZipCode;
    private String wp_basicAddress;
    private String wpDetailAddress;

    private String wpTelNumber;

    private String wpFaxNumber;

    private String wpEstablishDate;


    private String wpOpenDate;


    private String wpCloseDate;


    private String wpEstablishTime;

//    @Enumerated(EnumType.STRING)
//    private Approval_status approvalStatus;

    private String approvalStatus;

}
