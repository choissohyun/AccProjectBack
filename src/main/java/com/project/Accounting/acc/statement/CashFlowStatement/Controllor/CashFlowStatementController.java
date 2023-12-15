package com.project.Accounting.acc.statement.CashFlowStatement.Controllor;

import java.util.HashMap;

import com.project.Accounting.acc.statement.CashFlowStatement.Service.CashFlowListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
@RequestMapping("/acc/statement")
public class CashFlowStatementController {

    @Autowired
    private CashFlowListService cashFlowListService;

    @GetMapping( "/cashFlowStatements")
    public ResponseEntity<HashMap<String, Object>> getCashFlowList(@RequestParam("searchDate") String toDate) {

        HashMap<String, Object> param = new HashMap<>();
        try {

            HashMap<String, Object> resultMap = cashFlowListService.getCashFlowList(toDate);
            System.out.println("resultMap: " + resultMap);
            param.put("cashFlowList",resultMap.get("RESULT"));
            return ResponseEntity.ok(param);

        } catch (Exception e) {
            return	ResponseEntity.noContent().build();
        }

    }
}
