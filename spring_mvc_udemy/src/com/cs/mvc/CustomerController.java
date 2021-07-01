package com.cs.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ste=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);
	}
	
	
	@RequestMapping("/custform")
public String showForm(Model model) {
	model.addAttribute("customer", new Customer());
	return "customerform";
}
	@RequestMapping("process")
	public String processing(@Valid @ModelAttribute("customer") Customer c,BindingResult bindRes) {
		if(bindRes.hasErrors()) {
			return "customerform";
		}else {
			return "cust_confirmation";
		}
	}

}
