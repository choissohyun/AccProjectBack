package com.project.Accounting.acc.statement.FinancialPosition.Controllor;

import com.project.Accounting.acc.statement.FinancialPosition.Service.FinancialPositionService;
import com.project.Accounting.acc.statement.FinancialPosition.dto.FinancialPositionDTO;
import com.project.Accounting.acc.statement.TotalTrialBalance.dto.TotalTrialBalanceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;


@RequestMapping("/acc/statement")
@RestController
@CrossOrigin("*")
public class FinancialPositionController {
    @Autowired
    private FinancialPositionService financialPositionService;

    @GetMapping("/financialPositions")
    public ResponseEntity<HashMap<String, Object>> getFinancialPosition(@RequestParam("searchDate") String toDate) {

        System.out.println(".컨트롤러 날짜"+toDate);

        HashMap<String, Object> param = new HashMap<>();
        try{
            param = financialPositionService.getFinancialPosition(toDate);

            ArrayList<FinancialPositionDTO> result= (ArrayList<FinancialPositionDTO>)param.get("RESULT");
            param.put("financialPositions",result);
            return ResponseEntity.ok(param);
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

        }


    }

//    @GetMapping("/financialPositions")
//    public ResponseEntity<HashMap<String, Object>> callFinancialPosition(
//            @RequestParam("searchDate") String toDate) {
//        HashMap<String, Object> param = new HashMap<>();
//        try {
//            HashMap<String, Object>  result= financialPositionService.callFinancialPosition(toDate);
//            param.put("costList", result.get("RESULT"));
//                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(param);
//            } catch(Exception ex){
//                return ResponseEntity.noContent().build();
//            }
//        }
//    }


}
