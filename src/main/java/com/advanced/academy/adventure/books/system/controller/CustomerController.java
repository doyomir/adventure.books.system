package com.advanced.academy.adventure.books.system.controller;

import com.advanced.academy.adventure.books.system.models.Customer;
import com.advanced.academy.adventure.books.system.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.element.NestingKind;
import java.io.PrintWriter;
import java.io.StringWriter;


@RestController
@RequestMapping("customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void createOrUpdateCustomer(@RequestBody Customer customer) {
         customerService.createOrUpdateCustomer(customer);
    }

    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") Integer customerId ){
        return customerService.getCustomer(customerId);

    }

    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer customerId ){
         customerService.deleteCustomer(customerId);

    }

    @ExceptionHandler({Exception.class})
    public String onException(Exception e){
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        String exceptionAsString = sw.toString();
        return  exceptionAsString;

    }
}
