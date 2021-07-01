package controllertoview;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerToView {
	@RequestMapping("/view1")
	public String view(Model m) {
		List<String> friends=new ArrayList<String>();
		friends.add("csm");
		friends.add("jb");
		friends.add("ap");
		m.addAttribute("name", "csm");
		m.addAttribute("id",101);
		m.addAttribute("f",friends);
		return "view1";
		
	}
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("age",20);
		LocalDateTime now=LocalDateTime.now();
		mv.addObject("time",now);
		System.out.println(now);
		mv.setViewName("about");
		return mv;
	}

}
