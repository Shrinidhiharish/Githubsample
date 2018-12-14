package com.softvision.jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	private static final String URL = "jdbc:mysql://localhost:3306/company";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	static Connection con = null;

	public static Connection getconnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("connection established");
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException sqe) {
			sqe.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}
}
