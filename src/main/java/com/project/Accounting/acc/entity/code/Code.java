package com.project.Accounting.acc.entity.code;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Code {

    @Id @GeneratedValue
    @Column(name = "division_code_no", nullable = false)
    private String id;


    private String codeType;

    private String divisionCodeName;


    private String codeChangeAvailable;


    private String description;

    @OneToMany(mappedBy = "code")
    private List<Code_detail> codeDetails;
}
