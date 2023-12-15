package com.project.Accounting.acc.statement.IncomeStatement.Controllor;


import com.project.Accounting.acc.statement.IncomeStatement.Service.IncomeStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;

@CrossOrigin("*")
@RestController
@RequestMapping("/acc/statement")
public class IncomeStatementController {
    @Autowired
    private IncomeStatementService incomeStatementService;

    //소현 누나꺼
    @GetMapping("incomeStatements")
    public ResponseEntity<HashMap<String, Object>> getIncomeStatement(@RequestParam("searchDate") String toDate){
        HashMap<String, Object> param = new HashMap<>();
        try{
            HashMap<String, Object> result = incomeStatementService.getIncomeStatement(toDate);
            param.put("incomeList",result.get("RESULT"));
            return ResponseEntity.ok(param);

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }

    }

    // 도윤햄꺼
//    @GetMapping("/incomeStatements2")
//    public ResponseEntity<HashMap<String, Object>> getIncomeStatements(@RequestParam String searchDate){
//        HashMap<String, Object> param = new HashMap<>();
//        System.out.println("손익계산서 "+ searchDate);
//        try{
//            HashMap<String, Object> resultMap = incomeStatementService.getIncomeStatement(searchDate);
//            ArrayList<IncomeStatementDTO> result= (ArrayList<IncomeStatementDTO>)resultMap.get("RESULT");
//            param.put("incomeList", result);
//            return ResponseEntity.ok(param);
//        }catch (Exception ex){
//            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//
//        }
//    }


}
