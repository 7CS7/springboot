package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.Test;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String showForm() {
		
		return "contact";
	}
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	/*public String handleForm(@RequestParam("email")
	String userEmail ,@RequestParam("username")String username,
	@RequestParam("password")String pwd,Model m) {
		
		System.out.println("email is "+userEmail);
		System.out.println("user is "+username);
		System.out.println("password is "+pwd);
		m.addAttribute("email", userEmail);
		m.addAttribute("username", username);
		m.addAttribute("password", pwd);*/
	/*public String handleForm(@RequestParam("email")
	String userEmail ,@RequestParam("username")String username,
	@RequestParam("password")String pwd,Model m) {
		Test tst=new Test();
		tst.setEmail(userEmail);
		tst.setUsername(username);
		tst.setPassword(pwd);
		m.addAttribute("tst", tst);
		*/
	public String handleForm(@ModelAttribute("test") Test tst,Model m) {
		System.out.println(tst);
		return "success";
		
	}

}
