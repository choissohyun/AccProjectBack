package com.project.Accounting.acc.entity.business;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Business {

    @Id
    @Column(name = "classification_code")
    private String id;

    private String businessName;

    private String remarks;

    @OneToMany(mappedBy = "business")
    private List<Detail_business> businessList;


}
