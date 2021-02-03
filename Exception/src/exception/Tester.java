package exception;

import java.util.Scanner;

public class Tester {

	//IF THE SUPERCLASS METHOD DOES NOT DECLARE AN EXCEPTION, THE OVERRIDING METHOD CAN NOT DECLARE,
	//HANDLED OR CHECKED EXCEPTION
				
	//IF THE SUPERCLASS MEHTOD DECLARES AN EXCEPTION. SUBCLASS OVERRIDING THAT CAN DECLARE SAME
	//EXCEPTION BUT CAN NOT DECLARE PARENT EXCEPTION

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std = new Student();

		//  TRY WITH RESOURCE
		try (Scanner input = new Scanner(System.in)){
			
			System.out.println("Type in your age : ");

			std.validation(input.nextInt());
			
		}catch(Exception e) {
			
			System.out.println(e);
		}

	}

}
