package com.santosh.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		// condition1
//		dataBinder.setDisallowedFields(new String[] { "mobileNo" });
		// condition2
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		dataBinder.registerCustomEditor(Date.class, "dob",
				new CustomDateEditor(dateFormat, false));
		// condition3 custom editor
		dataBinder.registerCustomEditor(String.class, "firstName",
				new UserNameEditor());
	}

	@RequestMapping(value = "/getform", method = RequestMethod.GET)
	public ModelAndView getFrom() {
		ModelAndView model = new ModelAndView("submitform");
		return model;
	}

	@RequestMapping(value = "/formsubmit", method = RequestMethod.POST)
	public ModelAndView submitFrom(@Valid @ModelAttribute("user") User user,
			BindingResult result) {
		if (result.hasErrors()) {
			ModelAndView model1 = new ModelAndView("submitform");
			return model1;
		}
		ModelAndView model = new ModelAndView("formsuccess");
		return model;
	}

	@ModelAttribute
	public void addCommonObject(Model model) {
		model.addAttribute("mainMsg", "Form submitted");
	}
}
