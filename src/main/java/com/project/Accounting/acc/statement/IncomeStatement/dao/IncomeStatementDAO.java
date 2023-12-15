package com.project.Accounting.acc.statement.IncomeStatement.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface IncomeStatementDAO {
    public HashMap<String, Object> callIncomeStatement(HashMap<String, Object> param);

}
