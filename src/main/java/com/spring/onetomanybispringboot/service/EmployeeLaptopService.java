package com.spring.onetomanybispringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.onetomanybispringboot.dao.EmployeeLaptopDao;
import com.spring.onetomanybispringboot.dto.Employee;

@Service
public class EmployeeLaptopService {

	@Autowired
	private EmployeeLaptopDao dao;
	
	public Employee saveEmployeeLaptopService(Employee employee) {

		return dao.saveEmployeeLaptopDao(employee);
	}
}
