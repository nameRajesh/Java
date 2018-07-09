package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {
	
	@RequestMapping("/hi")
	public ModelAndView getHello() {
		ModelAndView view = new ModelAndView("hello");
		view.addObject("msg", "Hello, Spring MVC demo success. Done!");
		
		return view;
	}

}
