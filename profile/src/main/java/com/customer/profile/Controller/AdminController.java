package com.customer.profile.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.customer.profile.Entity.Customer;
import com.customer.profile.Service.CustomerService;

@Controller
public class AdminController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> getAllCustomers(){
	
		return new ResponseEntity<>(customerService.getAllCustomers(),HttpStatus.OK);
	}
	
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable Long id){
		customerService.deleteCustomer(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}
