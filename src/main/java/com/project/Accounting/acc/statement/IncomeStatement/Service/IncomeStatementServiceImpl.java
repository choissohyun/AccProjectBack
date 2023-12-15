package com.project.Accounting.acc.statement.IncomeStatement.Service;

import com.project.Accounting.acc.statement.IncomeStatement.dao.IncomeStatementDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class IncomeStatementServiceImpl implements IncomeStatementService{

    @Autowired
    private IncomeStatementDAO incomeStatementDAO;


    //소현 누나꺼
    @Override
    public HashMap<String, Object> getIncomeStatement(String toDate) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("toDate", toDate);
        incomeStatementDAO.callIncomeStatement(param);
        return param;
    }


    //도윤햄꺼
//    @Override
//    public HashMap<String, Object> getIncomeStatement(String searchDate){
//        HashMap<String, Object> param = new HashMap<>();
//        param.put("toDate", searchDate);
//        incomeStatementDAO.callIncomeStatement(param);
//        return param;
//    }
}
