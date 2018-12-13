package com.softvision.userchoice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.softvision.jdbcDemo.ConnectionUtil;

public class UserChoice {
	static Connection con = null;

	public static void getuseroperationOrders() throws SQLException {
		int operations;
		System.out.println("enter your operation choice");
		System.out.println("1. Insert \t 2. Select \t 3. Update \t 4. Search \n");
		Scanner sc = new Scanner(System.in);
		operations = sc.nextInt();

		switch (operations) {
		case 1:
			con = ConnectionUtil.getconnection();
			PreparedStatement stmt = con.prepareStatement("insert into Orders values(?,?,?,?)");
			stmt.setInt(1, 14);// 1 specifies the first parameter in the query
			stmt.setInt(2, 101);
			stmt.setInt(3, 6472);
			stmt.setString(4, "12/06/18");
			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted " + "successful!!!!");
			con.close();
			System.out.println("Insert");
			break;
				
		case 2:
			System.out.println("Select");
			
			break;
				
		case 3:
			System.out.println("Update");
			
			PreparedStatement stmt1=con.prepareStatement("update orders set Total=? where Order_ID=?");  
			stmt1.setInt(1,123456);    
			stmt1.setInt(2,11);  
			  
			int i1=stmt1.executeUpdate();  
			System.out.println(i1+" records updated");  
			
			
			break;
			
			
		case 4:
			System.out.println("Search");
			
			
			break;

		default:
			System.out.println("no other choice for operation");

		}
	}

	public static void getuseroperationcustomers() throws SQLException {
		int operations;
		System.out.println("enter your operation choice");
		System.out.println("1. Insert \t 2. Select \t 3. Update \t 4. Search \n");
		Scanner sc = new Scanner(System.in);
		operations = sc.nextInt();

		switch (operations) {
		case 1:
			System.out.println("Insert");
			
			con = ConnectionUtil.getconnection();
			PreparedStatement stmt = con.prepareStatement("insert into customers values(?,?,?,?,?)");
			stmt.setInt(1, 104);      
			stmt.setString(2, "madni");
			stmt.setString(3,"Afroze");
			stmt.setString(4, "Trainee");
			stmt.setString(5,"9901237882");
			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted " + "successful!!!!");
			con.close();
			break;
			
			
			
		case 2:
			System.out.println("Select");
			break;
			
			
			
		case 3:
			System.out.println("Update");
			PreparedStatement stmt1=con.prepareStatement("update Customers set Customer_Title=? where Cust_ID=?");  
			stmt1.setString(1,"TestLead");    
			stmt1.setInt(2,104);  
			  
			int i1=stmt1.executeUpdate();  
			System.out.println(i1+" records updated");  
			
			break;
			
			
		case 4:
			System.out.println("Search");
			break;
			
			

		default:
			System.out.println("no other choice for operation");

		}
	}

	public static void getuseroperationOrder_items() throws SQLException {
		int operations;
		System.out.println("enter your operation choice");
		System.out.println("1. Insert \t 2. Select \t 3. Update \t 4. Search \n");
		Scanner sc = new Scanner(System.in);
		operations = sc.nextInt();

		switch (operations) {
		case 1:
			System.out.println("Insert");
			con = ConnectionUtil.getconnection();
			PreparedStatement stmt = con.prepareStatement("insert into Order_items values(?,?,?)");
			stmt.setInt(1,14 );  
			stmt.setInt(2, 4);
			stmt.setString(3,"footware");
			
			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted " + "successful!!!!");
			con.close();
			break;
			
		case 2:
			System.out.println("Select");
			break;
			
		case 3:
			System.out.println("Update");
			PreparedStatement stmt1=con.prepareStatement("update order_items set iteams=? where Order_ID=?");  
			stmt1.setString(1,"fruits");      
			stmt1.setInt(2,11);  
			  
			int i1=stmt1.executeUpdate();  
			System.out.println(i1+" records updated");  
			
			break;
		case 4:
			System.out.println("Search");
			break;

		default:
			System.out.println("no other choice for operation");

		}
	}

	public static void getuseroperationProducts() throws SQLException {
		int operations;
		System.out.println("enter your operation choice");
		System.out.println("1. Insert \t 2. Select \t 3. Update \t 4. Search \n");
		Scanner sc = new Scanner(System.in);
		operations = sc.nextInt();

		switch (operations) {
		case 1:
			System.out.println("Insert");
			con = ConnectionUtil.getconnection();
			PreparedStatement stmt = con.prepareStatement("insert into Products values(?,?,?)");
			stmt.setInt(1, 104); 
			stmt.setInt(2, 2345);
			stmt.setString(3,"asefgr");
			
			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted " + "successful!!!!");
			con.close();
			break;
		case 2:
			System.out.println("Select");
			break;
			
		case 3:
			System.out.println("Update");
			PreparedStatement stmt1=con.prepareStatement("update Products set price=? where product_ID=?");  
			stmt1.setInt(1,2344566);    
			stmt1.setInt(2,3);  
			  
			int i1=stmt1.executeUpdate();  
			System.out.println(i1+" records updated");  
			
			break;
			
		case 4:
			System.out.println("Search");
			break;

		default:
			System.out.println("no other choice for operation");

		}

	}
}
