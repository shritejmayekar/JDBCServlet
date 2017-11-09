package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/Add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletContext servletContext=getServletContext();
		Connection connection=(Connection) servletContext.getAttribute("myconnection");
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("insert into employee(name,dept) values(?,?)");
			preparedStatement.setString(1, request.getParameter("name"));
			preparedStatement.setString(2, request.getParameter("dept"));
			int i=preparedStatement.executeUpdate();
			if(i>0){
				System.out.print("record inserted");
				out.print("record added"+i);
				request.getRequestDispatcher("index.html").include(request, response);
			}
			else {
				System.out.print("record not inserted");
				out.print("record not added");
				
			}
			
		} catch (SQLException e) {
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
