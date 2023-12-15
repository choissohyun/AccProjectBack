package com.project.Accounting.acc.statement.CostStatement.Controllor;

import com.project.Accounting.acc.statement.CostStatement.Service.CostStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@CrossOrigin("*")
@RestController
@RequestMapping("/acc/statement")
public class CostStatementController {

    @Autowired
    private CostStatementService CostStatementService;

    @GetMapping("costStatements")
    public ResponseEntity<HashMap<String, Object>> getCostStatement(@RequestParam("searchDate") String toDate) {
        HashMap<String, Object> param = new HashMap<>();
        try {
            HashMap<String, Object> result = CostStatementService.getCostStatement(toDate);
            param.put("costList", result.get("RESULT"));
            return  ResponseEntity.ok(param);

        } catch (Exception e) {
            return ResponseEntity.noContent().build();
        }
    }
}
