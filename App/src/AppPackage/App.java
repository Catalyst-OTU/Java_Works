/**
 * 
 */
package AppPackage;

/**
 * @author BISMARK  OTU
 *
 */
public class App {

	/**
	 * 
	 */
	public App() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  DATA TYPES
		//  REFERENCE DATA TYPES
		
		// Class
		// Arrays
		// Strings
		String info = "Information"; // Strings are always in double coats
		String infos = new String("Information");
		System.out.println(infos);
		
		// PREMITIVE DATA TYPES . We copy by value
		 int number = 123;
		 int number1 = number;
		 System.out.println(number1);
		
		char letter = 'A'; // Characters are always in single coats
		
		//Whole Numbers
		byte num1 = 127;   // You can store more 128 bytes
		short num2 = 12345;  // Short can not be long than 6 numbers
		int num = 1234;  //Million
		long num3 = 1234567891222L;  // Billion You can store more than 10 digits on less you put L at the end
		
		// Decimal Whole Numbers
		float num4 = 123.44F;  // You need to bring F before it becomes a float
		double num5 = 12344.54245355;  // You can have many decimal n numbers
		boolean isPresent = true;
		
		
		
		System.out.println(info);
		// System is a class. .out is a field and println is a print line

	}

}
