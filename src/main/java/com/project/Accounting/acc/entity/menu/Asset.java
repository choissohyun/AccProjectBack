package com.project.Accounting.acc.entity.menu;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Asset {

    @Id @GeneratedValue
    private String id;

    private String test2;

    private String test3;

    private String test4;



}
