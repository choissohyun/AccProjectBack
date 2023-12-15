package com.project.Accounting.acc.entity.code;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Code_detail {

    @Id
    @Column(name = "detail_code", nullable = false)
    private String id;


    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "division_code_no")
    private Code code;


    private String DetailCodeName;

    private char codeUseCheck;


    private String description;

    
}
