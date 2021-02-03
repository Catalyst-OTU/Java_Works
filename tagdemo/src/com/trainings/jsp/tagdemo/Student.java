package com.trainings.jsp.tagdemo;

public class Student {

	private String firstName;
	private String lastName;
	private boolean feesDiscount;
	
	public Student(String firstName, String lastName, boolean feesDiscount) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.feesDiscount = feesDiscount;
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
	 * @return the feesDiscount
	 */
	public boolean isFeesDiscount() {
		return feesDiscount;
	}

	/**
	 * @param feesDiscount the feesDiscount to set
	 */
	public void setFeesDiscount(boolean feesDiscount) {
		this.feesDiscount = feesDiscount;
	}
	
	
	
	
	

}
