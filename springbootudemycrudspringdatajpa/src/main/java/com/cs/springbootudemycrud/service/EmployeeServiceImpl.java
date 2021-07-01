package com.cs.springbootudemycrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.springbootudemycrud.dao.EmployeeDAO;
import com.cs.springbootudemycrud.dao.EmployeeRepository;
import com.cs.springbootudemycrud.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository empRepo;
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository empRepo) {
		super();
		this.empRepo = empRepo;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	

	@Override
	
	public Employee findById(int theId) {
		Employee e=null;
		Optional<Employee> result = empRepo.findById(theId);
		if(result.isPresent()) {
			e=result.get();
		}else {
			throw new RuntimeException("could not find employee id "+theId);
		}
		return e;
	}

	@Override
	
	public void save(Employee emp) {
		empRepo.save(emp);

	}

	@Override
	
	public void deleteById(int theId) {
		empRepo.deleteById(theId);

	}

}
