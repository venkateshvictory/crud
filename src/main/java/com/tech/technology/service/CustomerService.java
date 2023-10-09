package com.tech.technology.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.tech.technology.model.Customer;

public interface CustomerService {

	public Customer save(Customer customer);
	public Customer findById(Long id);
	public  String deleteById(Long id);
	public Customer upDateCustomer(Customer customer);
}
