package assign5;

//Add new options 
//
//6. Display employee specific details
//
//I/P emp id 
//
//O/P If its manager --display its performance bonus , if its worker then display its hourly rate.


import java.util.*;

public class Test {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
		
        
		System.out.println("How many Employees do you want to employ : ");

		int num = input.nextInt();
		
		Emp[] employee = new Emp[num];
		
		
		int Counter = 0;
		boolean exit = true;
		
		while(exit) {
			
		System.out.println("Please Choose an Option \n");
		System.out.println(" 1. Add Employee Details \n 2. Display employee specific details  \n 3. Display Manager Performance Bonus \n 4. Display Worker Hourly Rate \n 5. Exit");
		
		
		switch(input.nextInt()) {
	       					
        case 1: {
        	
			System.out.println("Please Enter Manager Info : id, name, email, perfBonus");
			employee[Counter++] = new Manager(input.nextInt(),input.next(),input.next(),input.nextDouble());
			
			System.out.println("Please Enter Worker Info : id, name, email, hourlyRate");
			employee[Counter++] = new Worker(input.nextInt(),input.next(),input.next(),input.nextDouble());
			
        };break;
//        
//        case 2:{
//        	
//			System.out.println("Enter your id for your details :");
//			int details = input.nextInt();
//			
//			if(details % 100 <= num) {
//				
//				System.out.println(employee[details % 100 -1].toString());
//				
//			}else {
//				
//				System.out.println("Your ID is Invalid");
//			}
//			
//		   };break;


        case 3: {

        	for(Emp mg: employee) {

				System.out.println(mg.toString() + " " + ((Manager)mg).perfBonus());
        	}

		};break;

//        case 4: {
//
//        	for(Emp wk: employee) {
//
//			System.out.println("This is the Hourly Rate of the Worker : " + " " + ((Worker)wk).hourlyRate());
//        }
//
//        };break;
        
        case 5: {
        	       exit = false;

        };break;

        default : {
        	
        	System.out.println("Please select option from 1 to 5");
        }
		
		

	}

		}
		
	}

}
