package com.cs.springbootudemythymlyfcrud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cs.springbootudemythymlyfcrud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!
	public List<Employee> findAllByOrderByFirstNameAsc();
	
}
