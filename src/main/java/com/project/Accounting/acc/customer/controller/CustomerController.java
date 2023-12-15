package com.project.Accounting.acc.customer.controller;

import com.project.Accounting.acc.customer.dto.CustomerCodeDto;
import com.project.Accounting.acc.customer.dto.CustomerFindDTO;
import com.project.Accounting.acc.customer.service.CustomerService;
import com.project.Accounting.acc.entity.menu.Customer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Tag(name="거래처관리", description="거래처관리 api 입니다.")
@RestController
@CrossOrigin("*")
@RequestMapping("/acc/customer/")
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //거래처 하나 조회
    @Operation(summary="거래처 하나 조회 메서드", description="거래처 하나 조회 메서드 입니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공!" ),
            @ApiResponse(responseCode = "400", description = "사용자 요류" )
    })
    @GetMapping("/customerList")
    public ResponseEntity<Map<String, Object>> getAccountCodeNameList(@Parameter(name="workPlaceCode", description = "사업장코드") String workPlaceCode) {
        Map<String,Object> map = new HashMap<>();

        List<CustomerCodeDto> customerList = customerService.getCustomerCodes(workPlaceCode);

        if(customerList.size() == 0)
            return ResponseEntity.notFound().build();

        map.put("customerList",customerList);

        return ResponseEntity.ok(map);

    }

    //일반 거래처 조회
    @Operation(summary="거래처 전체 조회 메서드", description="거래처 전체 조회 메서드 입니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공!" ),
            @ApiResponse(responseCode = "400", description = "사용자 요류" )
    })
    @GetMapping("/customers")
    public ResponseEntity<List<CustomerFindDTO>> getCustomers(){
        List<CustomerFindDTO> customers = customerService.getCustomers();

        if(customers.size() == 0)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(customers);
    }

    // 일반 거래처 저장
    @Operation(summary="거래처 저장 메서드", description="거래처 저장 메서드 입니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공!", content = @Content(schema = @Schema(implementation = Customer.class))),
            @ApiResponse(responseCode = "400", description = "사용자 요류" )
    })
    @PostMapping("/customer")
    public void saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomers(customer);
    }

    //일반 거래처 삭제
    @Operation(summary="거래처 삭제 메서드", description="거래처 삭제 메서드 입니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공!" ),
            @ApiResponse(responseCode = "400", description = "사용자 요류" )
    })
    @DeleteMapping("/customer")
    public void deleteCustomer(@Parameter(name="id", description="거래처 코드") @RequestParam String id){
        System.out.println("id ===================== " + id);
        customerService.deleteCustomer(id);
    }

    //일반 거재처 수정
    @Operation(summary="거래처 수정 메서드", description="거래처 정보 수정 메서드 입니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공!", content = @Content(schema = @Schema(implementation = Customer.class))),
            @ApiResponse(responseCode = "400", description = "사용자 요류" )
    })
    @PutMapping("/customer")
    public void updateCustomers(@RequestBody Customer customer){
        customerService.updateCustomers(customer);
    }

}
