package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.dao.LoginDao;
import com.bridgelabz.dao.RegisterDao;
import com.bridgelabz.dao.SendMailSSL;

/**
 * Servlet implementation class RecoveryEmail
 */
@WebServlet("/RecoveryEmail")
public class RecoveryEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RecoveryEmail() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		HttpSession httpSession = request.getSession();

		String recoverEmail = httpSession.getAttribute("recovery").toString();
		LoginDao loginDao;
		try {
			loginDao = new LoginDao();
			String email = loginDao.fetchRecoveryEmail(fname, lname, recoverEmail);
			if (email != null) {
				Random random = new Random();
				String number = "";
				for (int i = 0; i < 6; i++) {
					number = number + random.nextInt(9);
				}
				SendMailSSL sendMailSSL = new SendMailSSL();
				sendMailSSL.send(email, "verification code", number);
				RegisterDao registerDao = new RegisterDao();
				registerDao.addRecoveryAccount(email, number);
				request.setAttribute("recoverEmail", email);
				request.getRequestDispatcher("userNameRecovery.jsp").forward(request, response);
				// response.sendRedirect("userNameRecovery.jsp");

			} else {
				response.sendRedirect("filter");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
