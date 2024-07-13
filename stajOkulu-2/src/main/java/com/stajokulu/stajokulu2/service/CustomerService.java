package com.stajokulu.stajokulu2.service;

import com.stajokulu.stajokulu2.model.Customer;
import com.stajokulu.stajokulu2.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();


    }

    public Customer createCustomer(String identityNumber, String name, String surname, String gender, String birthYear, String adress) {
        Customer customer = new Customer();

        customer.setIdentityNumber(identityNumber);
        customer.setName(name);
        customer.setSurname(surname);
        customer.setGender(gender);
        customer.setBirthYear(birthYear);
        customer.setAdress(adress);

        return customerRepository.save(customer);
    }

    public Customer findCustomer(String identityNumber) {
        return customerRepository.findById(identityNumber).orElse(null);
    }
}
