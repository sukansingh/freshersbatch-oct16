package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/controller")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext ctx;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		ctx = config.getServletContext();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("\tControllerServlet: doGet() [START]");
		String forward = request.getParameter("forward");
		RequestDispatcher rd = null;
		if("login".equals(forward)) {
			rd = ctx.getRequestDispatcher("/login.html");
		}
//		else if("authenticate".equals(forward)) {
//			LoginBean loginBean = new LoginBean();
//			loginBean.setUserName(request.getParameter("uname"));
//			loginBean.setPassword(request.getParameter("pwd"));
//			request.setAttribute("loginBeanRef", loginBean);
//			boolean result = loginBean.authenticate();
//			if (result==true) {
//				rd = ctx.getRequestDispatcher("/welcome.jsp");
//			}
//			else {
//				rd = ctx.getRequestDispatcher("/login.jsp");
//			}
//		}
		else if("authenticate".equals(forward)) {
			rd = ctx.getRequestDispatcher("/authenticate");
			//rd = request.getRequestDispatcher("/authenticate");
		}
		else if("welcome".equals(forward)) {
			rd = ctx.getRequestDispatcher("/computerbooks.html");
		}
		else if("mathematicsbooks".equals(forward)) {
			rd = ctx.getRequestDispatcher("/mathematicsbooks.html");
		}
		else if("addbooks".equals(forward)) {
			rd = ctx.getRequestDispatcher("/addbooks");
		}
		else if("showcart".equals(forward)) {
			rd = ctx.getRequestDispatcher("/showcart");
		}
		else if("logout".equals(forward)) {
			rd = ctx.getRequestDispatcher("/logout");			
		}
		System.out.println("\tControllerServlet: doGet() [END]");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
