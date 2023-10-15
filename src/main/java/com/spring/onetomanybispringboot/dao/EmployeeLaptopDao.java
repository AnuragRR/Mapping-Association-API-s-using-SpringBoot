package com.spring.onetomanybispringboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.onetomanybispringboot.dto.Employee;
import com.spring.onetomanybispringboot.dto.Laptop;
import com.spring.onetomanybispringboot.repository.EmployeeRepository;
import com.spring.onetomanybispringboot.repository.LaptopRepository;

@Repository
public class EmployeeLaptopDao {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private LaptopRepository laptopRepository;
	
	public Employee saveEmployeeLaptopDao(Employee employee) {
		
		 for (Laptop laptop : employee.getLaptops()) {
	            laptop.setEmployee(employee);
	            laptopRepository.save(laptop);
	     }
		return employeeRepository.save(employee);
	}
}
