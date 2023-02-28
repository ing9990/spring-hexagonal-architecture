package com.springhexagonalarchitecture.bank.application.port.out;

import com.springhexagonalarchitecture.bank.domain.BankAccount;

public interface SaveAccountPort {
    void save(BankAccount bankAccount);
}
