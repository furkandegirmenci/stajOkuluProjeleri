package com.stajokulu.stajokulu2.repository;

import com.stajokulu.stajokulu2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
