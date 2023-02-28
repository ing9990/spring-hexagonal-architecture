package com.springhexagonalarchitecture.bank.application.port.out;

import com.springhexagonalarchitecture.bank.domain.BankAccount;

public interface LoadAccountPort {
    BankAccount load(Long id);
}
