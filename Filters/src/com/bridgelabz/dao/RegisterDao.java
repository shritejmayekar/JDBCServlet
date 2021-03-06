package com.bridgelabz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterDao {
	public static Connection connection;
	public RegisterDao() throws ClassNotFoundException {
		
				Class.forName("com.mysql.jdbc.Driver");
				try {
					connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "pooja");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	public boolean addPerson(String firstName,String LastName,String password,String email,String birthday) {
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("insert into Persons(firstName,lastName,email,pass,birthday) values(?,?,?,?,?)");

			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, LastName);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, password);
	
			preparedStatement.setString(5, birthday);
			int i=preparedStatement.executeUpdate();
			connection.close();

			return (i>0);
			//System.out.println(i+" record inserted");
			

		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	public boolean fetchRecord(String email) {
		Statement statement;
		try {
			statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("select email from Persons");
			while(resultSet.next()) {
				if(resultSet.getString(1).equals(email))
					return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
		
		
	}

}
