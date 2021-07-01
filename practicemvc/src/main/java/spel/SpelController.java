package spel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/about")
public class SpelController {
	
	@RequestMapping("/about1")
	public ModelAndView about() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("age",20);
		mv.addObject("name","csm");
		mv.addObject("id",101);
		LocalDateTime now=LocalDateTime.now();
		mv.addObject("time",now);
	List<Integer> mark=new ArrayList<Integer>();
	mark.add(80);
	mark.add(90);
	mark.add(95);
	mv.addObject("mark",mark);
		mv.setViewName("about1");
		return mv;
	}

}


