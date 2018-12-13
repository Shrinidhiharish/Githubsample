package com.softvision.jdbcDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainRunner {
	static Connection con=null;

	public static void main(String[] args) {

		try {
			con = ConnectionUtil.getconnection();
			Statement stmt = con.createStatement();
			String query = CompanyDAO.getQueriesSelect();

			ResultSet rs = stmt.executeQuery(query);
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
