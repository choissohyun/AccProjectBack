//package com.project.Accounting.entity.menu;
//
//import jakarta.persistence.*;
//
//import java.io.Serializable;
//
//@Embeddable
//@IdClass(Menu_available_by_positionID.class)
//public class Menu_available_by_positionID implements Serializable {
//
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Department department;
//
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Menu menu;
//
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Position position;
//
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Workplace workplace;
//
//
//
//
//}
