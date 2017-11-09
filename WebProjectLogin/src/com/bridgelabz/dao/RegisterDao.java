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
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "pooja");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean addPerson(String firstName, String LastName, String password, String email, String birthday,
			String mobile, String recoverEmail, String location) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(
					"insert into Persons(firstName,lastName,email,pass,birthday,mobile,recoverEmail,location) values(?,?,?,?,?,?,?,?)");

			preparedStatement.setString(1, firstName);
			preparedStatement.setString(2, LastName);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, password);

			preparedStatement.setString(5, birthday);
			preparedStatement.setString(6, mobile);
			preparedStatement.setString(7, recoverEmail);
			preparedStatement.setString(8, location);
			int i = preparedStatement.executeUpdate();

			return (i > 0);
			// System.out.println(i+" record inserted");

		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	public boolean fetchRecord(String email) {
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select email from Persons");
			while (resultSet.next()) {
				if (resultSet.getString(1).equals(email))
					return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

	public void addRecoveryAccount(String email, String verificationCode) {
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection
					.prepareStatement("insert into recoveryAccount(email,verficationCode)  values(?,?)");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, verificationCode);
			int isInserted = preparedStatement.executeUpdate();
			if (isInserted > 0)
				System.out.print("success");
			else
				System.out.print("failed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
