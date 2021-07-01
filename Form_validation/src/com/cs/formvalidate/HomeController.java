package com.cs.formvalidate;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("funny")
public class HomeController {
	@RequestMapping("/show")
public String home() {
	return "showform";
}
	
}
