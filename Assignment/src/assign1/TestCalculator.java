package assign1;

import java.util.Scanner;

public class TestCalculator {
	   

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//  DECLARATION OF VARIABLES
		   int firstNumber;
		   int secondNumber;
		
		Scanner input = new Scanner(System.in);
		Calculator count = new Calculator();
		
		System.out.println("Menu: " + "\n 1. Add  \n 2. Subtract  \n 3. Multiply  \n 4. Divide  \n 5. Exit");
		
		
		int choice = input.nextInt();
		
		switch(choice) {
		
		     case 1:
		     {
		    	 System.out.println("Please enter first Number: ");
		    	 firstNumber = input.nextInt();
		    	 System.out.println("Please enter second number: ");
		    	 secondNumber = input.nextInt();
		    	 count.setfirstNumber(firstNumber);
		    	 count.setsecondNumber(secondNumber);
		    	 
		    	 System.out.println("Your Addition answer is: " + count.add());
		     };break;
		     
		     case 2:
		     {
		    	 System.out.println("Please enter first Number: ");
		    	 firstNumber = input.nextInt();
		    	 System.out.println("Please enter second number: ");
		    	 secondNumber = input.nextInt();
		    	 count.setfirstNumber(firstNumber);
		    	 count.setsecondNumber(secondNumber);
		    	 
		    	 System.out.println("Your Subtraction answer is: " + count.subtract());
		     };break;
		     
		     case 3:
		     {
		    	 System.out.println("Please enter first Number: ");
		    	 firstNumber = input.nextInt();
		    	 System.out.println("Please enter second number: ");
		    	 secondNumber = input.nextInt();
		    	 count.setfirstNumber(firstNumber);
		    	 count.setsecondNumber(secondNumber);
		    	 
		    	 System.out.println("Your Multiplication answer is: " + count.multiply());
		     };break;
		     
		     case 4:
		     {
		    	 System.out.println("Please enter first Number: ");
		    	 firstNumber = input.nextInt();
		    	 System.out.println("Please enter second number: ");
		    	 secondNumber = input.nextInt();
		    	 count.setfirstNumber(firstNumber);
		    	 count.setsecondNumber(secondNumber);
		    	 System.out.println("Your Division answer is: " + count.divide());
		     };break;
		     
		     default: System.out.println("Goodbye! Next time, choose a number between 1 to 4");
		
		}
		
	}
	
	

}
