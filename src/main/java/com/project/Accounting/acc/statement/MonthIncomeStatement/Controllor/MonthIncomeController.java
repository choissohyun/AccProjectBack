package com.project.Accounting.acc.statement.MonthIncomeStatement.Controllor;

import com.project.Accounting.acc.statement.MonthIncomeStatement.Service.MonthIncomeStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@CrossOrigin("*")
@RestController
@RequestMapping("/acc/statement")
public class MonthIncomeController {

    @Autowired
    private MonthIncomeStatementService monthIncomeStatementService;

    @GetMapping(value = "/monthIncomeStatements")
    public ResponseEntity<HashMap<String, Object>> getMonthIncomeStatement(@RequestParam("searchDate") String toDate) {

        System.out.println("============월별손익계산서===============");
        HashMap<String, Object> param = new HashMap<>();
        try {

            param = monthIncomeStatementService.getMonthIncomeStatement(toDate);
            param.put("monthIncomeList", param.get("RESULT"));
            return ResponseEntity.ok(param);


        } catch (Exception e) {
            param.put("errorCode", -1);
            param.put("errorMsg", e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

}
