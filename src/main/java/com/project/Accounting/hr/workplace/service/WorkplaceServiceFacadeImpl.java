package com.project.Accounting.hr.workplace.service;

import com.project.Accounting.hr.workplace.entity.Workplace;
import com.project.Accounting.hr.workplace.repository.WorkplaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkplaceServiceFacadeImpl implements WorkplaceServiceFacade{

    @Autowired
    private WorkplaceRepository workplaceRepository;

    @Override
    public List<Workplace> searchWorkPlaceCode(String compCode) {
        List<Workplace> workplaceList = workplaceRepository.findByCompCode(compCode);

        return workplaceList;
    }
}
