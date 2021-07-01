package com.cs.springbootudemycrud.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cs.springbootudemycrud.entity.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	
	@Autowired
	public EmployeeDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}



	@Override
	//@Transactional
	public List<Employee> findAll() {
		Session currentSession=entityManager.unwrap(Session.class);
		
		Query<Employee> theQuery=currentSession.createQuery("from Employee",Employee.class);
		//table name should be given in capital letter ie Employee not employee because it uses entity class as it is hql not sql
		List<Employee> employees=theQuery.getResultList();
		
		return employees;
	}



	@Override
	public Employee findById(int theId) {
		Session currentSession=entityManager.unwrap(Session.class);
		Employee emp=currentSession.get(Employee.class, theId);
		return emp;
	}



	@Override
	public void save(Employee emp) {
		Session currentSession=entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(emp);
		
	}



	@Override
	public void deleteById(int theId) {
		Session currentSession=entityManager.unwrap(Session.class);
		Query theQuery=currentSession.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();
		
	}

}
