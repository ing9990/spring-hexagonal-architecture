package com.springhexagonalarchitecture.bank.adatpter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountSpringDataRepository extends JpaRepository<BankAccountEntity, Long> {

}
