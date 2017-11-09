package com.bridgelabz.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.bridgelabz.dao.LoginDao;

/**
 * Servlet Filter implementation class Myfilter2
 */
@WebFilter("/filterPassword")
public class Myfilter2 implements Filter {

    /**
     * Default constructor. 
     */
    public Myfilter2() {
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
		String email = request.getParameter("recoveryEmail");
		LoginDao loginDao;
		response.setContentType("text/html");
		try {
			loginDao = new LoginDao();
			if (!loginDao.fetchEmail(email)) {
				response.getWriter().append("<h3 style=color:red;text-align:center;>email is not valid</h3>");
				request.getRequestDispatcher("forgotPassword.jsp").forward(request, response);
			}

			request.setAttribute("remail", email);
			chain.doFilter(request, response);

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
