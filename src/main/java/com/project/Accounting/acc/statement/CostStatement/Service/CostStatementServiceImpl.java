package com.project.Accounting.acc.statement.CostStatement.Service;

import com.project.Accounting.acc.statement.CostStatement.dao.CostStatementDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CostStatementServiceImpl implements CostStatementService {
    @Autowired
    private CostStatementDAO CostStatementDAO;

    @Override
    public HashMap<String, Object> getCostStatement(String toDate) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("toDate", toDate);
        CostStatementDAO.callCostStatement(param);
        System.out.println("원가보고서되는건가  = " + param);
        return param;
    }
}
