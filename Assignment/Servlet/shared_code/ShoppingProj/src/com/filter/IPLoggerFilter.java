package com.filter;

import java.io.IOException;

import javax.servlet.*;

public class IPLoggerFilter implements Filter {

	@Override
	public void init(FilterConfig config) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("IPLoggerFilter: beforeDoFilter() Client IP: " 
			+ request.getRemoteAddr());
		chain.doFilter(request, response);
		System.out.println("IPLoggerFilter: afterDoFilter()");
	}

	@Override
	public void destroy() {
	}
}



