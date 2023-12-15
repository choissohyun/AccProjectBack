package com.project.Accounting.acc.customer.dto;

import com.project.Accounting.acc.entity.menu.Customer;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

@Schema(description="거래처 전체 조회 Dto")
@Data
public class CustomerFindDTO {

    @Column(name = "cter_code")
    @Schema(description="거래처 코드")
    private String id;
    @Schema(description="사업장 코드")
    private String wpCode;
    @Schema(description="거래처명")
    private String cterName;
    @Schema(description="대표자")
    private String cterCeo;
    @Schema(description="사업자등록번호")
    private String businessLicenseNumber;
    @Schema(description="업태")
    private String cterBusinessConditions;
    @Schema(description="거래 Item")
    private String cterBusinessItems;
    @Schema(description="거래처 주소")
    private String cterBasicAddress;

    public CustomerFindDTO(Customer customer) {
        this.id = customer.getId();
        this.wpCode=customer.getWpCode();
        this.cterName = customer.getCterName();
        this.cterCeo = customer.getCterCeo();
        this.businessLicenseNumber = customer.getBusinessLicenseNumber();
        this.cterBusinessConditions = customer.getCterBusinessConditions();
        this.cterBusinessItems = customer.getCterBusinessItems();
        this.cterBasicAddress = customer.getCterBasicAddress();
    }
}
