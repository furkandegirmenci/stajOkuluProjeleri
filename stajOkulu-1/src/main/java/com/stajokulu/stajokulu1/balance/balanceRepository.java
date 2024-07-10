package com.stajokulu.stajokulu1.balance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface balanceRepository extends JpaRepository<balanceUnit, Long> {

    balanceUnit findBalanceUnitByNumberIs(String number);
}
