/**
 * 
 */
package BasicPackage;

import java.util.Date;

/**
 * @author BISMARK  OTU
 *
 */
public class App {

	
	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		
		
		Basic mul = new Basic();
		mul.mult();
		mul.multi(23, 2);
		
		
		System.out.println("The third answer is: " + mul.mult3(23, 2));
		
	
		
		// Basic is the Class and also a Data Type  // app is the reference or variable   // Basic() is the Object
		
		            // REFERNCE TYPE
					Basic app = new Basic();
					
					//Date now = new Date();
					
					//System.out.println(now);
					
				
					System.out.println(app.lname);
					System.out.println(app.fname);
					System.out.println(app.age);
					
					//app.disp();
					
					System.out.println(app.add(20, 10));
					
			

	}

}
