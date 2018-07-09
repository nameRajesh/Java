package com.santosh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@RequestMapping(value = "/getform", method = RequestMethod.GET)
	public ModelAndView getFrom() {
		ModelAndView model = new ModelAndView("submitform");
//		model.addObject("mainMsg", "Form submitted");
		return model;
	}

//	@RequestMapping(value = "/formsubmit", method = RequestMethod.POST)
//	public ModelAndView submitFrom(@RequestParam("firstName") String firstName,
//			@RequestParam("lastName") String lastName) {
//
//		User user = new User();
//		user.setFirstName(firstName);
//		user.setLastName(lastName);
//		ModelAndView model = new ModelAndView("formsuccess");
//		model.addObject("mainMsg", "Form submitted by: " + firstName + " "
//				+ lastName);
//		model.addObject("user", user);
//		return model;
//	}

	 @RequestMapping(value = "/formsubmit", method = RequestMethod.POST)
	 public ModelAndView submitFrom(@ModelAttribute("user") User user) {
	 ModelAndView model = new ModelAndView("formsuccess");
//	  model.addObject("mainMsg", "Form submitted");
	 return model;
	 }

	@ModelAttribute
	public void addCommonObject(Model model) {
		model.addAttribute("mainMsg", "BroadWay Spring Learning");
	}
}
