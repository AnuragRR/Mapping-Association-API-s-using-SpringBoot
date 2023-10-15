package com.spring.onetomanybispringboot.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Employee {

	@Id
	private int empId;
	private String empName;
	private String empEmail;
	
	@OneToMany(mappedBy="employee",cascade = CascadeType.PERSIST)
	private List<Laptop> laptops;
	
}
