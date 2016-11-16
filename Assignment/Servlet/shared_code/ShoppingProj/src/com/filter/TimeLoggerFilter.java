package com.filter;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns= {"/*"})
public class TimeLoggerFilter implements Filter {

	@Override
	public void init(FilterConfig config) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("TimeLoggerFilter: beforeDoFilter()");
		long startTime = System.nanoTime();
		chain.doFilter(request, response);
		long endTime = System.nanoTime();
		System.out.println("TimeLoggerFilter: afterDoFilter()"
				+ " Time Required: " + (endTime - startTime));
	}

	@Override
	public void destroy() {
	}
}



