package com.advanced.academy.adventure.books.system.service;

import com.advanced.academy.adventure.books.system.models.Customer;
import com.advanced.academy.adventure.books.system.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
        return null;
    }

    private void validateAndCreateCustomer(Customer customer) {
        customerRepository.save(customer);

    }

    private void updateCustomer(Customer customer) {


    }


    public void deleteCustomer(Integer customerId) {
        customerRepository.deactivateCustomer(customerId);
    }
}
