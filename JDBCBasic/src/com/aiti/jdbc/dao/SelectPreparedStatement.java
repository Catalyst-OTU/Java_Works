package com.aiti.jdbc.dao;

import java.sql.*;

public class SelectPreparedStatement {


	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String url = "jdbc:mysql://localhost:3306/mydb";
	
	public SelectPreparedStatement () {
		
		try {
			
		conn = DriverManager.getConnection(url, "root", "catalyst1006");
			
		// INSERT INTO DATABASE USING PREPARE STATEMENT
	//	ps = conn.prepareStatement("insert into accounts value(?,?,?,?)");	
		
		 ps = conn.prepareStatement("select * from accounts where acctNo = ?");	
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void view_Record() throws SQLException {
		
		// INSERT INTO DATABASE USING PREPARE STATEMENT
/*		ps.setInt(1, 1);
		ps.setString(2, "Akeem");
		ps.setString(3, "Amosu");
		ps.setInt(4, 2800);
	
		ps.executeUpdate();
		System.out.println("1 row inserted successfully");
*/	
		ps.setInt(1, 3);
		rs = ps.executeQuery();
		
	

		while(rs.next()) {
			
			System.out.println(rs.getInt("acctNo")+ " " + rs.getString("lastName")+ " " + rs.getString("firstName")+ " " + rs.getInt("balance"));
		}
	}
	

	
	public static void main(String[] args) {
		
		SelectPreparedStatement nt = new SelectPreparedStatement();
		
		try {
			nt.view_Record();
			
		} catch (SQLException e) {
			
			
			System.out.println(e.getMessage());
		}

	}

}
