package com.cs.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/stform")
public String showForm(Model model) {
	Student st=new Student();
	model.addAttribute("student", st);
	return "sform";
}
	@RequestMapping("process")
	public String processing(@ModelAttribute("student")Student st) {
		System.out.println("first name" +st.getFirstName());
		System.out.println("last name" +st.getLastName());
		return "student-confirmation";
	}
}
