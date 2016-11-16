package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/addbooks")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext ctx;
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		ctx = config.getServletContext();
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String selectedBooks[] = request.getParameterValues("books");
		HttpSession session = request.getSession(false);
		ArrayList<String> bookList = (ArrayList<String>)session.getAttribute("SELECTED_BOOKS");
		if (bookList == null || bookList.size() == 0) {
			bookList = new ArrayList<String>();
		}
		if (selectedBooks != null && selectedBooks.length != 0) {
			for(int i=0; i<selectedBooks.length; i++) {
				bookList.add(selectedBooks[i]);
			}
		}
		session.setAttribute("SELECTED_BOOKS", bookList);
		RequestDispatcher rd = ctx.getRequestDispatcher("/controller?forward=mathematicsbooks");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
