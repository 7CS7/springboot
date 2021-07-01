package com.cs.springbootudemythymlyfcrud.service;

import java.util.List;

import com.cs.springbootudemythymlyfcrud.model.Employee;



public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
