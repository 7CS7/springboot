package com.cs.springbootudemycrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cs.springbootudemycrud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
