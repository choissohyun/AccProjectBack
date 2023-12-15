package com.project.Accounting.acc.statement.DetailTrialBalance.Controllor;

import com.project.Accounting.acc.statement.DetailTrialBalance.dto.DetailTrialBalanceDTO;
import com.project.Accounting.acc.statement.DetailTrialBalance.Service.DetailTrialBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@CrossOrigin("*")
@RestController
@RequestMapping("/acc/statement")
public class DetailTrialBalanceController {

    @Autowired
    private DetailTrialBalanceService detailTrialBalanceService;

    @GetMapping("/detailTrialBalances")
    public ResponseEntity<HashMap<String, Object>> handleRequestInternal(
            @RequestParam("startDate")String fromDate
            ,@RequestParam("endDate")String toDate) {
        HashMap<String, Object> param = new HashMap<>();
        ArrayList<DetailTrialBalanceDTO> detailTrialBalanceList = detailTrialBalanceService.getDetailTrialBalance(fromDate, toDate);

        if(detailTrialBalanceList.size()==0){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(param);
        }
        param.put("detailTrialBalanceList", detailTrialBalanceList);
        return ResponseEntity.ok(param);
    }

}
