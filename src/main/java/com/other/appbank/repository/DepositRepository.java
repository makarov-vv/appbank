package com.other.appbank.repository;

import com.other.appbank.entities.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositRepository extends JpaRepository<Deposit, Long> {

}