package com.springhexagonalarchitecture.bank.adatpter.in.web;

import com.springhexagonalarchitecture.bank.application.port.in.DepositUseCase;
import com.springhexagonalarchitecture.bank.application.port.in.WithDrawUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class BankAccountController {

    private final DepositUseCase depositUseCase;
    private final WithDrawUseCase withDrawUseCase;

    @PostMapping("/{id}/deposit/{amount}")
    void deposit(
            @PathVariable final Long id,
            @PathVariable final BigDecimal amount
    ) {
        depositUseCase.deposit(id, amount);
    }

    @PostMapping("/{id}/withdraw/{amount}")
    void withdraw(
            @PathVariable final Long id,
            @PathVariable final BigDecimal amount
    ) {
        withDrawUseCase.withdraw(id, amount);
    }
}
