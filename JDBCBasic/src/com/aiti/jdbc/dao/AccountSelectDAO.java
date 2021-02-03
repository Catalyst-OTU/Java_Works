package com.aiti.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountSelectDAO {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/mydb";
		String username = "root";
		String password = "catalyst1006";
		
		String sql = "select * from accounts";
		// Get a connection to the database
		
		
		try {
			
			connection = DriverManager.getConnection(url, username, password);
			
			// Create a statement
			stmt = connection.createStatement();
			
			// Execute the query
			rs  = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString("firstName")+ " " + rs.getInt("balance"));
				
			}
			
		
			
		} catch (SQLException e) {

			e.printStackTrace();
		}


		// Process the results

	}

}
