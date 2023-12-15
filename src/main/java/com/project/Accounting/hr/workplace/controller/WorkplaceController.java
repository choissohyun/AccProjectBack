package com.project.Accounting.hr.workplace.controller;

import com.project.Accounting.hr.workplace.entity.Workplace;
import com.project.Accounting.hr.workplace.service.WorkplaceServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/hr/workplace/*")
@CrossOrigin("*")
public class WorkplaceController {

    @Autowired
    private WorkplaceServiceFacade workplaceServiceFacade;

    @GetMapping( "/searchWorkplace")
    public ResponseEntity<List<Workplace>> getCompanyList(@RequestParam String companyCode) {

        List<Workplace> workplaceList = workplaceServiceFacade.searchWorkPlaceCode(companyCode);
        if (workplaceList.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Collections.emptyList());
        }
        return ResponseEntity.ok(workplaceList);
    }

}
