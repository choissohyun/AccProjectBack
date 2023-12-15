package com.project.Accounting.acc.statement.MonthIncomeStatement.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface MonthIncomeStatementDAO {
    HashMap<String, Object> callMonthIncomeStatement(HashMap<String, Object> param);
}
