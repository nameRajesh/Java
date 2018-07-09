package com.santosh.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.santosh.dto.UserDTO;
import com.santosh.service.UserService;
import com.santosh.utils.ProjectUtility;

/**
 * Servlet implementation class for User domain.
 */

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String INSERT_OR_EDIT = "/userCreate.jsp";
	private static String LIST_USER = "/userList.jsp";
	private static String LOGIN = "/login.jsp";
	private UserService userService;

	public UserController() {
		super();
		userService = new UserService();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String forward = "";
		String name = "";
		HttpSession session = request.getSession(false);
		if (session != null)
			name = (String) session.getAttribute("uname");
		else
			name = null;
		if (name != null) {
			String action = request.getParameter("action");

			if (action.equalsIgnoreCase("delete")) {
				int userId = Integer.parseInt(request.getParameter("userid"));
				userService.deleteUser(userId);
				forward = LIST_USER;
				request.setAttribute("users", userService.getAllUsers());
			} else if (action.equalsIgnoreCase("edit")) {
				forward = INSERT_OR_EDIT;
				int userId = Integer.parseInt(request.getParameter("userid"));
				UserDTO user = userService.getUserById(userId);
				request.setAttribute("user", user);
			} else if (action.equalsIgnoreCase("listUser")) {
				forward = LIST_USER;
				request.setAttribute("users", userService.getAllUsers());
			} else {
				forward = INSERT_OR_EDIT;
			}
		} else {
			forward = LOGIN;
		}
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		UserDTO userDTO = new UserDTO();
		userDTO.setFirstName(request.getParameter("firstName"));
		userDTO.setLastName(request.getParameter("lastName"));
		userDTO.setUsername(request.getParameter("username"));
		userDTO.setPassword(request.getParameter("password"));
		String dateOfBirth = request.getParameter("dob");
		try {
			Date dob = new SimpleDateFormat("MM/dd/yyyy").parse(dateOfBirth);
			userDTO.setDob(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		userDTO.setEmail(request.getParameter("email"));
		String userid = request.getParameter("userid");
		if (userid == null || userid.isEmpty()) {
			userService.saveUser(userDTO);
			ProjectUtility.sendMail();
		} else {
			userDTO.setUserId(Integer.parseInt(userid));
			userService.updateUser(userDTO);
		}

		RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
		request.setAttribute("users", userService.getAllUsers());
		view.forward(request, response);
	}

}
