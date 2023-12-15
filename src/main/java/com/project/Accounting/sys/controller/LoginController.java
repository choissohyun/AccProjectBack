package com.project.Accounting.sys.controller;

import com.project.Accounting.sys.service.LoginServiceFacade;
import com.project.Accounting.sys.to.LoginResultTo;
import com.project.Accounting.sys.to.LoginTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/sys")
@CrossOrigin("*")
public class LoginController {
    
    @Autowired
    private LoginServiceFacade loginServiceFacade;

    @PostMapping("login")
    public ResponseEntity<Object> login(@RequestBody LoginTo loginto){

        LoginResultTo loginResult = loginServiceFacade.getLogin(loginto);

        if(loginResult==null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Collections.emptyList());
        }

        return ResponseEntity.ok(loginResult);
    }
}
