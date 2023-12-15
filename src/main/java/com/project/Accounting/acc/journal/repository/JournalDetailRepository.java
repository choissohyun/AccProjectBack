package com.project.Accounting.acc.journal.repository;

import com.project.Accounting.acc.entity.menu.journal.JournalDetail;
import com.project.Accounting.acc.entity.menu.journal.JournalDetailId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalDetailRepository extends JpaRepository<JournalDetail, JournalDetailId> {

}
