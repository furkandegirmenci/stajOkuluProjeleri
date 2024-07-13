package com.stajokulu.stajokulu2.service;

import com.stajokulu.stajokulu2.model.Customer;
import com.stajokulu.stajokulu2.model.MobileLine;
import com.stajokulu.stajokulu2.repository.MobileLineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class MobileLineService {
    private final CustomerService customerService;

    private final MobileLineRepository mobileLineRepository;

    public List<MobileLine> findByCustomer(String customerIdentityNo) {
        return mobileLineRepository.findMobileLinesByCustomerIs(customerIdentityNo);
    }

    public MobileLine create(String phoneNumber, String customerNo) {
        Customer customer = customerService.findCustomer(customerNo);

        if(Objects.isNull(customer)) {
            throw new RuntimeException("Customer not found : " + customerNo);
        }

        MobileLine mobileLine = new MobileLine();

        mobileLine.setPhoneNumber(phoneNumber);
        mobileLine.setOpenDate(String.valueOf(LocalDateTime.now().getYear()));
        mobileLine.setIsActive(true);
        mobileLine.setCustomer(customer);

        return mobileLineRepository.save(mobileLine);
    }
}
