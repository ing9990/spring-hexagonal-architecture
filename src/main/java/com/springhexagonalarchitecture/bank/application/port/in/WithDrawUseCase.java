package com.springhexagonalarchitecture.bank.application.port.in;

import java.math.BigDecimal;

public interface WithDrawUseCase {
    boolean withdraw(Long id, BigDecimal amount);
}
