package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<h1>"+"n"+"</h1>");
//		out.println("<h1>"+"p"+"</h1>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name= request.getParameter("n");
		String password = request.getParameter("p");
		if(name.equals("a")&& password.equals("s")) {
			RequestDispatcher rd = request.getRequestDispatcher("hi");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.include(request, response);
		}
	}

}
