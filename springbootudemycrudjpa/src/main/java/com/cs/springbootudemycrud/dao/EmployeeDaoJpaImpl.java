package com.cs.springbootudemycrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.cs.springbootudemycrud.entity.Employee;
@Repository
public class EmployeeDaoJpaImpl implements EmployeeDAO {

	private EntityManager entityManager;
	@Autowired
	public EmployeeDaoJpaImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> findAll() {
		Query theQuery=entityManager.createQuery("from Employee");
		List<Employee> employees=theQuery.getResultList();
		return employees;
	}

	@Override
	public Employee findById(int theId) {
		Employee emp=entityManager.find(Employee.class, theId);
		return emp;
	}

	@Override
	public void save(Employee emp) {
		Employee theEmp=entityManager.merge(emp);
		emp.setId(theEmp.getId());

	}

	@Override
	public void deleteById(int theId) {
		Query theQuery=entityManager.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();

	}

}
