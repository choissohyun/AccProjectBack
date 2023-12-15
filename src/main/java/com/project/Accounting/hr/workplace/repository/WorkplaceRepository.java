package com.project.Accounting.hr.workplace.repository;

import com.project.Accounting.hr.workplace.entity.Workplace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkplaceRepository extends JpaRepository<Workplace,String> {
    List<Workplace> findByCompCode(String compCode);
}
