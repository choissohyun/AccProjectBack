package com.project.Accounting.acc.statement.TotalTrialBalance.Service;

import com.project.Accounting.acc.statement.TotalTrialBalance.dao.TotalTrialBalanceDAO;
import com.project.Accounting.acc.statement.TotalTrialBalance.dto.TotalTrialBalanceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class TotalTrialServiceImpl implements TotalTrialService{

    @Autowired
    private TotalTrialBalanceDAO totalTrialBalanceDAO;


    @Override
    public HashMap<String, Object> getTotalTrialBalance(String toDate) {
        HashMap<String, Object> param = new HashMap<>();
        param.put("toDate", toDate);
        List<TotalTrialBalanceDTO> bb=totalTrialBalanceDAO.callTotalTrialBalance(param);
        System.out.println("해시맵 확인 "+ bb);
        System.out.println("파람파람" + param);
        return param;
    }
}
