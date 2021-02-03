package assign7;

import java.util.*;

public class Tester {

	public static void main(String[] args)throws StudentHandlingException {
		// TODO Auto-generated method stub
		
		

		int count = 4;
		
		Student[] std = new Student[count];
		
		
		std[0] = new Student("dac-001", "Bismark", "Bismark@gmail.com", "100", "CSD");
		std[1] = new Student("dac-002", "Nana", "Nana@gmail.com", "89", "CCNA");
		std[2] = new Student("dac-003", "Kwesi", "Kwesi@gmail.com", "90", "ICDL");
//		std[3] = new Student("dac-004", "Otu", "Otu@gmail.com", 79, "DBC");
		
		boolean present = false;
		
		try (Scanner input = new Scanner(System.in)){
			
System.out.println("Enter the ff information\n 1. prn number\n 2. your name\n 3. your email\n 4. marks\n 5. Course ");
			
				String prn = input.next();
				String name = input.next();
				String email = input.next();
				String marks = input.next();
				String course = input.next();
				Student stds = new Student(prn, name, email, marks, course);
				
				
				for(Student i : std) {
					
				if(i.equals(stds)) {
					
					throw new StudentHandlingException("Duplicates !!!");
					
				}else {

						present = true;
				
				}
		}
				
				if(present) {
					
				
				std[3] = new Student(prn, name, email, marks, course);
				System.out.println("REGISTRATION SUCCESSFUL");
				
				}else {
					
					
					
				}
				
			
					for(Student s : std) {
						
						System.out.println(s);
					}
			

		}catch(Exception e) {
			
			System.out.println(e);
		}
		

	}
	


}
