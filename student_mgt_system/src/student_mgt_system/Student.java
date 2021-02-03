package student_mgt_system;

import java.sql.*;
import java.util.*;

public class Student {

   private int studentid;
   private String studentName;
   private String address;
   private String studentClass;
   private int marks;
   
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet rs = null;
    

	String url = "jdbc:mysql://localhost:3306/mydb";
	
	
	
	
	public Student () {
		
		try {
			
			connection = DriverManager.getConnection(url, "root", "catalyst1006");
			
			preparedStatement = connection.prepareStatement("insert into studentmgt values (?,?,?,?,?)");
			
			
		} catch (SQLException e) {
		
			System.out.println(e.getMessage());
		}
		
		
		
 
	}

	
	public void addStudent()   {
		
		try {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Student ID :" );
		studentid = input.nextInt();
		System.out.println("Enter Student Name : ");
		studentName = input.nextLine();
		System.out.println("Enter Address : ");
		address = input.nextLine();
		System.out.println("Enter Class : ");
		studentClass = input.nextLine();
		System.out.println("Enter Marks :" );
		marks = input.nextInt(); 
		
		preparedStatement.setInt(1, studentid);
		preparedStatement.setString(2, studentName);
		preparedStatement.setString(3, address);
		preparedStatement.setString(4, studentClass);
		preparedStatement.setInt(5, marks);
		preparedStatement.execute();
		System.out.println("Record Inserted Successfully...");
		
		
		input.close();
		
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	
	}
	
	
	
	
	
	public void updateAddress () {
		try {
		connection = DriverManager.getConnection(url, "root", "catalyst1006");

		System.out.println("Please enter your Student ID :");
		Scanner input = new Scanner(System.in);
		int inputId = input.nextInt();
		System.out.println("Enter your new Address :");
		String inputAddress = input.nextLine();
		String sql = "update studentmgt set address = ? where studentid = ?";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, inputId);
		stmt.setString(2, inputAddress);
		int i = stmt.executeUpdate();
		if(i>0) {
			
			System.out.println("Record upadted successfully.....");
		}
		else {
			System.out.println("Record not found");
		}
		
		input.close();
		
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	
	
	}
	
	
	
	public void deleteStudent () {
		
		try {
			
			connection = DriverManager.getConnection(url, "root", "catalyst1006");
			System.out.println("Please enter the StudentName you want to delete :");
			Scanner input = new Scanner(System.in);
			String inputName = input.nextLine();
			String sql = "delete from studentmgt where studentName = ?";
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, inputName);
			int i = stmt.executeUpdate();
			
			if(i>0) {
				
				System.out.println("Record deleted Successfully");
			}
			else {
				System.out.println("Record not found");
			}
			
			input.close();
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
	}


	public void viewStudentDetails() {
		
		try {
			
		connection = DriverManager.getConnection(url, "root", "catalyst1006");
		System.out.println("Please enter the Student Name :");
		Scanner input = new Scanner(System.in);
		String inputName = input.nextLine();
		String sql = "select * from studentmgt";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, inputName);
		ResultSet rs = stmt.executeQuery();
		
		if(rs.next() == false) {
			
			System.out.println("There is no record in the Database");
		}
		else {
			
			rs.previous();
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString(3)+ " " + rs.getString(4)+ " " + rs.getInt(5));
			}
		}
		
		input.close();
		
		
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	

}
