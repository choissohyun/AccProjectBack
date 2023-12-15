package com.project.Accounting.acc.account.dao;

import com.project.Accounting.acc.account.dto.AcctCodeManagerDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AcctCodeManagerDAO {

    List<AcctCodeManagerDTO> getAccountCodeList();
}
