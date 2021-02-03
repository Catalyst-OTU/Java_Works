package tester;

import java.util.Scanner;

import assign2.Customer;


public class TestCustomer {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		String email;
		int age;
		double creditLimit;
		String details;
		String detail;
		
		Scanner input = new Scanner(System.in);
				
		
		System.out.println("Please enter your name :");
		name = input.next();
		
		System.out.println("Please enter your email :");
		email = input.next();
		
		System.out.println("Please enter your age :");
		age = input.nextInt();
		
		System.out.println("Please enter your Credit Limit :");
		creditLimit = input.nextDouble();
		
		Customer cust = new Customer();
		//detail = cust.getDetails();
		
		Customer cust1 = new Customer(creditLimit,name,email,age);
		details = cust1.toString();
		detail = cust1.getString();
		
		System.out.println(detail);
		


	}

}
