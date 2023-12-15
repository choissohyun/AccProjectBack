package com.project.Accounting.acc.budget.dao;

import com.project.Accounting.acc.budget.dto.BudgetDto;
import com.project.Accounting.acc.budget.dto.DeptCodeDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.HashMap;
import java.util.List;

@Mapper
public interface BudgetDAO {
    HashMap<String, Object> getPreviousYearBudgetStatus(HashMap<String, Object> map); //예산신청입력 전기 데이터 불러오기

    void saveBudget(BudgetDto budgetDto);
}
