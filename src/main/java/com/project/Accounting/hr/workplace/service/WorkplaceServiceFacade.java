package com.project.Accounting.hr.workplace.service;

import com.project.Accounting.hr.workplace.entity.Workplace;
import com.project.Accounting.hr.workplace.repository.WorkplaceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface WorkplaceServiceFacade {

    List<Workplace> searchWorkPlaceCode(String compCode);
}
