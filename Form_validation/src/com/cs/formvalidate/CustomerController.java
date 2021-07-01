package com.cs.formvalidate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
public String showForm(Model model) {
	model.addAttribute("customer", new Customer());
	return "customerform";
}

}
