package viewtocontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	 @RequestMapping(path="/processform",method=RequestMethod.POST) public String
	 handler(HttpServletRequest req) { String email=req.getParameter("email");
	 System.out.println(email); return ""; }
	 
	@ModelAttribute
	public void common(Model m2) {
		m2.addAttribute("headerm", "welcome"); 
		m2.addAttribute("tailm", "home");
		  
	}
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handler(@RequestParam("email") String email,@RequestParam("username") String user,@RequestParam("password")String pwd,Model m) {
		
		System.out.println(email);
		System.out.println(user);
		System.out.println(pwd);
		
		  m.addAttribute("email", email);
		  m.addAttribute("user", user);
		  m.addAttribute("password", pwd);
		 
		return "success";
	}
}
