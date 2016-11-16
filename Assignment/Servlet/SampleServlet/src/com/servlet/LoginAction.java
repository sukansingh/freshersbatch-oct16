package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet 
{
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		
		
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		
		String sc = getServletConfig().getInitParameter("p");
				
		pw.println(sc+"<br/>");
		
		if(uname.equals(pass))
		{
			pw.println("<h1>welcome "+uname+"</h1>");
			pw.println("<br/>Login Successful");
		}
		else
		{
			pw.println("<h1 style='color:red'>Login failed!!!</h1>");
		}
		
		pw.println("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
