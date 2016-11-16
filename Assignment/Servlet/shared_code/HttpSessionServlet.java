package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/httpsession")
public class HttpSessionServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

HttpSession session = request.getSession(true);
int hits = 1;
if(session.isNew()) { //NEW USER
	session.setAttribute("HITS", hits); //state of the client
}
else {
	hits = (Integer)session.getAttribute("HITS");
	hits++;
	session.setAttribute("HITS", hits);
}
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<html><body><h1>sessionId = " + session.getId() + "<br><br>HITS = " + hits + "</h1></body></html>");
	}


}
