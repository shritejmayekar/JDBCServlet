package com.bridgelabz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
	public static Connection connection;
	public LoginDao() throws ClassNotFoundException {
		
				Class.forName("com.mysql.jdbc.Driver");
				try {
					connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "pooja");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	public boolean fetchRecord(String email,String password) {
		Statement statement;
		try {
			statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select email,pass from Persons");
			while(resultSet.next()) {
				if(resultSet.getString(1).equals(email) && resultSet.getString(2).equals(password))
					return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
		
		
	}

}
