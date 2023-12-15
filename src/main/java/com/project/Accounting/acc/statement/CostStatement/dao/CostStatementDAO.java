package com.project.Accounting.acc.statement.CostStatement.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface CostStatementDAO {
    HashMap<String, Object> callCostStatement(HashMap<String, Object> param);
}
