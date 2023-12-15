package com.project.Accounting.acc.entity.menu.curAsset;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CurAsset {
    @Id
    @Column(name = "ASSET_CODE")
    private String assetCode;
    private String acctCode;
    private String acctName;
    private String assetName;
    private String progress;
    private String finalizeStatus;
    private String workplace;
    private String department;
    private String usefullife;
    private String acqQuantity;
    private String chanQuantity;
    private String remanQuantity;
    private String amorWay;
    private String acqCost;
    private String residValue;
    private String amorRate;
    private String month;
    private String amorFinYear;
    private String depExpense;
    private String valuToBook;
    private String accDepLastYear;
    private String lastYearBookValue;
    private String accDepThisYear;
    private String thisYearBookValue;


}
