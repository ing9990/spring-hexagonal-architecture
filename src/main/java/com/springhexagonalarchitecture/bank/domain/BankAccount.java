package com.springhexagonalarchitecture.bank.domain;

import lombok.Builder;
import java.math.BigDecimal;

public class BankAccount {

    private final Long id;
    private BigDecimal balance;

    @Builder
    public BankAccount(Long id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public boolean withdraw(BigDecimal amount) {
        if (this.balance.compareTo(amount) < 0) {
            return false;
        }
        this.balance = this.balance.subtract(amount);

        return true;
    }

    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public Long getId() {
        return this.id;
    }
}
