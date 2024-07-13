package com.stajokulu.stajokulu2.controller;

import com.stajokulu.stajokulu2.model.MobileLine;
import com.stajokulu.stajokulu2.service.MobileLineService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mobile-line")
@RequiredArgsConstructor
public class MobileLineController {

    private final MobileLineService mobileLineService;

    @GetMapping("/find-by-customer")
    public List<MobileLine> findByCustomer(@RequestParam String customerIdentityNo) {
        return mobileLineService.findByCustomer(customerIdentityNo);
    }

    @PostMapping("/create")
    public MobileLine createMobileLine(@RequestParam String phoneNumber,
                                   @RequestParam String customerNo) {
        return mobileLineService.create(phoneNumber, customerNo);
    }
}
