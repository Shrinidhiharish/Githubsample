package com.softvision.userchoice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.softvision.jdbcDemo.ConnectionUtil;

public class UserChoice {
	static Connection con = null;
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	static int i = 0;

	public static void getuseroperationOrders() throws SQLException {
		int operations;
		System.out.println("enter your operation choice");
		System.out.println("1. Insert \t 2. Select \t 3. Update \t 4. Search \n");
		Scanner sc = new Scanner(System.in);
		operations = sc.nextInt();
		
		switch (operations) {
		case 1:
			con = ConnectionUtil.getconnection();
			ps = con.prepareStatement("insert into Orders values(?,?,?,?)");
			ps.setInt(1, 14);
			ps.setInt(2, 101);
			ps.setInt(3, 6472);
			ps.setString(4, "12/06/18");
			i = ps.executeUpdate();
			System.out.println(i + " records inserted " + "successful!!!!");
			con.close();
			System.out.println("Insert");
			break;

		case 2:
			System.out.println("Select");
			con = ConnectionUtil.getconnection();
			ps = con.prepareStatement("select * from orders");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			break;

		case 3:
			System.out.println("Update");
			ps = con.prepareStatement("update orders set Total=? where Order_ID=?");
			ps.setInt(1, 123456);
			ps.setInt(2, 11);
			i = ps.executeUpdate();
			System.out.println(i + " records updated");
			break;

		case 4:
			System.out.println("Search");
			con = ConnectionUtil.getconnection();
			ps = con.prepareStatement("select * from Customers where Cust_ID=?");
			ps.setString(1, "101");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}

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
			ps = con.prepareStatement("insert into customers values(?,?,?,?,?)");
			ps.setInt(1, 104);
			ps.setString(2, "madni");
			ps.setString(3, "Afroze");
			ps.setString(4, "Trainee");
			ps.setString(5, "9901237882");
			int i = ps.executeUpdate();
			System.out.println(i + " records inserted " + "successful!!!!");
			con.close();
			break;

		case 2:
			System.out.println("Select");
			con = ConnectionUtil.getconnection();
			ps = con.prepareStatement("select * from Customers");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			break;

		case 3:
			System.out.println("Update");
			con = ConnectionUtil.getconnection();

			ps = con.prepareStatement("update Customers set Customer_Title=? where Cust_ID=?");
			ps.setString(1, "TestLead");
			ps.setInt(2, 104);
			i = ps.executeUpdate();
			System.out.println(i + " records updated");

			break;

		case 4:
			System.out.println("Search");
			con = ConnectionUtil.getconnection();
			ps = con.prepareStatement("select * from Customers where Cust_ID=?");
			ps.setString(1, "101");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}

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
			stmt.setInt(1, 14);
			stmt.setInt(2, 4);
			stmt.setString(3, "footware");

			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted " + "successful!!!!");
			con.close();
			break;

		case 2:
			System.out.println("Select");

			break;

		case 3:
			System.out.println("Update");
			con = ConnectionUtil.getconnection();
			PreparedStatement stmt1 = con.prepareStatement("update order_items set iteams=? where Order_ID=?");
			stmt1.setString(1, "fruits");
			stmt1.setInt(2, 11);

			int i1 = stmt1.executeUpdate();
			System.out.println(i1 + " records updated");

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
			stmt.setString(3, "asefgr");

			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted " + "successful!!!!");
			con.close();
			break;
		case 2:
			System.out.println("Select");

			break;

		case 3:
			System.out.println("Update");
			con = ConnectionUtil.getconnection();
			PreparedStatement stmt1 = con.prepareStatement("update Products set price=? where product_ID=?");
			stmt1.setInt(1, 2344566);
			stmt1.setInt(2, 3);

			int i1 = stmt1.executeUpdate();
			System.out.println(i1 + " records updated");

			break;

		case 4:
			System.out.println("Search");
			break;

		default:
			System.out.println("no other choice for operation");

		}

	}
}
