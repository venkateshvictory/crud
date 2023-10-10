package com.tech.technology.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "CUSTOMER")

@Data

public class Customer  {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	private String firstName;
	private String LastName;
	private String email;
	private String phoneNumber;
	private String password;
	private String userName;

}
