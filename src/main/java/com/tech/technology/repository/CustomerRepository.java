package com.tech.technology.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tech.technology.model.Customer;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Query("SELECT U FROM Customer U WHERE U.email =:email")
	public Customer findByEmail(@Param("email") String email);

	@Query("SELECT U FROM Customer U WHERE U.password = :password")
	public Customer findByPassword(@Param("password") String password);

	@Query("Select u from Customer u where u.email= :email and u.password =:password")
	public List<Customer> verifyUserDetails(String email, String password);

//@Query("SELECT U FROM Customer U WHERE U.emailAddress =:emailAddress")
//Customer findByEmail(@Param ("emailAddress") String emailAddress);

}
