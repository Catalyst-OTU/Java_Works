import java.util.Scanner;

Scanner input = new Scanner(System.in);
		
		System.out.println("How many Students do you want to Enroll : ");

		int num = input.nextInt();

		Student[] enroll = new Student[num];

		boolean run = true;
		
		while(run) {
			
			System.out.println("Please choose an option\n");
			System.out.println(" 1. Enter student details \n 2. Enter student scores \n 3. Display Details of Students \n 4. Display name of student with the highest GPA \n 5. Exit");
			
			
			switch(input.nextInt()) {
			
			         case 1: {
			        	 
			        	    for(int i = 0; i < num; i++) {
				        	System.out.println("Please Enter Student Details : name, email, age");
			        		enroll[i] = new Student(input.next(), input.next(), input.nextInt());

			        	                                 }
			                };break;
			                
			         case 2: {
			        	 
			        	    for(int i = 0; i < num; i++) {
			        	    	
			        	    
				        	System.out.println("Please enter Quiz score");
                            double quiz = input.nextDouble();
				     
				     		System.out.println("Please enter Test score");
				     		double test = input.nextDouble();
				     		
				     		System.out.println("Please enter assignment score");
				     		double assignment = input.nextDouble();
				     		
				     		
				     		double gpa = enroll[i].computeGPA(quiz, test, assignment);
				    		
				    		if(gpa > enroll[i++].computeGPA(quiz, test, assignment)) {
				    			
	
				    		}

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
			        	 
			        	 for(int i = 0; i < num; i++) {
			        		 
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
		
















//Scanner input = new Scanner(System.in);
//int stdCount = 0;
//
//System.out.println("How many students do you want to enroll :");
//
//int num = input.nextInt();
//
//	Student[] std = new Student[num];
//
//System.out.println("Please choose an option\n");
//System.out.println(" 1. Enter student details \n 2. Enter student scores \n 3. Display Details of Students \n 4. Display name of student with the highest GPA \n 5. Exit");
//
//
//boolean isTrue = true;
//while(isTrue) {
//	
//	switch(input.nextInt()) {
//	
//	          case 1 : {
//	        	  
//		        	System.out.println("Please Enter Student Details : name, email, age");
//		        	std[stdCount++] = new Student(input.next(), input.next(), input.nextInt());
//	          };break;
//	          
//	          case 2 : {
//	        	  
//	        	  System.out.println("Enter your exam scores Quiz, Test and Assignment");
//	        	  std[stdCount++].computeGPA(input.nextDouble(), input.nextDouble(), input.nextDouble());
//	          };break;
//	          
//	          case 3 : {
//	        	  
//	        	  double MaxGPA = std[0].getGPA();
//	        	  int gpaFinder = 0;
//	        	  
//	        	  for(int i = 0, i < num, i++) {
//	        		  
//	        		  if (std[i].getGPA() > MaxGPA) {
//	        			  
//	        			  gpaFinder = i;
//	        			  MaxGPA = std[i].getGPA();
//	        		  }
//	        	  }
//	        	  
//	        	  System.out.println("The Highest GPA Score is ");
//	        	  System.out.println(std[gpaFinder].getDetails());
//	          }
//	          
//	
//	}
//}



