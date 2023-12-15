package com.project.Accounting.acc.budget.service;

import com.project.Accounting.acc.budget.dao.BudgetDAO;
import com.project.Accounting.acc.budget.dto.BudgetDto;



import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;


@Service
@Data
public class BudgetServiceImpl implements BudgetService {

//    @Autowired
//    private final BudgetRepository budgetRepository;

    @Autowired
    private final BudgetDAO budgetDAO;


    @Override
    public HashMap<String, Object> getPreviousYearBudgetStatus(String deptCode,
                                               String reportDate,
                                               String acctInnerCode) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("deptCode", deptCode);
        map.put("reportDate", reportDate);
        map.put("acctInnerCode", acctInnerCode);

        budgetDAO.getPreviousYearBudgetStatus(map);

        return map;
    }

    @Override
    public void saveBudget(BudgetDto budgetDto) {
        budgetDAO.saveBudget(budgetDto);
    }


}
