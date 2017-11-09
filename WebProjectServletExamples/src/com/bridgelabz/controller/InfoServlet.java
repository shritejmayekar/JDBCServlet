package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoServlet
 */
@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("</br>"+"When we use request.getRequestDispatcher(Myservlet2).forward(request, response);");
		out.print("</br> output will be</br>=======================</br>"
				+ "shantaram i am in servlet 2"+"</br>exit servlet 2");
		out.print("</br>=========================================");
		out.print("</br> when we userequest.getRequestDispatcher(Myservlet2).include(request, response);");
		out.print("</br> output will be</br>=================</br>"
				+ "shantaram i am in servlet 1"+"</br>shantaram i am in servlet 2"+"</br>exit servlet 2"+"</br>exit servlet 1");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
