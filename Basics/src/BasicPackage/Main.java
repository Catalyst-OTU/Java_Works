package BasicPackage;

import java.util.Scanner;

public class Main {

	//public Main() {
		// TODO Auto-generated constructor stub
	//}
      
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner input = new Scanner(System.in);
		Basic numbers = new Basic();
		
		
		System.out.println("Please select any of the Operators" + "\n 1. Multiplication \n 2. Addition \n 3. Subtraction \n 4. Division \n 5. Reminder");
		
		
		int choice = input.nextInt();
		
		switch(choice) {
		         case 1: {
		        	 System.out.println("Type first number: ");
		        	 int num1 = input.nextInt();
		        	 System.out.println("Type Second number: ");
		        	 int num2 = input.nextInt();
		        	 numbers.setNum1(num1);
		    	     numbers.SetNum2(num2);
		    	     System.out.println("The Multiplication answer is: " + numbers.multi());
		         };break;
		         
		         case 2: {
		        	 System.out.println("Type first number: ");
		        	 int num1 = input.nextInt();
		        	 System.out.println("Type Second number: ");
		        	 int num2 = input.nextInt();
		        	 numbers.setNum1(num1);
		    	     numbers.SetNum2(num2);
		    	     System.out.println("The Addition answer is: " + numbers.add());
		         };break;
		         
		         case 3: {
		        	 System.out.println("Type first number: ");
		        	 int num1 = input.nextInt();
		        	 System.out.println("Type Second number: ");
		        	 int num2 = input.nextInt();
		        	 numbers.setNum1(num1);
		    	     numbers.SetNum2(num2);
		    	     System.out.println("The Subtraction answer is: " + numbers.sub());
		         };break;
		         
		         case 4: {
		        	 System.out.println("Type first number: ");
		        	 int num1 = input.nextInt();
		        	 System.out.println("Type Second number: ");
		        	 int num2 = input.nextInt();
		        	 numbers.setNum1(num1);
		    	     numbers.SetNum2(num2);
		    	     System.out.println("The Division answer is: " + numbers.div());
		         };break;
		         
		         case 5: {
		        	 System.out.println("Type first number: ");
		        	 int num1 = input.nextInt();
		        	 System.out.println("Type Second number: ");
		        	 int num2 = input.nextInt();
		        	 numbers.setNum1(num1);
		    	     numbers.SetNum2(num2);
		    	     System.out.println("The Multiplication answer is: " + numbers.reminder());
		         };break;
		         
		         default: System.out.println("Please choose between 1 to 3");};
		}
		
		
		//int num1 = input.nextInt();
		//int num2 = input.nextInt();
		
	    

	}


