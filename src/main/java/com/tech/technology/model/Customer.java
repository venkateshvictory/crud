package com.tech.technology.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="CUSTOMER")

@Data

public class Customer{

	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	private String firstName;
	private String LastName;
	private String email;
	private String phoneNumber;
	
}
