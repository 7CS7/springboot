package com.cs.springbootudemycrud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.springbootudemycrud.dao.EmployeeDAO;
import com.cs.springbootudemycrud.entity.Employee;
import com.cs.springbootudemycrud.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
private EmployeeService empService;
@Autowired
	public EmployeeRestController(EmployeeService empService) {
	super();
	this.empService = empService;
}

	/*private EmployeeDAO empdao;
	@Autowired
	public EmployeeRestController(EmployeeDAO empdao) {
		super();
		this.empdao = empdao;
	}*/
	
	@GetMapping("/employees")
	public List<Employee> findAll(){
		//return empdao.findAll();
		return empService.findAll();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		Employee theEmp=empService.findById(employeeId);
		if(theEmp==null) {
			throw new RuntimeException("Employee id not found - "+employeeId);
		}
		return theEmp;
		//return empService.findById(employeeId);
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee) {
		theEmployee.setId(0);
		empService.save(theEmployee);
		return theEmployee;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		empService.save(theEmployee);
		return theEmployee;
	}
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmploye(@PathVariable int employeeId) {
		Employee theEmp=empService.findById(employeeId);
		if(theEmp==null) {
			throw new RuntimeException("Employee id not found "+employeeId);
		}
		empService.deleteById(employeeId);
		return "deleted :"+employeeId;
		}
	}
	

