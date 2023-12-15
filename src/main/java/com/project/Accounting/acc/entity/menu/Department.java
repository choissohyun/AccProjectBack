package com.project.Accounting.acc.entity.menu;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Entity
public class Department {

    @EmbeddedId
//    @JsonIgnoreProperties(value = {"workplace"}) // 프록시 객체인 workplace를 직렬화에서 제외
    private DepartmentID id;


//    @OneToMany(mappedBy = "department")
//    private List<Employee> employees;

//    @OneToMany(mappedBy = "department")
//    private List<Position> positions;

//    @OneToMany(mappedBy = "id.department", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Budget> budgets;

//    @OneToMany(mappedBy = "id.department", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Menu_available_by_position> menuAvailableByPosition;


    private String deptName;

    private String compCode;

    private String deptStartDate;

    private String deptEndDate;

    private String wpName;



}
