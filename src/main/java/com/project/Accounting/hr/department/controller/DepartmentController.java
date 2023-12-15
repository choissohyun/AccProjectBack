package com.project.Accounting.hr.department.controller;

import com.project.Accounting.acc.account.dto.AccountCodeDto;
import com.project.Accounting.acc.entity.menu.Department;
import com.project.Accounting.hr.department.dto.DepartmentDTO;
import com.project.Accounting.hr.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("*")
@RequestMapping("/hr/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;



    @GetMapping("/departments")
    public ResponseEntity<Map<String, Object>> getDepartment(@RequestParam String compCode, @RequestParam String wpCode){
        List<DepartmentDTO> departments = departmentService.getDepartment(compCode, wpCode);
        Map<String, Object> department = new HashMap<>();

       department.put("departments",departments);



        return ResponseEntity.ok(department);
    }

}
