package com.project.Accounting.acc.entity.menu.budget;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Budgeting_type {

    @Id
    @Column(name="budgeting_code")
    private String id;

//    @OneToMany(mappedBy = "id.budgeting_type", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Budget> budgetingList;

    private String budgetingTypeName;

}
