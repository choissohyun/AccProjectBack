package com.project.Accounting.sys.service;

import com.project.Accounting.sys.dao.EmpSearchingDAO;
import com.project.Accounting.sys.to.LoginResultTo;
import com.project.Accounting.sys.to.LoginTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceFacadeImpl implements LoginServiceFacade{

    @Autowired
    private EmpSearchingDAO empSearchingDAO;

    @Override
    public LoginResultTo getLogin(LoginTo loginTo) {

        LoginResultTo loginResultTo = empSearchingDAO.getLoginTo(loginTo);

        return loginResultTo;
    }
}
