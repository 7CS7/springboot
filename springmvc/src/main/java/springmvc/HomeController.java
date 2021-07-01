package springmvc;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	/*
	 * public String home() { System.out.println("This is Home Controller"); return
	 * "index"; }
	 */
	public String home(Model m) {
		System.out.println("This is home url");
		m.addAttribute("name", "CSM");
		return "index";
		
	}
	
	@RequestMapping(path="/about",method=RequestMethod.GET)
	/*public String about() {
	System.out.println("This is about page");
	return "about";*/
	public String about(Model m2) {
		System.out.println("this is about page");
		m2.addAttribute("city", "BBSR");
		List<String> marks=new ArrayList<String>();
		marks.add("95");
		marks.add("90");
		marks.add("80");
		marks.add("70");
		m2.addAttribute("mark", marks);
		return "about";
}
	@RequestMapping("/help")
	public ModelAndView help() {
	System.out.println("This is Help page");
	ModelAndView mv=new ModelAndView();
	mv.addObject("name", "JB");
	mv.addObject("rollno", 121);
	LocalDateTime now=LocalDateTime.now();
	mv.addObject("time", now);
	List<String> marks=new ArrayList<String>();
	marks.add("95");
	marks.add("90");
	marks.add("80");
	marks.add("70");
	mv.addObject("m", marks);
	mv.setViewName("help");
	return mv;
}
}
