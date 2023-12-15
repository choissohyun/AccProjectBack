package com.project.Accounting.acc.entity.menu;

import com.project.Accounting.hr.workplace.entity.Workplace;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class    Position {

    @Id
    @Column(name = "position_code")
    private String id;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "wp_code")
    private Workplace workplace;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

//    @OneToMany(mappedBy = "id.position", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Menu_available_by_position> menuAvailableByPosition;

    private String positionName;

    private String description;

}
