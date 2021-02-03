package com.aiti.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDeleteDAO {


	public static void main(String[] args) {
		
		Connection connection = null;
		Statement stmt = null;
		String url = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "catalyst1006";
		String sql = "delete from accounts where acctNo = 1";
		// Get a connection to the database
		
		
		
		try {
			
			connection = DriverManager.getConnection(url, username, password);
			
			// Create a statement
			stmt = connection.createStatement();
			
			// Execute the query
			int result = stmt.executeUpdate(sql);
			
			System.out.println(result + " " + "row affected");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}


		// Process the results
		
		
		
		

	}

}
