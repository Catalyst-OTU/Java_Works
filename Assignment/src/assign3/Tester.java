package assign3;



import java.util.Scanner;

public class Tester {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		      // TESTING OUR CLASSES
//		Worker work = new Worker("Bismark Otu", "bismarkotu1006@gmail.com", 111.11, 1200.12, 12, 10);
//		work.toString();
//		
//		Emp employee = new Emp();
//		employee.toString();
//		
//		Emp manager = new Mgr("Nana Kwesi", "nanakwesi1006@gmail.com", 111, 123.12, "Faculty", 1000.00);
//		manager.toString();
//		
//		Object ob = new Emp("Nana Kwesi", "nanakwesi1006@gmail.com", 111, 123.12);
//		
//		System.out.println(ob.toString());
		
		
		
		
		Scanner input = new Scanner(System.in);

		System.out.println("How many employees do you want to employ : ");

		int num = input.nextInt();
		Emp[] employee = new Emp[num];
		int empCounter = 0;
		boolean run = true;
		
		
		while(run) {
		System.out.println("Enter the number best fit\n");
		System.out.println(" 1. Hire Manager \n 2. Hire Worker \n 3. Display information of all employees \n 4. Display employee specific details \n 5. Salary Increment \n 6. Exit");
		
		
		
		switch(input.nextInt()) {
		       
		        case 1: {
		        	
		        	System.out.println("Please Enter Manager Info : name, email, deptId, basic, dept, perfBonus");
		        	employee[empCounter++] = new Mgr(input.next(), input.next(), input.nextInt(), input.nextDouble(), input.next(), input.nextDouble());
		        };break;
		        
				case 2: {
		        	
		        	System.out.println("Please Enter Worker Info : name, email, deptId, basic, hoursWorked, hourlyRate");
		        	employee[empCounter++] = new Worker(input.next(), input.next(), input.nextInt(), input.nextDouble(), input.nextInt(), input.nextDouble());
		        };break;
		        
		        
				case 3:{
					
					for(Emp em: employee) {
						System.out.println(em.toString() + ((Mgr)em).computeNetSalary());
   

					};break;
				}
				
				case 4:{
					System.out.println("Enter your id for your details :");
					int eid = input.nextInt();
					
					if(eid % 100 <= num) {
						
						System.out.println(employee[eid % 100 -1].toString());
						
					}else {
						
						System.out.println("Your ID is Invalid");
					}
				};break;
				
				case 5:{
					
					System.out.println("Enter your ID number");
					
					int eid = input.nextInt();
					
					System.out.println("Enter to update your salary");
					
					double update = input.nextDouble();
					
					if(eid % 100 <= num) {
						
						employee[eid % 100 -1].getUpdateSalary(update);
						
						System.out.println(employee[eid % 100 - 1].toString());
						
						
					}else {
						
						System.out.println("Invalid ID");
					}
					
				};break;
				
				case 6:{
						run = false;
				};break;
				
				default: {
					
					System.out.println("Please select option from 1 to 6");
				}
				
				

		}
		
		}

	}

}
