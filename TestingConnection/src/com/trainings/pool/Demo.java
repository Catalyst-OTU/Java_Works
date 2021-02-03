package com.trainings.pool;

import java.io.*;
import java.sql.*;

import javax.annotation.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.*;


@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	@Resource(name="jdbc/mydb")
	private DataSource datasource;
	
	
    public Demo() {
        super();

    }

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PrintWriter out = response.getWriter();
		
		try {
			
			conn = datasource.getConnection();
			
			String sql = "Select * from ems_details";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			// PROCESS THE RESULTS
			
			while(rs.next()) {
				
				out.println("<html> <body> <br/>" + rs.getString(1) + rs.getString(2) + rs.getString(3) + rs.getString(4));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
