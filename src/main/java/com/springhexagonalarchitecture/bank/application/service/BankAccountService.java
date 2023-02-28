package com.springhexagonalarchitecture.bank.application.service;

import com.springhexagonalarchitecture.bank.application.port.in.DepositUseCase;
import com.springhexagonalarchitecture.bank.application.port.in.WithDrawUseCase;
import com.springhexagonalarchitecture.bank.application.port.out.LoadAccountPort;
import com.springhexagonalarchitecture.bank.application.port.out.SaveAccountPort;
import com.springhexagonalarchitecture.bank.domain.BankAccount;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class BankAccountService implements DepositUseCase, WithDrawUseCase {

    private final LoadAccountPort loadAccountPort;
    private final SaveAccountPort saveAccountPort;

    @Override
    public void deposit(Long id, BigDecimal amount) {
        BankAccount account = loadAccountPort.load(id);

        account.deposit(amount);

        saveAccountPort.save(account);
    }

    @Override
    public boolean withdraw(Long id, BigDecimal amount) {
        BankAccount account = loadAccountPort.load(id);

        boolean hasWithdraw = account.withdraw(amount);

        if (hasWithdraw) {
            saveAccountPort.save(account);
        }

        return hasWithdraw;
    }
}
















