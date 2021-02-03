package com.aiti.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.*;

import com.aiti.entities.Student;
import com.aiti.model.StudentModel;

/**
 * Servlet implementation class Home
 */
@WebServlet("/home")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	@Resource(name="jdbc/student-mgt")
	private DataSource datasource;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String page = request.getParameter("page");
		
		switch(page) {
		
		// MEHTOD 1 GOING STRAIGHT TO GET YOUR REQUEST DISPATCHER
		case "home" -> request.getRequestDispatcher("index.jsp").forward(request, response);
		
		case "listStudent" -> { listStudent(request, response);   }
		
		case "addRecord" -> { 
			addRecord(request, response);
			listStudent(request, response);
		}
		
		case "editStudent" -> { 

			// METHOD 2  CREATING AN OBJECT OF REQUEST DISPATCHER (MEHTOD 1 AND 2 WILL GIVE YOU THE SAME RESULTS)
			RequestDispatcher dispatcher = request.getRequestDispatcher("edit-Student-form.jsp");
			dispatcher.forward(request, response);
		}
		
		default -> request.getRequestDispatcher("error.jsp").forward(request, response);
		
		
		}
		

	}
	
	
	public void listStudent (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		List<Student> list_student = new ArrayList<>();
		list_student = new StudentModel().listAllStudent(datasource);
		request.setAttribute("list_student", list_student);
		request.getRequestDispatcher("listStudent.jsp").forward(request, response);
		
	}
	


	public void addRecord (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		
		Student newStudent = new Student(firstName,lastName,email);
		new StudentModel().addNewStudent(datasource, newStudent);
		//request.getRequestDispatcher("addStudent.jsp").forward(request, response);
	}
	
	
	
	
	
	public void editStudentRecord (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int student_id = Integer.parseInt(request.getParameter("student_id"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		
		Student editStudent = new Student(student_id,firstName,lastName,email);
		new StudentModel().editStudent(datasource, editStudent);
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String from = request.getParameter("from");
		
		switch(from) {
						
		case "addRecord" -> { 
			addRecord(request, response);
			listStudent(request, response);
			
		}
		
		case "editStudent" -> { 
			editStudentRecord(request, response);
			listStudent(request, response);
		}
		
		
		default -> request.getRequestDispatcher("error.jsp").forward(request, response);
		
		
		}
	}

}
