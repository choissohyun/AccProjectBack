package com.project.Accounting.acc.journal.repository;

import com.project.Accounting.acc.entity.menu.journal.Journal;
import com.project.Accounting.acc.journal.dto.JournalDTO;
import com.project.Accounting.acc.journal.dto.JournalReportingDateDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface JournalRepository extends JpaRepository<Journal, String> {

    @Query("SELECT new com.project.Accounting.acc.journal.dto.JournalDTO(" +
            "j.id, " +
            "j.slip.id, " +
            "j.balanceDivision, " +
            "j.acctInnerCode, " +
            "j.acctName, " +
            "j.cterCode, " +
            "j.leftDebtorPrice, " +
            "j.rightCreditsPrice) " +
            "FROM Journal j")
    List<JournalDTO> findAllJournals();

    List<Journal> findBySlipReportingDateBetween(String startDate, String endDate);

    @Query("SELECT new com.project.Accounting.acc.journal.dto.JournalReportingDateDTO(" +
            "j.id, " +
            "j.slip.id, " +
            "j.balanceDivision, " +
            "j.acctInnerCode, " +
            "j.acctName, " +
            "j.cterCode, " +
            "j.leftDebtorPrice, " +
            "j.rightCreditsPrice, " +
            "j.slip.reportingDate, " +
            "j.slip.expenseReport," +
            "j.cterName) " +
            "FROM Journal j " +
            "WHERE j.slip.reportingDate BETWEEN :startDate AND :endDate")
    List<JournalReportingDateDTO> findBySlipReportingDateBetween2(@Param("startDate") String startDate, @Param("endDate") String endDate);
}
