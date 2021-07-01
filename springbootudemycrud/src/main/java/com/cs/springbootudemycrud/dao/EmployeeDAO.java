package com.cs.springbootudemycrud.dao;

import java.util.List;

import com.cs.springbootudemycrud.entity.Employee;

public interface EmployeeDAO {
public List<Employee> findAll();
public Employee findById(int theId);
public void save(Employee emp);
public void deleteById(int theId);
}
