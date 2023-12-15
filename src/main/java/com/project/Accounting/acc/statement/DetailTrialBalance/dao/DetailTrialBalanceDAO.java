package com.project.Accounting.acc.statement.DetailTrialBalance.dao;

import com.project.Accounting.acc.statement.DetailTrialBalance.dto.DetailTrialBalanceDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface DetailTrialBalanceDAO {
    ArrayList<DetailTrialBalanceDTO> selectDetailTrialBalance(HashMap<String, String> param);
}
