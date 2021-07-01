package com.cs.springbootudemythymlyfcrud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cs.springbootudemythymlyfcrud.model.Employee;
import com.cs.springbootudemythymlyfcrud.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}
	
	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		// get employees from db
		List<Employee> theEmployees = employeeService.findAll();
		
		// add to the spring model
		theModel.addAttribute("employees", theEmployees);
		
		return "employees/list-employees";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Employee theEmployee=new Employee();
		model.addAttribute("employee", theEmployee);
		return "employees/employee-form";
	}
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") @Valid  Employee theEmployee,BindingResult bindRes) {
		if(bindRes.hasErrors()) {
			return "employees/employee-form";
		}else {
			employeeService.save(theEmployee);
			return "redirect:/employees/list";
		}
		
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId,Model model) {
		Employee theEmployee=employeeService.findById(theId);
		
		model.addAttribute("employee", theEmployee);
		
		return "employees/employee-form";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int theId) {
		employeeService.deleteById(theId);
		return "redirect:/employees/list";
	}
	@GetMapping("/search")
	public String search(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName,Model m){
		List<Employee> emp=employeeService.search(firstName, lastName);
		m.addAttribute("employees", emp);
		return "/employees/list-employees";
	}
}









