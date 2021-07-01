package com.cs.springbootudemycrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.springbootudemycrud.dao.EmployeeDAO;
import com.cs.springbootudemycrud.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO empDao;
	@Autowired
	public EmployeeServiceImpl(@Qualifier("employeeDaoJpaImpl")EmployeeDAO empDao) {
		super();
		this.empDao = empDao;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return empDao.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		return empDao.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee emp) {
		empDao.save(emp);

	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		empDao.deleteById(theId);

	}

}
