package com.project.Accounting.acc.entity.menu.authority;

import com.project.Accounting.acc.entity.menu.Menu;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Authority_menu {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authority_code")
    private Authority authority;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_code")
    private Menu menu;


    private String authorityName;


    private String menuName;

}