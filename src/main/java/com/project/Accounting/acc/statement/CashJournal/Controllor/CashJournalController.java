package com.project.Accounting.acc.statement.CashJournal.Controllor;

import com.project.Accounting.acc.statement.CashJournal.dto.CashJournalDTO;
import com.project.Accounting.acc.statement.CashJournal.Service.CashJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@CrossOrigin("*")
@RestController
@RequestMapping("/acc/statement")
public class CashJournalController {
    @Autowired
    private CashJournalService cashJournalService;

    @GetMapping("/cashJournals")
    public ResponseEntity<HashMap<String, Object>>  getCashJournals(
            @RequestParam ("startDate") String fromDate,
            @RequestParam("endDate") String toDate){
        HashMap<String, Object> param = new HashMap<>();
        ArrayList<CashJournalDTO> cashJournal = cashJournalService.getCashJournal(fromDate, toDate);

        if(cashJournal.size()==2){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(param);
        }
        param.put("cashJournalList",cashJournal);

        return ResponseEntity.ok(param);
    }
}
