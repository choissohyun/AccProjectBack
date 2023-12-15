package com.project.Accounting.acc.slip.repository;

import com.project.Accounting.acc.entity.menu.Slip;
import com.project.Accounting.acc.slip.dto.SlipDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SlipRepository extends JpaRepository<Slip, String> {

    @Query("select distinct s from Slip s join fetch s.journals j join fetch j.journalDetail")
    List<Slip> findAllFetch();

    @Query("SELECT new com.project.Accounting.acc.slip.dto.SlipDTO(" +
            "s.id," +
            "s.deptCode," +
            "s.slipType," +
            "s.expenseReport," +
            "s.authorizationStatus," +
            "s.reportingEmpCode," +
            "s.reportingDate," +
            "s.approvalEmpCode," +
            "s.approvalDate," +
            "s.slipDescription," +
            "s.slipStatus," +
            "s.acctPeriodNo" +
            ") " +
            "from Slip s")
    List<SlipDTO> findOnlySlipList();


    int countSlipByReportingDate(String date);

    List<Slip> findByIdIn(List<String> idList);

    Optional<Slip> findById(String id);


    
}
