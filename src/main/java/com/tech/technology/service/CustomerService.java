package com.tech.technology.service;

import java.util.List;

import com.tech.technology.model.Customer;

public interface CustomerService {

	public Customer save(Customer customer);
	public Customer findById(Long id);
	public  String deleteById(Long id);
	public Customer upDateCustomer(Customer customer);
	public List<Customer> verifyUserDetails(String email,String password);
	public Customer findByEmail(String email);
	public Customer findByPassword(String password);
}
