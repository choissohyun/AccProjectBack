package com.project.Accounting.acc.accountledger.dao;

import com.project.Accounting.acc.accountledger.dto.GeneralAccountLedgerDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface AccountLedgerDAO {

    public HashMap<String, Object> getLedgerbyAccountInfo(HashMap<String,Object> param);//계정별원장

    public ArrayList<GeneralAccountLedgerDTO> selectGeneralAccountLedgerList(HashMap<String, String> map);//총계정원장



}
