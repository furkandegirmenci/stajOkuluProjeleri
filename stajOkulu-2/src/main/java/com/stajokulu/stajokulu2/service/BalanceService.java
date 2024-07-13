package com.stajokulu.stajokulu2.service;

import com.stajokulu.stajokulu2.repository.BalanceRepository;
import com.stajokulu.stajokulu2.model.BalanceUnit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BalanceService {


    private final BalanceRepository balanceRepository;

    public void createBalance(String number, String kind, Double remainder) {

        BalanceUnit balanceUnit = new BalanceUnit();
        balanceUnit.setKind(kind);
        balanceUnit.setRemainder(remainder);

        balanceRepository.save(balanceUnit);
    }

    public BalanceUnit getBalances(String number) {
        return balanceRepository.findBalanceUnitByNumberIs(number);
    }
}
