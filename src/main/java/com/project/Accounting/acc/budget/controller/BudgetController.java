package com.project.Accounting.acc.budget.controller;


import com.project.Accounting.acc.budget.dto.BudgetDto;
import com.project.Accounting.acc.budget.service.BudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;


@RestController
@RequestMapping("/acc/budget/")
@RequiredArgsConstructor
@CrossOrigin("*")
public class BudgetController {

    @Autowired
    private BudgetService budgetService;


    @GetMapping("/pybudgetstatus")
    public ResponseEntity<HashMap<String, Object>> getPreviousYearBudgetStatus(@RequestParam String deptCode,
                                                                                              @RequestParam String reportDate,
                                                                                              @RequestParam String acctInnerCode){

        HashMap<String, Object> previousYearBudgetStatus = budgetService.getPreviousYearBudgetStatus(deptCode, reportDate, acctInnerCode);


        if(previousYearBudgetStatus.size() == 0){
            ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(previousYearBudgetStatus);
    }

    @PostMapping("/saveBudget")
    public void saveBudget(@RequestBody BudgetDto budgetDto){
        System.out.println("budgetDto ==================== " + budgetDto);
        budgetService.saveBudget(budgetDto);
    }
}
