package com.project.Accounting.acc.accountledger.dto;


import com.project.Accounting.acc.base.to.BaseTO;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper=false)
@Data
//=====================================  2020-08-25 계정별 원장 조편백    ====================================
public class LedgerByAccountDTO extends BaseTO {
	private String carryForward;
    private String reportingDate;      //APPROVAL_DATE                            //전표 -> 분개 등록한 날짜
	private String acctName;   // 계정이름
	private String cterName;   // 거래처이름
	private String leftDebtorPrice; //차변
	private String rightCreditsPrice; //대변
	private String totalPrice; //잔액

}
