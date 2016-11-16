package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/showcart")
public class ShowCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext ctx;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		ctx = config.getServletContext();
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String selectedBooks[] = request.getParameterValues("books");
		ArrayList<String> bookList = (ArrayList<String>)session.getAttribute("SELECTED_BOOKS");
		if (bookList == null || bookList.size() == 0) {
			bookList = new ArrayList<String>();
		}
		if (selectedBooks != null && selectedBooks.length != 0) {
			for(int i=0; i<selectedBooks.length; i++) {
				bookList.add(selectedBooks[i]);
			}
		}
		//session.setAttribute("SELECTED_BOOKS", bookList);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><form action='controller?forward=logout' method='POST'> <h1>Selected Books</h1><br><h2>");
		for(int i=0; i<bookList.size(); i++) {
			String book = bookList.get(i);
			out.println((i+1) + ") " + book + "<br>");
		}
		out.println("</h2><input type='submit' value='LOGOUT'></form></body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
