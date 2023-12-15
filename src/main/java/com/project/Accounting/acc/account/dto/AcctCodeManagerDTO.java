package com.project.Accounting.acc.account.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class AcctCodeManagerDTO {

    private String acctLevel;
    private String leaf;
    private String acctInnerCode;
    private String parentAcctInnerCode;
    private String acctCode;
    private String acctCharacter;
    private String acctName;
    private String acctDisplayNameWithCode;
    private String acctDisplayName;
    private String acctDivision;
    private String acctUseCheck;
    private String acctDescription;
    private String groupCode;

}
