package com.other.appbank.repository;

import com.other.appbank.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {

}