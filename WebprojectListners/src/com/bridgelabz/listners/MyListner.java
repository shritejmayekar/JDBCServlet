package com.bridgelabz.listners;

import javax.servlet.*;  
import java.sql.*;


import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyListner
 *
 */
@WebListener("/MyListner")
public class MyListner implements ServletContextListener {
	public static Connection connection;
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.print("destroyed listner");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		System.out.print("servlet listner started");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "pooja");
			ServletContext ctx=event.getServletContext();  
			ctx.setAttribute("myconnection",connection);  
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

   
}
