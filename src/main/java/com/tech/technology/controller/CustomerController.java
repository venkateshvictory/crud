package com.tech.technology.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tech.technology.model.Customer;
import com.tech.technology.service.CustomerService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@Resource(name="customerService")
	private CustomerService customerService;
	@PostMapping("/create")
    public Customer save(@RequestBody Customer customer) {
		
		return customerService.save(customer);
	}
  //  @GetMapping("/findById") or
    @GetMapping("/findById/{id}")
	public Customer findById(@PathVariable("id") Long id) {
		
		return customerService.findById(id);
	}
	@DeleteMapping("/delete")
	public String deleteById(Long id) {
	return customerService.deleteById(id);
		 
	}
	@PutMapping("/update")
	public Customer upDateCustomer(@RequestBody Customer customer) {
		
		return customerService.upDateCustomer(customer);
	}
	
	@GetMapping("/email")
	public Customer findByEmail(@RequestParam String email) {
		return customerService.findByEmail(email);
	}
	
	@GetMapping("/password")
	public Customer findByPassword(@RequestParam String password) {
		return customerService.findByEmail(password);
	}
	
	
	@GetMapping("/login")
	public List<Customer> loginPage(@RequestParam String email, @RequestParam String password) {
	            	
		  
	         List<Customer> customer=customerService.verifyUserDetails(email, password);
	        
	       
	         return customer;
	}
}
