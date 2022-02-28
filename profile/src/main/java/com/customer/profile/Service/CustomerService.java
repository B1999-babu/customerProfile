package com.customer.profile.Service;

import java.util.List;

import javax.validation.Valid;

import com.customer.profile.Entity.Customer;

public interface CustomerService {

	public Customer save(Customer customer);
	
	List<Customer> getAllCustomers();

	void deleteCustomer(Long id);

	public Customer updateCustomer(Customer customer);
}
