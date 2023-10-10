package com.tech.technology.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tech.technology.model.Customer;
import com.tech.technology.repository.CustomerRepository;
import com.tech.technology.service.CustomerService;

import jakarta.annotation.Resource;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Resource(name = "customerRepository")
	private CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {

		return customerRepository.save(customer);
	}

	@Override
	public Customer findById(Long id) {

		Optional<Customer> customer = customerRepository.findById(id);
		if (customer.isPresent())
			return customer.get();
		return null;
	}

	@Override
	public String deleteById(Long id) {

		customerRepository.deleteById(id);
		if (customerRepository.findById(id).isPresent()) {
			return "still customer present";
		}

		return "SUCCESSFULLY DELETED CUSTOMER FROM OUR DATA BASE";

	}

	@Override
	public Customer upDateCustomer(Customer customer) {
		Customer customerData = customerRepository.findById(customer.getId()).get();
		customerData.setEmail(customer.getEmail());
		customerData.setFirstName(customer.getFirstName());
		customerData.setLastName(customer.getLastName());
		customerData.setPhoneNumber(customer.getPhoneNumber());
		customerRepository.save(customerData);
		return customerData;
	}

	@Override
	public List<Customer> verifyUserDetails(String email, String password) {
		return customerRepository.verifyUserDetails(email, password);

	}

	@Override
	public Customer findByEmail(String email) {

		return customerRepository.findByEmail(email);
	}

	@Override
	public Customer findByPassword(String password) {

		return customerRepository.findByPassword(password);
	}

}
