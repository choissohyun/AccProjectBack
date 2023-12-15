package com.project.Accounting.acc.entity.menu.authority;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Authority {

    @Id
    @Column(name = "authority_code")
    private String id;


    private String authorityName;

    @OneToMany(mappedBy = "authority")
    private List<Authority_menu> authorityMenu;
}