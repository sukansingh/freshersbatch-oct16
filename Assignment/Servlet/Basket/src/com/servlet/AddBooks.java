package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
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

@WebServlet("/AddBooks")
public class AddBooks extends HttpServlet 
{
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	
    	HttpSession session = request.getSession();
    	
    	Enumeration e = request.getParameterNames();
		
    	List <String> list = new ArrayList<String>();
    	String paramName=null;
    	if(request.getParameter("page").equals("comp"))
    			paramName = "computer";
    	else
    		paramName = "history";
    	String[] paramValues = request.getParameterValues(paramName);
		//System.out.println("0 index : "+paramValues[0]);
		for(int i=0;i<paramValues.length;i++)
		{
			System.out.println(i+" | "+paramValues[i]);
			list.add(paramValues[i]);
		}
    	/*
    	int x=0;
    	while (e.hasMoreElements()) 
		{
			 
    		paramName = (String) e.nextElement();
    		if(paramName.equals("computer") || paramName.equals("history"))
    		{
    			System.out.println("x : "+x+" | "+paramName);
				String[] paramValues = request.getParameterValues(paramName);
				//System.out.println("0 index : "+paramValues[0]);
				for(int i=0;i<paramValues.length;i++)
				{
					System.out.println(x+" | "+i+" | "+paramValues[i]);
					list.add(paramValues[i]);
				}
    		}
    		
			
		}
		*/
    	session.setAttribute(paramName, list);
		if(request.getParameter("page").equals("comp"))
			response.sendRedirect("HistoryBooks.html");
		else
			response.sendRedirect("Cart");
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
