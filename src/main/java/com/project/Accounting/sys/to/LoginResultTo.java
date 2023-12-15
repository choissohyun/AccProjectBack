package com.project.Accounting.sys.to;

import lombok.Data;

@Data
public class LoginResultTo {

    private String compCode;

    private String wpCode;

    private String empCode;

    private String userId;

    private String userPassword;

    private String authorityCode;
}
