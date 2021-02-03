package com.aiti.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertDAO {




	public static void main(String[] args) {
		
		  String url = "jdbc:mysql://localhost:3306/mydb";
		  Connection conn = null;
		  Statement stmt = null;
		  
		  try {
			  
			conn = DriverManager.getConnection(url, "root", "catalyst1006");
			
			stmt = conn.createStatement();
			
			int result1 = stmt.executeUpdate("INSERT INTO ACCOUNTS (lastName, firstName, balance) values ('Akkem', 'Amosu', '3000')");
			int result2 = stmt.executeUpdate("INSERT INTO ACCOUNTS (lastName, firstName, balance) values ('Otu', 'Bisamrk', '20000')");
			int result3 = stmt.executeUpdate("INSERT INTO ACCOUNTS (lastName, firstName, balance) values ('Okyere', 'Solomon', '7000')");
			int result4 = stmt.executeUpdate("INSERT INTO ACCOUNTS (lastName, firstName, balance) values ('No_Name', 'Eugene', '7000')");
			
			System.out.println(result4 + " " + "row(s) affected");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
