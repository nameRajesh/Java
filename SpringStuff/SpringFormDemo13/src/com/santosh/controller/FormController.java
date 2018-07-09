package com.santosh.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@RequestMapping(value = "/getform", method = RequestMethod.GET)
	public ModelAndView getFrom() {
		ModelAndView model = new ModelAndView("submitform");
		return model;
	}

//	@RequestMapping(value = "/formsubmit", method = RequestMethod.POST)
//	public ModelAndView submitFrom(
//			@RequestParam("firstname") String firstName,
//			@RequestParam("lastname") String lastName) {
//		ModelAndView model = new ModelAndView("formsuccess");
//		model.addObject("msg", "Form submitted by: " + firstName + " "
//				+ lastName);
//		return model;
//	}

	@RequestMapping(value = "/formsubmit", method = RequestMethod.POST)
	public ModelAndView submitFromMap(@RequestParam Map<String, String> reqPar) {
		String firstName = reqPar.get("firstname");
		String lastName = reqPar.get("lastname");
		ModelAndView model = new ModelAndView("formsuccess");
		model.addObject("msg", "Form submitted by: " + firstName + " "
				+ lastName);
		return model;
	}
}
