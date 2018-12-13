package com.softvision.jdbcDemo;

public class CompanyDAO {
	private static final String SELECT = " select*from Customers;";
	private static final String UPDATE = " ";
	public static String getQueriesSelect() {
		return SELECT;
	}

	public static String getQuerriesupdate() {
		return null;

	}
}