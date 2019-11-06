package com.advanced.academy.adventure.books.system.service;

import com.advanced.academy.adventure.books.system.models.Customer;
import com.advanced.academy.adventure.books.system.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public void createOrUpdateCustomer(Customer customer) {
        if (null == customer.getId()) {
            validateAndCreateCustomer(customer);
            return;
        }
        updateCustomer(customer);
    }

    public Customer getCustomer(Integer customerId) {

        Optional<Customer> customer = customerRepository.findById(customerId);

        if(!customer.isPresent()){
            throw new RuntimeException("Customer not found!");
        }
        return customer.get();
    }

    private void validateAndCreateCustomer(Customer customer) {
        customerRepository.save(customer);

    }

    private void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }


    public void deleteCustomer(Integer customerId) {
        customerRepository.deactivateCustomer(customerId);
    }
}
