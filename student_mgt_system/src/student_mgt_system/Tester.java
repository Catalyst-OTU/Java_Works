package student_mgt_system;

import java.sql.*;
import java.util.*;

public class Tester {
	

	public static void main(String[] args) throws SQLException {
		
		try {
	
		
		Student student = new Student();
		
		boolean exit = true;
		
		while(exit) {
			
			System.out.println("Enter your Choice");
			System.out.println(" 1. Add Student \n 2. Delete Student  \n 3. Update Student \n 4. View all Student \n 5. Exit");
			Scanner input = new Scanner(System.in);
			
			
			

		
			switch(input.nextInt()) {
			
			
			      case 1: {
			    	  
			    	  student.addStudent();
			    	  
			      };break;
			
			      
			      case 2: {
			    	  
			    	  student.deleteStudent();
			    	  
			      };break;
			      
			      
			      case 3: {
			    	  
			    	  student.updateAddress();
			    	  
			      };break;
			      
			      case 4: {
			    	  
			    	  student.viewStudentDetails();
			    	  
			      };break;
			      
			      
			      
			      case 5: {
						
						exit = false;
						
					};break;
					
					
					default: {
						
						System.out.println("Please select between 1 to 5");
						break;
					}
			}
			
			
			
			input.close();
			
		}
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
