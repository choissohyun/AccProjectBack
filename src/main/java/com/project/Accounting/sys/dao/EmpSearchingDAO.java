package com.project.Accounting.sys.dao;

import com.project.Accounting.sys.to.LoginResultTo;
import com.project.Accounting.sys.to.LoginTo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface EmpSearchingDAO {
    public LoginResultTo getLoginTo(LoginTo loginTo);
}
