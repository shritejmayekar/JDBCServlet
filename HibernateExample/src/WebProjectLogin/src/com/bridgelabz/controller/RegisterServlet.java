package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.dao.RegisterDao;

/**
 * Servlet implementation class RegisterServlet
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String month=request.getParameter("month");
		String day=request.getParameter("day");
		String year=request.getParameter("year");
		String mobile=request.getParameter("mobile");
		String recoveryEmail=request.getParameter("remail");
		String location=request.getParameter("location");
		PrintWriter out=response.getWriter();
		RegisterDao registerDB;
		try {
			registerDB = new RegisterDao();
			boolean inserted=registerDB.addPerson( firstName, lastName,password,email,day+"/"+month+"/"+year,mobile,recoveryEmail,location);
			if(inserted) {
				out.print("<label>registered success</label>");
				request.getRequestDispatcher("login.jsp").include(request, response);
				//response.sendRedirect("login.html");
			}
			else {
				out.print("<label style=margin-top:50%;>unsuccessfull register</label>");
				request.getRequestDispatcher("register.jsp").include(request, response);
				//response.sendRedirect("regis.html");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
