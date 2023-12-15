package com.project.Accounting.acc.budget.dto;


import com.project.Accounting.acc.base.to.BaseTO;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper=false)
@Data
//=====================================  2020-08-25 계정별 원장 조편백    ====================================
public class DeptCodeDTO extends BaseTO {

	private String deptCode;

	private String deptName;

}
