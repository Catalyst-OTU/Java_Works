package trials;

import java.io.*;

import java.util.*;

public class Basics {

	Scanner s = new Scanner(System.in);
	double radius = s.nextDouble();
    double perimeter;
    double area;
    
    
	public double perimeter1() {
		
		return 2 * Math.PI * radius;
	}
	
	public double area1() {
		
		return Math.PI * radius * radius;
	}
    
    
	
	
	public static void main(String[] args) {
		
		
		 
		Basics obj = new Basics();
		

		boolean exit = true;
						
					while(exit) {
							
					System.out.println("Choose your choice");
					System.out.println(" 1. Add Perimeter of a Circle \n 2. Add Area of a Circle");
		              
		            switch(obj.s.next()) {
				
				        case 1: {
		                  		System.out.println("Please enter radius: ");
		                  		double results = obj.perimeter1() * obj.radius;
				        		System.out.println("The Perimeter of is " + results);
				        };break;
		                      
		                      
		                      
		                      
		                      
		                    }
		              
		            }
			

		
		
		
		
		
		  // FILE READER READS EVERY CHARCTER BYTE BY BYTE
//		try {
//			FileReader reader = new FileReader("test.txt");
//			int data = reader.read();
//			
//			while(data != -1) {
//				
//				System.out.print((char)data);
//				data = reader.read();
//			}
//			reader.close();
//			
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
//		
		
		
		
		
		
		
		//FILEWRITE CREATES A FILE 
//	try {
//		FileWriter file = new FileWriter("test1.txt");
//		file.write("God is Good");
//		file.append("\nAll the time");
//		file.close();
//		
//	} catch (IOException e) {
//		
//		e.printStackTrace();
//	}
		
		
		
		
		
		
//		  FILE
//		File file = new File("test.txt");
//		
//		if(file.exists()) {
//			System.out.println("File Exist");
//			System.out.println(file.getAbsolutePath());
//		}
//		else {
//			System.out.println("File does not Exist");
//		}
		
		
		
		
	
		
		// EXCEPTION HANDLING
//		try(Scanner input = new Scanner(System.in)) {
//			
//			System.out.println("Please Enter first Number: ");
//			double firstNumber = input.nextDouble();
//			
//			System.out.println("Enter Second Number :");
//			double secondNumber = input.nextDouble();
//			
//			double results = firstNumber / secondNumber;
//			
//			System.out.println("Your Answer is " + results);
//		
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Denominator should not be zero");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("Only Numbers is required");
//		}
//		catch(Exception e) {
//			System.out.println("Something Went Wrong");
//		}
//		finally {
//			System.out.println("This will always print");
//		}
		
	}

	private static void area() {
		// TODO Auto-generated method stub
		
	}

	private static void perimeter() {
		// TODO Auto-generated method stub
		
	}

}
