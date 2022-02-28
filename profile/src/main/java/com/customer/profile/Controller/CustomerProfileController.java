package com.customer.profile.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.profile.Entity.Customer;
import com.customer.profile.Service.CustomerService;

@RestController
public class CustomerProfileController {


	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> saveCustomer(@Valid @RequestBody Customer customer){
		return new ResponseEntity<>(customerService.save(customer),HttpStatus.CREATED);
	}
	
	@PutMapping("/customer/{id}")
	public ResponseEntity<Customer> updateCustomer(@Valid @PathVariable Long id,@RequestBody Customer customer){
		customer.setId(id);
		return new ResponseEntity<>(customerService.updateCustomer(customer),HttpStatus.OK);
	}
	
}
