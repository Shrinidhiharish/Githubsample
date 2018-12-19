package com.softvision.jdbcDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.softvision.userchoice.UserChoice;
public class MainRunner {
	static Connection con = null;  //class level variable 

	public static void main(String[] args) throws SQLException {
		while (true) {

			int choice;
			Scanner sc = new Scanner(System.in);  // Declare the object and initialize with  predefined standard input object 
	                                                
			System.out.println("select the table on which you wish to perform opersations:");
			System.out.println("1. customers \t 2.Order_items \t 3. Orders \t 4. Products 5. Exit\n ");
			choice = sc.nextInt();
			switch (choice) {
			
			case 1:
				System.out.println("Customers table");
				UserChoice.getuseroperationcustomers();
				break;
				
			case 2:
				System.out.println("Order_items table");
				UserChoice.getuseroperationOrder_items();
				break;
				
			case 3:
				System.out.println("Orders table");
				UserChoice.getuseroperationOrders();
				break;
			
			case 4:
				System.out.println("Products table");
				UserChoice.getuseroperationProducts();
				break;

			case 5:
				System.out.println("system exited");
				System.exit(0);
				break;
			default:
				System.out.println("no other choice");

			}
		}
	}
}

