package com.bridgelabz.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.bridgelabz.dao.RegisterDao;

/**
 * Servlet Filter implementation class MyFilter
 */
//@WebFilter("/MyFilter")
public class MyFilter implements Filter {

    /**
     * Default constructor. 
     */
    public MyFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email = request.getParameter("email");
		RegisterDao registerDao;
		try {
			registerDao = new RegisterDao();
			boolean isPresent = registerDao.fetchRecord(email);
			if (isPresent)
				chain.doFilter(request, response);
			else {
				out.print("<h3 style=color:red>Email id does't exist</h3>");
				request.getRequestDispatcher("login").include(request, response);
			}
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
