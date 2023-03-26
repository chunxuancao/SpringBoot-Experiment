package com.springboot.demo.repository;

import com.springboot.demo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Customer findByUsername(String username);
}
