package com.stajokulu.stajokulu2.controller;

import com.stajokulu.stajokulu2.service.BalanceService;
import com.stajokulu.stajokulu2.model.BalanceUnit;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/balance")
@RequiredArgsConstructor
public class BalanceController {

    private final BalanceService balanceService;

    @PostMapping
    public String createBalance(@RequestParam String number, @RequestParam String kind, @RequestParam Double remainder) {
        balanceService.createBalance(number, kind, remainder);

        return "balance success";

    }
    @GetMapping
    public BalanceUnit getBalance(@RequestParam String number) {
        return balanceService.getBalances(number);
    }

}
