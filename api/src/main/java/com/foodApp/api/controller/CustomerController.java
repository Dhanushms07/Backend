package com.foodApp.api.controller;


import org.springframework.web.bind.annotation.*;

import com.foodApp.api.entity.Customer;
import com.foodApp.api.services.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;
    
    
     public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@GetMapping
    public List<Customer> getAllCustomersDetails() {
    	
        return customerService.getAllCustomers();
    }

    @GetMapping("/{customerId}")
    public Customer getCustomerDetails(@PathVariable("customerId") String customerId) 
    {
        return customerService.getCustomer(customerId);
    }

    @PostMapping
    public String createCustomer(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
        return "success";
    }

    @PutMapping
    public String putCloudVendorDetails(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
        return "put";
    }

    @DeleteMapping("/{customerId}")
    public String deleteCustomerDetails(@PathVariable("customerId") String customerId) {
        customerService.deleteCustomer(customerId);
        return "deleted";
    }
}
