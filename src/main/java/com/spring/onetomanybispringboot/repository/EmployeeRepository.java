package com.spring.onetomanybispringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.onetomanybispringboot.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
