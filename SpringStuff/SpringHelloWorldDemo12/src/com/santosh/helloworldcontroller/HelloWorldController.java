package com.santosh.helloworldcontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		ModelAndView modelAndView = new ModelAndView("Hello");
		modelAndView.addObject("msg", "Hello World!!!!");
		return modelAndView;

	}

	 @RequestMapping("/welcome/{userName}")
	 public ModelAndView welcome(@PathVariable("userName") String name) {
	 ModelAndView modelAndView = new ModelAndView("Hello");
	 modelAndView.addObject("msg", "Welcome " + name);
	 return modelAndView;
	
	 }

	@RequestMapping("/pathpractice1/{path1}/{path2}")
	public ModelAndView listOfPath(@PathVariable("path1") String pathVar1,
			@PathVariable("path2") String pathVar2) {
		ModelAndView modelAndView = new ModelAndView("Hello");
		modelAndView.addObject("msg", "Welcome " + pathVar1 + " " + pathVar2);
		return modelAndView;

	}

	@RequestMapping("/pathpractice2/{path1}/{path2}")
	public ModelAndView listOfPaths(@PathVariable Map<String, String> pathVars) {
		String pathVar1 = pathVars.get("path1");
		String pathVar2 = pathVars.get("path2");
		ModelAndView modelAndView = new ModelAndView("Hello");
		modelAndView.addObject("msg", "Welcome " + pathVar1 + " " + pathVar2);
		return modelAndView;

	}
}
