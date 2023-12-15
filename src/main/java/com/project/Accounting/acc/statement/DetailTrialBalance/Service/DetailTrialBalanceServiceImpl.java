package com.project.Accounting.acc.statement.DetailTrialBalance.Service;

import com.project.Accounting.acc.statement.DetailTrialBalance.dao.DetailTrialBalanceDAO;
import com.project.Accounting.acc.statement.DetailTrialBalance.dto.DetailTrialBalanceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class DetailTrialBalanceServiceImpl implements DetailTrialBalanceService{

    @Autowired
    private DetailTrialBalanceDAO detailTrialBalanceDAO;
    @Override
    public ArrayList<DetailTrialBalanceDTO> getDetailTrialBalance(String fromDate, String toDate) {
        HashMap<String, String> param = new HashMap<>();
        param.put("fromDate", fromDate);
        param.put("toDate", toDate);
        return detailTrialBalanceDAO.selectDetailTrialBalance(param);
    }
}
