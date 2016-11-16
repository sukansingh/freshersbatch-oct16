package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Cart")
public class Cart extends HttpServlet 
{
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	PrintWriter pw = response.getWriter();
    	HttpSession session = request.getSession(true);
    	
    	pw.println("<html><body>");
    	
    	List list = (List) session.getAttribute("computer");
    	Iterator itr = list.iterator();
    	while(itr.hasNext())
    	{
    		pw.println(itr.next()+"</br>");
    	}
    
    	pw.println("<h3>--------------------------------</h3>");
    	
    	list = (List) session.getAttribute("history");
    	 itr = list.iterator();
    	while(itr.hasNext())
    	{
    		pw.println(itr.next()+"</br>");
    	}
    	pw.println("<form action='Controller?forward=Logout' method=post><input type='submit' value='Logout'</from>");
    	pw.println("</body></html>");
    	/*
    	Enumeration attributeNames = session.getAttributeNames();
    	while (attributeNames.hasMoreElements()) 
    	{
    	    String name = (String) attributeNames.nextElement();
    	    String value = (String) session.getAttribute(name);
    	    System.out.println(name + "=" + value);
    	    pw.println(name + "=" + value+"<br/>");
    	}
    	*/
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
