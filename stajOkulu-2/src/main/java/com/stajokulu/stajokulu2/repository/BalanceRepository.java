package com.stajokulu.stajokulu2.repository;

import com.stajokulu.stajokulu2.model.BalanceUnit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceRepository extends JpaRepository<BalanceUnit, Long> {

    BalanceUnit findBalanceUnitByNumberIs(String number);
}
