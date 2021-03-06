package com.aiti.entities;


public class Student {

	private int student_id;
	private String firstName;
	private String lastName;
	private String email;
	
	public Student(int student_id, String firstName, String lastName, String email) {
	
		this.student_id = student_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	
	
	public Student(String firstName, String lastName, String email) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}



	/**
	 * @return the student_id
	 */
	public int getStudent_id() {
		return student_id;
	}



	/**
	 * @param student_id the student_id to set
	 */
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}



	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}



	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	
	
	
	



	
	
	
	
	
	
	
	
	
	
}
