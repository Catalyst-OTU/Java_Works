package assign4;

import java.util.*;

import assign3.Emp;

public class Test {



	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		Emp[] employee = new Emp[num];
		
		int Counter = 0;
		boolean exit = true;
		
		while(exit) {
		System.out.println("Please Choose an Option \n");
		System.out.println(" 1. Add Employee  Details \n 2. Display employee specific details  \n 3. Display Manager Performance Bonus \n 4. Display Worker Hourly Rate \n 5. Exit");
		
		switch(input.nextInt()) {
	       					
        case 1: {
        	
			System.out.println("Please Enter Manager Info : id, name, email, perfBonus");
			employee[Counter++] = new Manager(input.nextInt(),input.next(),input.next(),input.nextDouble());

        	
        }
        
        
        
        
		}
		
		

	}

	}
}
