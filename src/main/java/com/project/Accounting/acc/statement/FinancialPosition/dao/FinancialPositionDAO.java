package com.project.Accounting.acc.statement.FinancialPosition.dao;

import com.project.Accounting.acc.statement.FinancialPosition.dto.FinancialPositionDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface FinancialPositionDAO {
    ArrayList<FinancialPositionDTO> callFinancialPosition(HashMap<String,Object> param);

}
