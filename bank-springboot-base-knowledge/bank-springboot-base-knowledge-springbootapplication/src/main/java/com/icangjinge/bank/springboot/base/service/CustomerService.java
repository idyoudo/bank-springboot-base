package com.icangjinge.bank.springboot.base.service;

import com.icangjinge.bank.springboot.base.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public Customer queryCustomer(String customerId) {
        return new Customer("springboot",4,customerId);
    }
}
