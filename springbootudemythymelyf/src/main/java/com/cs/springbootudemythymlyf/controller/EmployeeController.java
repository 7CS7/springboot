package com.cs.springbootudemythymlyf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cs.springbootudemythymlyf.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private List<Employee> theEmployees;
	@PostConstruct
	private void loadData() {
		Employee emp1=new Employee(1,"abc","def","abc@mail.com");
		Employee emp2=new Employee(2,"pqr","st","pqr@mail.com");
		Employee emp3=new Employee(3,"xyz","w","xyz@mail.com");
		theEmployees=new ArrayList<>();
		theEmployees.add(emp1);
		theEmployees.add(emp2);
		theEmployees.add(emp3);
	}
	@GetMapping("/list")
	public String listEmployees(Model model) {
		model.addAttribute("employees", theEmployees);
		return "list-employees";
	}
}
