package com.stajokulu.stajokulu1.balance;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class balanceService {


    private final balanceRepository balanceRepository;

    public void createBalance(String number, String kind, Double remainder) {

        balanceUnit BalanceUnit = new balanceUnit();
        BalanceUnit.setNumber(number);
        BalanceUnit.setKind(kind);
        BalanceUnit.setRemainder(remainder);

        balanceRepository.save(BalanceUnit);
    }

    public balanceUnit getBalances(String number) {
        return balanceRepository.findBalanceUnitByNumberIs(number);
    }
}
