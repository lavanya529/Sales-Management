package com.cg.salesmanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cg.salesmanagement.bean.Product;

public class ProductDAO implements IProductDAO {


	public Product getProductDetails(Product product) {
		Product p = new Product();
		Scanner sc = new Scanner(System.in);
		if()
		
		return p ;
	}
	

	public boolean insertSalesDetails(Product product) {
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		getProductDetails( product);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesmanagement", "root", "root");
		Statement st = connection.createStatement();
		
		ResultSet resultSet = st.executeQuery("select * from products");
		if(product.getcode()==resultSet.getProductCode(2)) {
		
			lineTotal = Product_Price * quantity;
		}
		
		
		
	}


	public Product getProductDetails(int ProductCode) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
