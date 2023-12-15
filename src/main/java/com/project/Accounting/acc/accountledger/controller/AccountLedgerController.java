package com.project.Accounting.acc.accountledger.controller;

import com.project.Accounting.acc.accountledger.dto.GeneralAccountLedgerDTO;
import com.project.Accounting.acc.accountledger.dto.LedgerByAccountDTO;
import com.project.Accounting.acc.accountledger.service.AccountLedgerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/acc/accountledger/")
@RequiredArgsConstructor
@CrossOrigin("*")
public class AccountLedgerController {

    @Autowired
    private AccountLedgerService accountLedgerService;

    //계정별원장조회
    @GetMapping( "/{accountCode}")
    public ResponseEntity<HashMap<String, Object>> getLedgerbyAccountInfo(@PathVariable String accountCode,
                                                                          @RequestParam("startDate") String startDate,
                                                                          @RequestParam("endDate") String endDate) {

        HashMap<String, Object> param = new HashMap<>();

        HashMap<String, Object> resultMap = accountLedgerService.getLedgerbyAccountInfo(accountCode, startDate, endDate);
        System.out.println("accountCode+startDate+ endDate ======================= " + accountCode + startDate + endDate);


        List<LedgerByAccountDTO> ledgerList= (List<LedgerByAccountDTO>) resultMap.get("RESULT");
        if(ledgerList.size()==0){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(param);
        }
        param.put("accountLederList", ledgerList);

        return ResponseEntity.ok(param);


    }

    //총계정원장
    @GetMapping("/accountledgerlist")
    public ResponseEntity<ArrayList<GeneralAccountLedgerDTO>> findGeneralAccountLedgerList(@RequestParam("startDate") String fromDate,
                                                                                           @RequestParam("endDate") String toDate) {

        ArrayList<GeneralAccountLedgerDTO> generalAccountLedgerList = accountLedgerService.findGeneralAccountLedgerList(fromDate, toDate);
        if (generalAccountLedgerList.size() == 0) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(generalAccountLedgerList);

    }


}
