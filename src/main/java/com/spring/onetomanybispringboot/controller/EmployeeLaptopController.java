package com.spring.onetomanybispringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.onetomanybispringboot.dto.Employee;
import com.spring.onetomanybispringboot.service.EmployeeLaptopService;

@RestController
public class EmployeeLaptopController {

	@Autowired
	private EmployeeLaptopService service;
	
	@PostMapping(value = "/saveEmployeeLaptop")
	public Employee saveEmployeeLaptopController(@RequestBody Employee employee) {
		
		return service.saveEmployeeLaptopService(employee);
	}
}
