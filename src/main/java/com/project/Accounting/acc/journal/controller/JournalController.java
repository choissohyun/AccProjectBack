package com.project.Accounting.acc.journal.controller;

import com.project.Accounting.acc.entity.menu.journal.Journal;
import com.project.Accounting.acc.journal.dto.JournalDTO;
import com.project.Accounting.acc.journal.dto.JournalReportingDateDTO;
import com.project.Accounting.acc.journal.service.JournalServiceFacade;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/acc/account/")
@CrossOrigin("*")
@Tag(name = "분개", description = "분개 관련 API입니다.")
public class JournalController {

    @Autowired
    private final JournalServiceFacade journalServiceFacade;

    @GetMapping("/journals")
    @Operation(summary = "분개 전체 조회", description = "연관관계 제외")
    public List<JournalDTO> Journals() {
        List<JournalDTO> journalList = journalServiceFacade.getJournalList();
        return journalList;
    }

    @GetMapping("/journalsBetweenDate")
    @Operation(summary = "특정 기간 사이의 분개 조회")
    public ResponseEntity<Map<String,List<JournalReportingDateDTO>>> journalsBetweenDate(@RequestParam String startDate, @RequestParam String endDate) {
        HashMap<String, List<JournalReportingDateDTO>> map = new HashMap<>();
        List<JournalReportingDateDTO> journalBetweenDate = journalServiceFacade.getJournalBetweenDate(startDate,endDate);
        map.put("journal",journalBetweenDate);
        return ResponseEntity.ok(map);
    }


}
