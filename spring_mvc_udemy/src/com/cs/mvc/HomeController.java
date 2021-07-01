package com.cs.mvc;

import javax.servlet.http.HttpServletRequest;

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
	@RequestMapping("processForm")
	public String processing() {
		return "process";
	}
	/*@RequestMapping("processFormv2")
	public String convert(HttpServletRequest req,Model model) {
		String theName=req.getParameter("studentName");
		theName=theName.toUpperCase();
		String result="Yo!"+theName;
		model.addAttribute("message", result);
		return "process";
	}*/
	@RequestMapping("processFormv2")
	public String convert(@RequestParam("studentName")String theName,Model model) {
		theName=theName.toUpperCase();
		String res="Hey! "+theName;
		model.addAttribute("message", res);
		return "process";
	}
}
