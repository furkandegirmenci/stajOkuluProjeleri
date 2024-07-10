package com.stajokulu.stajokulu1.balance;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/balance")
@RequiredArgsConstructor
public class balanceController {

    private final balanceService balanceService;

    @PostMapping
    public String createBalance(@RequestParam String number, @RequestParam String kind, @RequestParam Double remainder) {
        balanceService.createBalance(number, kind, remainder);

        return "balance success";

    }
    @GetMapping
    public balanceUnit getBalance(@RequestParam String number) {
        return balanceService.getBalances(number);
    }

}
