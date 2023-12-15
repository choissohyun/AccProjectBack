package com.project.Accounting.acc.entity.menu;

import com.project.Accounting.hr.workplace.entity.Workplace;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @Column(name = "cter_code")
    @Schema(description = "고객코드")
    private String id;
    private String wpCode;

//    @OneToMany(mappedBy = "customer")
//    private List<Journal> journals;


    private String cterName;

    private String cterType;

    private String cterCeo;

    private String businessLicenseNumber;

    private String socialSecurityNumber;

    private String cterBusinessConditions;


    private String cterBusinessItems;

    private String cterZipCode;


    private String cterBasicAddress;


    private String cterDetailAddress;


    private String cterTelNumber;


    private String cterFaxNumber;


    private String cterNote;


    private String acctNumber;


    private String cardNumber;


    private String cardType;


    private String cardMemberName;


    private String cardOpenPlace;

    private String finclInstitutionCode;


    private String finclInstitutionName;


}
