package com.santosh.springhibernatecrud.controller;

import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.santosh.springhibernatecrud.model.User;
import com.santosh.springhibernatecrud.service.UserService;

@Controller
public class UserController {
	private static final Logger logger = Logger.getLogger(UserController.class);
	@Autowired
	private UserService userService;

	@RequestMapping("/get")
	public String getUser(Map<String, Object> map) {
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("getWelcome is executed!");
		}

		// logs exception
		logger.error("This is Error message", new Exception("Testing"));
		map.put("user", new User());
		return "/userForm";
	}

	@RequestMapping("/list")
	public String listUsers(Map<String, Object> map) {
		map.put("userList", userService.listUsers());
		return "/listUsers";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user,
			BindingResult result) {
		userService.saveUser(user);
		return "redirect:list";
	}

	@RequestMapping("/delete")
	public String deleteUser(@ModelAttribute("user") User user,
			BindingResult result) {
		userService.deleteUser(user.getUserId());
		return "redirect:list";
	}

	@RequestMapping(value = "/edit")
	public ModelAndView editUser(@ModelAttribute("user") User user,
			BindingResult result) {
		User userr = userService.getUser(user.getUserId());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("user", userr);
		return new ModelAndView("updateUser", model);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateStudent(@ModelAttribute("user") User user,
			BindingResult result) {
		userService.saveUser(user);
		return "redirect:list";
	}

}
