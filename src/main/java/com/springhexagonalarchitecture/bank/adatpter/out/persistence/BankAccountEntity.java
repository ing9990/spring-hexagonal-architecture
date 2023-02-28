package com.springhexagonalarchitecture.bank.adatpter.out.persistence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "account")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankAccountEntity {

    @Id
    @GeneratedValue
    private Long id;

    private BigDecimal balance;
}
