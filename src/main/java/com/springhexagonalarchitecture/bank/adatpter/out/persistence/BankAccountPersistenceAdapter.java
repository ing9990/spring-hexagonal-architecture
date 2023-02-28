package com.springhexagonalarchitecture.bank.adatpter.out.persistence;

import com.springhexagonalarchitecture.bank.application.port.out.LoadAccountPort;
import com.springhexagonalarchitecture.bank.application.port.out.SaveAccountPort;
import com.springhexagonalarchitecture.bank.domain.BankAccount;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.NoSuchElementException;

@Repository
@RequiredArgsConstructor
public class BankAccountPersistenceAdapter implements LoadAccountPort, SaveAccountPort {

    private final BankAccountSpringDataRepository accountRepository;
    private final BankAccountMapper mapper;

    @Override
    public BankAccount load(Long id) {
        BankAccountEntity entity = accountRepository.findById(id)
                .orElseThrow(NoSuchElementException::new);

        return mapper.toDomain(entity);
    }

    @Override
    public void save(BankAccount bankAccount) {
        BankAccountEntity entity = mapper.toEntity(bankAccount);

        accountRepository.save(entity);
    }
}














