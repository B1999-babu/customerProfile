package com.customer.profile.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.profile.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
