package com.foodApp.api.services;


import org.springframework.stereotype.Service;


import com.foodApp.api.entity.Customer;
import com.foodApp.api.repo.CustomerRepository;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    
    

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public String createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		return "create";
	}

	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		return "update";
	}

	@Override
	public String deleteCustomer(String customer) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(customer);
		return "deleted";
	}

	@Override
	public Customer getCustomer(String customer) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customer).get();
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}


}
