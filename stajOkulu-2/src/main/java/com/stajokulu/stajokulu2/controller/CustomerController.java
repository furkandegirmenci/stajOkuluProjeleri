package com.stajokulu.stajokulu2.controller;

import com.stajokulu.stajokulu2.model.Customer;
import com.stajokulu.stajokulu2.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/{identityNumber}")
    public Customer findCustomer(@RequestParam String identityNumber) {
        return customerService.findCustomer(identityNumber);
    }

    @PostMapping("/create")
    public Customer createCustomer(@RequestParam String identityNumber, @RequestParam String name, @RequestParam String surname, @RequestParam String gender, @RequestParam String birthYear, @RequestParam String adress) {
        return customerService.createCustomer(identityNumber, name, surname, gender, birthYear, adress);
    }
}
