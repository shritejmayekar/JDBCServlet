package com.bridgelabz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
	public static Connection connection;

	public LoginDao() throws ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "pooja");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean fetchRecord(String email, String password) {
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select email,pass from Persons");
			while (resultSet.next()) {
				if (resultSet.getString(1).equals(email) && resultSet.getString(2).equals(password))
					return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

	public void sendMessage(String fname, String lname) {

	}

	public boolean fetchFirstAndLast(String fname, String lname) {
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select firstName,lastName from Persons");
			while (resultSet.next()) {
				if (resultSet.getString(1).equals(fname) && resultSet.getString(2).equals(lname))
					return true;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

	public boolean fetchEmail(String email) {
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select recoverEmail from Persons");
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

	public String fetchRecoveryEmail(String fname, String lname, String email) {
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select firstName,lastName,recoverEmail from Persons");
			while (resultSet.next()) {
				if (resultSet.getString(1).equals(fname) && resultSet.getString(2).equals(lname)
						&& resultSet.getString(3).equals(email))
					return resultSet.getString(3);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public String isValidUser(String verficationCode, String recoverEmail) {
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select email,verficationCode from recoveryAccount");
			while (resultSet.next()) {
				if (resultSet.getString(1).equals(recoverEmail) && resultSet.getString(2).equals(verficationCode))
					return resultSet.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public String fetchLoginEmail(String email) {
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select email,recoverEmail from Persons");
			while (resultSet.next()) {
				if (resultSet.getString(2).equals(email))
					return resultSet.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}
	public String fetchLoginPassword(String email) {
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select pass,recoverEmail from Persons");
			while (resultSet.next()) {
				if (resultSet.getString(2).equals(email))
					return resultSet.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public boolean deleteRecord(String email, String code) {

		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("delete from recoveryAccount where email=? AND verficationCode=?");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, code);
			int record = preparedStatement.executeUpdate();
			if (record > 0)
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

}
