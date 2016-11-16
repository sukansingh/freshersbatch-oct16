package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns={"/authenticate"})
public class LoginServlet extends HttpServlet 
{
	ServletContext ctx;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		ctx = config.getServletContext();
	}

	public void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws
			ServletException, IOException
	{
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		if(username.equals(password)) {
			HttpSession session = request.getSession(true);
			session.setAttribute("USERNAME", username);
			rd = ctx.getRequestDispatcher("/controller?forward=welcome");
			rd.forward(request, response);
		}
		else {
			out.println("<html><body><form action='controller?forward=authenticate' method='POST'><h1>Sorry!! " +
					"Login Failed..</h1><h2>Username: <input type='text' name='uname'><br>Password: <input type='text' name='pwd'><br><input type='submit' value='OK'></h2></form></body></html>");
		}
	}
	
	public void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws
			ServletException, IOException
	{
		doGet(request, response);
	}
}




