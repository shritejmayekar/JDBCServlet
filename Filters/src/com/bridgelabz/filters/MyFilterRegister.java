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

/**
 * Servlet Filter implementation class MyFilterRegister
 */
@WebFilter("/MyFilterRegister")
public class MyFilterRegister implements Filter {

    /**
     * Default constructor. 
     */
    public MyFilterRegister() {
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
		String passwordFirst=request.getParameter("password");
		String passwordSecond=request.getParameter("confirmPassword");
		if(passwordFirst.equals(passwordSecond))
			chain.doFilter(request, response);
		else {
			out.print("please enter same password to confirm");
			request.getRequestDispatcher("register").include(request, response);;
			
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
