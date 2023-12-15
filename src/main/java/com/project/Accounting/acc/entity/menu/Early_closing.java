//package com.project.Accounting.entity.menu;
//
//import com.project.Accounting.entity.menu.period.Period;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Getter
//@Setter
//public class Early_closing {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "early_closing_id")
//    private Long id;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "account_period_no")
//    private Period period;
//
//    private String code;
//
//
//    private String codeName;
//
//    private Long price;
//}
