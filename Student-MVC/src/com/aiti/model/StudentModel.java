package com.aiti.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import com.aiti.entities.Student;


public class StudentModel {
	
	public List<Student> listAllStudent(DataSource datasource){
		
		List<Student> listStudents = new ArrayList<>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			conn = datasource.getConnection();
			stmt = conn.createStatement();
			String sql = "Select * from students";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
listStudents.add(new Student(rs.getInt("student_id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("email")));
			}
					
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return listStudents;
		
	} 
	
	
	
	
public void addNewStudent(DataSource datasource, Student newStudent) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			
			conn = datasource.getConnection();
			
			String firstName = newStudent.getFirstName();
			String lastName = newStudent.getLastName();
			String email = newStudent.getEmail();
			
			String query = "insert into students(firstname,lastname,email) values(?,?,?)";
			
			stmt = conn.prepareStatement(query);
			stmt.setString(1, firstName);
			stmt.setString(2, lastName);
			stmt.setString(3, email);
			stmt.execute();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		
	}
	




public void editStudent(DataSource datasource, Student editRecord) {
	
	Connection conn = null;
	PreparedStatement stmt = null;
	
	try {
		
		conn = datasource.getConnection();
		int student_id = editRecord.getStudent_id();
		String firstName = editRecord.getFirstName();
		String lastName = editRecord.getLastName();
		String email = editRecord.getEmail();
		
		String query = "update students set firstname=?, lastname=?, email=? where student_id = ?";
		
		stmt = conn.prepareStatement(query);
		stmt.setString(1, firstName);
		stmt.setString(2, lastName);
		stmt.setString(3, email);
		stmt.setInt(4, student_id);
		stmt.execute();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

	
}
	
	
}
