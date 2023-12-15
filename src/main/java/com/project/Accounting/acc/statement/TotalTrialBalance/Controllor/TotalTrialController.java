package com.project.Accounting.acc.statement.TotalTrialBalance.Controllor;

import com.project.Accounting.acc.statement.TotalTrialBalance.dto.TotalTrialBalanceDTO;
import com.project.Accounting.acc.statement.TotalTrialBalance.Service.TotalTrialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;



@RequestMapping("/acc/statement")
@RestController
@CrossOrigin("*")
public class TotalTrialController {
    @Autowired
    private TotalTrialService totalTrialService;

    @GetMapping("/totaltrialbalances")
    public ResponseEntity<HashMap<String, Object>> getTotalTrialBalance(@RequestParam("searchDate") String toDate) {

        HashMap<String, Object> param = new HashMap<>();
        try{
            HashMap<String, Object> resultMap = totalTrialService.getTotalTrialBalance(toDate);
            ArrayList<TotalTrialBalanceDTO> result= (ArrayList<TotalTrialBalanceDTO>)resultMap.get("RESULT");
            param.put("totaltrialList", result);
            return ResponseEntity.ok(param);
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

        }


    }
}
