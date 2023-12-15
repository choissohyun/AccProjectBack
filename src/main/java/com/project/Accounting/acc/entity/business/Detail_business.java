package com.project.Accounting.acc.entity.business;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Detail_business {

    @Id
    @Column(name = "detailed code")
    private String id;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classification_code")
    private Business business;

    private String detailBusinessName;


    private String remarks;
}
