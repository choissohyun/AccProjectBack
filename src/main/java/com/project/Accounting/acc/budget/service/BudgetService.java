package com.project.Accounting.acc.budget.service;

import com.project.Accounting.acc.budget.dto.BudgetDto;


import java.util.HashMap;



public interface BudgetService {


    HashMap<String, Object> getPreviousYearBudgetStatus(String deptCode,
                                                        String reportDate,
                                                        String acctInnerCode);
    void saveBudget(BudgetDto budgetDto);
}
