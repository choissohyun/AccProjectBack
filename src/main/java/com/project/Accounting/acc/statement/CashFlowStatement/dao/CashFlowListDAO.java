package com.project.Accounting.acc.statement.CashFlowStatement.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;


@Mapper
public interface CashFlowListDAO {

    HashMap<String, Object> callCashFlowList(HashMap<String, Object> param);
}
