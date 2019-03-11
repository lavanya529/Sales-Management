package com.cg.salesmanagement.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cg.salesmanagement.bean.Product;
import com.cg.salesmanagement.dao.ProductDAO;

public class Client {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Product product= new Product(null, 0, 0, null, 0);
		ProductDAO pDAO= new ProductDAO();
		
		//taking the option from user
		System.out.println("enter your option");
		System.out.println("1.sales details");
		System.out.println("2.insert sales");
		int ch= sc.nextInt();
		if(ch==1) {
		//mysql commands for printing the table
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesmanagement", "root", "root");
			Statement st = connection.createStatement();
			
			ResultSet resultSet = st.executeQuery("select * from products");
			while(resultSet.next()) {
				
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getInt(5));
			}
			connection.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	else {
		System.out.println("Enter product code");
		int code= sc. nextInt();
		
		System.out.println("Enter quantity");
		int quantity = sc .nextInt();
		
		insertSalesDetails( code);
	}
			

	
	}

	private static void insertSalesDetails(int code) {
		// TODO Auto-generated method stub
		
	}
}
