package exception;

import java.util.*;

public class TryException {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.println("Please enter your age :");
		num = input.nextInt();
		
		System.out.println("Your are" + num + "years old");
		
		input.close();
//		try {
//			
//			
//		   CalculatoException.show();
//			
//		}catch(Exception i) {
//			
//			System.out.println(i);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//   EXCEPTION WHICH TAKES INPUT
//		
//		Scanner input = new Scanner(System.in);
//		
//		try {
//			
//			int num;
//			int num1;
//			int num2;
//			
//			System.out.println("Please enter first number :");
//			num1 = input.nextInt();
//			
//			System.out.println("Please enter second number :");
//			num2 = input.nextInt();
//			
//			try {
//				
//				num = num1 / num2;
//				System.out.println("Your answer is " + num);
//				
//			}catch(ArithmeticException ae) {
//				
//				System.out.println("The Exception is " + ae);
//				System.out.println("Please your denomintor should be greater than zero");
//			}
//		}catch(Exception e) {
//			
//			System.out.println("The Exception is " + e);
//			System.out.println("Please your denomintor should be greater than zero");
//		}
		
		
		
//		int a = 34;
//		int b = 21;
//		
//		try {
//			
//			int z = a + b;
//			
//			try {
//				
//				int p = z + 2;
//				System.out.println(p);
//				
//			}catch(ArithmeticException ae) {
//				
//				System.out.println("First Exception" + ae);
//			}
//			
//		}catch(ArithmeticException ae) {
//			
//			System.out.println("This is my Second Exception" + ae); 
//		}
		

	}

}
