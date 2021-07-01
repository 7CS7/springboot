package appredirectview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	/*
	 * @RequestMapping("/search") public String search() {
	 * 
	 * return "search"; }
	 */
	@RequestMapping("/search")
	public RedirectView search2(@RequestParam("querybox") String q) {
		String url="https://www.google.com/search?q="+q;
	RedirectView rv = new RedirectView();
	rv.setUrl(url);
	return rv;
}
}
