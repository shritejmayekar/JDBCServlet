package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.dao.LoginDao;
import com.bridgelabz.dao.SendMailSSL;

/**
 * Servlet implementation class RecoveryVerifyPassword
 */
@WebServlet("/RecoveryVerifyPassword")
public class RecoveryVerifyPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecoveryVerifyPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String recoverycode = request.getParameter("code");
		LoginDao loginDao;
		try {
			loginDao = new LoginDao();
			HttpSession session = request.getSession();
			String recoverEmail = session.getAttribute("recovery").toString();
			String email = loginDao.isValidUser(recoverycode, recoverEmail);
			if (email != null) {
				String loginPassword = loginDao.fetchLoginPassword(email);
				SendMailSSL sendMailSSL = new SendMailSSL();
				sendMailSSL.send(recoverEmail, "Your Login Password :", loginPassword);
				out.print("<h2 style=color:green>Password is send to account </h2> ");
				session.invalidate();
				if (loginDao.deleteRecord(email, recoverycode))
					System.out.print("success");
				request.getRequestDispatcher("login").include(request, response);
			} else {
				out.print("<h2 style=color:red>verfication code does not match</h2>");
				request.getRequestDispatcher("userPasswordRecovery.jsp").include(request, response);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
