package com.project.Accounting.acc.entity.menu.account;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AccountControlCode {


@EmbeddedId
private AccountControlCodeId accountControlCode;



}
