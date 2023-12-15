package com.project.Accounting.hr.company.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Company {

    @Id
    @Column(name = "comp_code")
    private String id;

    private String compName;

    private String compDivision;

    private String businessLicenseNumber;

    private String corporationLicense;

    private String compCeoName;

    private String compBusinessConditions;

    private String compBusinessItems;

    private String compZipCode;

    private String compBasicAddress;

    private String compDetailAddress;

    private String compTelNumber;

    private String compFaxNumber;

    private String compEstablishmentDate;

    private String compOpenDate;

    private String homepage;

}
