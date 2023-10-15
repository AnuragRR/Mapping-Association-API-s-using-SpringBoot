package com.spring.onetomanybispringboot.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Laptop {

	@Id
	private int lapId;
	private String lapName;
	private double lapPrice;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JsonIgnore
	@JoinColumn(name = "empId")
	private Employee employee;
}
