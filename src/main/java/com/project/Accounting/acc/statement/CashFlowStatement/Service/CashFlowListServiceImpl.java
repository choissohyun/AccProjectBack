package com.project.Accounting.acc.statement.CashFlowStatement.Service;


import com.project.Accounting.acc.statement.CashFlowStatement.dao.CashFlowListDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CashFlowListServiceImpl implements CashFlowListService{

    @Autowired
    private CashFlowListDAO cashFlowListDAO;


    @Override
    public HashMap<String, Object> getCashFlowList(String toDate){
        HashMap<String, Object> param = new HashMap<>();
        param.put("toDate", toDate);
       cashFlowListDAO.callCashFlowList(param);
        System.out.println("param =========== " + param);
        return param;
    }

}
