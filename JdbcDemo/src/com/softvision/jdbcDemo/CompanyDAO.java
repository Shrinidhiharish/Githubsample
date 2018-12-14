package com.softvision.jdbcDemo;

public class CompanyDAO {
	private static final String SELECTCUSTOMERS = " select*from Customers";
	private static final String SELECTORDERS = " select*from orders";
	private static final String SELECTPRODUCT = " select*from product";
	private static final String SELECTORDER_ITEMS= " select*from orders";
	

	
	public static String getQueriesSelectCustomers() {
		return SELECTCUSTOMERS;
	}
	public static String getQueriesSelectorders() {
		return SELECTORDERS;
	}

	public static String getQueriesSelectproduct() {
		return SELECTPRODUCT;
	}

	public static String getQueriesSelectorder_items() {
		return SELECTORDER_ITEMS;
	}


	
	
}