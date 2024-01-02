package dev.patika.vetapp.service;

import dev.patika.vetapp.base.BaseService;
import dev.patika.vetapp.dto.CustomerRequest;
import dev.patika.vetapp.dto.CustomerResponse;
import dev.patika.vetapp.entity.Customer;
import dev.patika.vetapp.mapper.CustomerMapper;
import dev.patika.vetapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends BaseService<Customer, CustomerRequest, CustomerResponse> {
    @Autowired
    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        super(Customer.class, customerRepository, customerMapper, null);
    }
}
