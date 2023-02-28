package com.springhexagonalarchitecture.bank.adatpter.out.persistence;

import com.springhexagonalarchitecture.bank.domain.BankAccount;
import org.springframework.stereotype.Component;

@Component
public class BankAccountMapper {

    public BankAccount toDomain(BankAccountEntity entity) {
        return BankAccount.builder()
                .id(entity.getId())
                .balance((entity.getBalance()))
                .build();
    }

    public BankAccountEntity toEntity(BankAccount domain) {
        return BankAccountEntity.builder()
                .id(domain.getId())
                .balance(domain.getBalance())
                .build();
    }
}
