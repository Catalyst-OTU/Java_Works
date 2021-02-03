package assign4;

//2.4  Add computeGPA method in Student class
//Accept 3 scores for quiz , test & assignments
//GPA should be computed on 20 % of quiz score, 50% of test score & 30% of assignment score.
//
//3 Write a TestStudents class in "com.tester" package
//
//Accept how many students to enroll in the class ,  from user.
//
// Accept student details(w/o gpa) , using loop.
//Accept student scores & compute GPAs , using loop
//Display name of student having highest GPA.

import java.util.Scanner;

public class TestStudents {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        Scanner input = new Scanner(System.in);
		
		System.out.println("How many Students do you want to Enroll : ");

		Student[] enroll = new Student[input.nextInt()];

		boolean run = true;
		
		while(run) {
			
			System.out.println("Please choose an option\n");
System.out.println(" 1. Enter student details \n 2. Enter student scores \n 3. Display Details of Students \n 4. Display Details of student with the highest GPA \n 5. Exit");
			
			switch(input.nextInt()) {
			
			         case 1: {
			        	 
			        	    for(int i = 0; i < enroll.length; i++) {
				        	System.out.println("Please Enter Student Details : name, email, age");
//			        		enroll[i] = new Student(input.next(), input.next(), input.nextInt());
				        	enroll[i] = new Student(input.next(), input.next(), input.nextInt());

			        	                                 }
			                };break;
			                
			         case 2: {
			        	 
			        	    for(int i = 0; i < enroll.length; i++) {
			        	    	
			        	    	
			        	    	System.out.println("Enter your exam Score QUIZ, TEST AND ASSIGMMENT");
			        	    	enroll[i].computeGPA(input.nextDouble(), input.nextDouble(), input.nextDouble());

			        	    }
			              };break;
			              
			              
			         case 3: {
			        	 
			        	 for(Student stud : enroll) {
			        		 
			        		 System.out.println(stud.getDetails());
			        	                            }
						  			
						  		  };break;
						  		  
						  		  
			         case 4 : {
			        
			        	 
			        	 double MaxGPA = enroll[0].getGPA();
			        	 int gpaFinder = 0;
			        	 
			        	 for(int i = 0; i < enroll.length; i++) {
			        		 
			        		 if (enroll[i].getGPA() > MaxGPA) {
			        			 
			        			 gpaFinder = i;
			        			 MaxGPA = enroll[i].getGPA();
			        		 }
			        		 
			        	 }
			        	 
			        	 
			        	  System.out.println("The Highest GPA Score is ");
			        	  System.out.println(enroll[gpaFinder].getDetails());
			        	 
			         }
						  		 

			
			}
			
		}
		
			
	}
	
	
	

}
