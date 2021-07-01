package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	@RequestMapping("/ur1")
//public String url() {
	public RedirectView url() {
	System.out.println("showing ur1");
	RedirectView rv=new RedirectView();
	rv.setUrl("https://www.google.com");
	//return "redirect:/ur2";
	return rv;
}
	@RequestMapping("ur2")
	public String ur2() {
		System.out.println("showing ur2");
		return "";
	}
}
