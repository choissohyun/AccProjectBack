package com.project.Accounting.acc.entity.menu.journal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class JournalDetail {

   @EmbeddedId
   private JournalDetailId id;

    private String wpCode;
    private String wpName;

    private String deptCode;
    private String deptName;

    private String acctControlCode;

    private String carNumber;
    private String carName;
    private String description;

    private String acctCode;
    private String acctName;



}
