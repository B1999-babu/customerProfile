package com.customer.profile.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.profile.Entity.Customer;
import com.customer.profile.Repository.CustomerRepository;
import com.customer.profile.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
		
	}

	@Override
	public Customer updateCustomer(Customer customer) {
	
		return customerRepository.save(customer);
		
	}

}
