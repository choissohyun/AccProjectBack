package com.project.Accounting.acc.entity.menu;

import com.project.Accounting.acc.entity.menu.authority.Authority_menu;
import com.project.Accounting.hr.workplace.entity.Workplace;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

    @Getter
    @Setter
    @Entity
    public class Menu {

        @Id
        @Column(name ="menu_code")
        private String id;

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "wp_code")
        private Workplace workplace;

        // 계층구조
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "parent_menu_code")
        private Menu menu;

        @OneToMany(mappedBy = "menu")
        private List<Menu> child = new ArrayList<>();

        @OneToMany(mappedBy = "menu")
        private List<Authority_menu> authorityMenu;

//        @OneToMany(mappedBy = "id.menu", cascade = CascadeType.ALL, orphanRemoval = true)
//        private List<Menu_available_by_position> menuAvailableByPosition;


        private String menuName;

        private Long menuOrder;


        private String url;

        private String description;


    }
