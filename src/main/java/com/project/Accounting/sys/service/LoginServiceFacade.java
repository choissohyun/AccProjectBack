package com.project.Accounting.sys.service;

import com.project.Accounting.sys.to.LoginResultTo;
import com.project.Accounting.sys.to.LoginTo;

public interface LoginServiceFacade {
    LoginResultTo getLogin(LoginTo loginTo);
}
