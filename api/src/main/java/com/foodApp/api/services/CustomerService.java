package com.foodApp.api.services;


import java.util.List;

import com.foodApp.api.entity.Customer;

public interface CustomerService {
    public String createCustomer(Customer customer);
    public String updateCustomer(Customer customer);
    public String deleteCustomer(String customer);
    public Customer getCustomer(String customer);
    public List<Customer> getAllCustomers();
    
}
