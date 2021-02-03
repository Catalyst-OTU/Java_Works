/**
 * 
 */
package AppPackage;

import BasicPackage.Basic;
import java.util.*;

/**
 * @author BISMARK  OTU
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name ?");
		
		String name = input.next();
		
		System.out.println("Your name is " + name);
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
		
		Basic numbers = new Basic();
		numbers.setNum1(10);
		numbers.SetNum2(3);
		
		
		System.out.println("The Multiplication answer is :" + numbers.multi());
		System.out.println("The Subtraction answer is: " + numbers.sub());
		System.out.println("The Addition answer is: " + numbers.add());
		System.out.println("The Division answer is: " + numbers.div());
		System.out.println("The Reminder answer is: " + numbers.reminder());

		
		
		

	}

}
