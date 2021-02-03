/**
 * 
 */
package customer;

/**
 * @author BISMARK  OTU
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		// An Array is a variable that can store many values
		
		//int[] num;
		//num = new int[10];
		
		//int[] num = {1,2,3,4,5,6,7,8,9,};
		
		//int[][] num = {{1,2,3,4,5,6,7,8,9,},{5,3,4,2,6,7,1,3,5},{1,2,3,4,5,6,7,8,9,}}; // Multi Dimension (Array in an Array)
		
		//int[] num = new int[10];
		
		
		//num[0] = 45;
		//num[1] = 46;
		//num[2] = 47;
		//num[3] = 48;
		//num[4] = 49;
		//num[5] = 44;
		//num[6] = 47;
		//num[7] = 50;
		//num[8] = 51;
		//num[9] = 52;
		
		
		
		//byte num = 120;  // Wide Casting
		//int num1;
		//num1 = num;
		
		//int num = 120332322;  // Narrow or Down Casting
		//byte num1 = (byte)num;
		
		
		//Integer = int;   //Boxing and unboxing
		//Long = long;
		
		

		//   OPERATORS
		   //Decrement Operator
		//int x = 5;
		//--x;
		
		
		//  Increment Operator
		//int y = 5;
		//++y;
		
		
		// Subtraction
		//int a = 20, b = 10;
		//int c = a - b;
		
		
		//  Logical Unary (not !)  (!= not equal to)
		//int a = 20, b = 10;
		//while()
		
		
		
		
		     // CONDITIONAL STATEMENT
		
		
		int num = 20, num1 = 10;
		  
		  if (num == num1) {
			  System.out.println("Yes, Num is greater than Num1");
		  }
		  else if(num1 == num){
			  System.out.println("Num1 is less than Num");
		  }
		  else {
			  System.out.println("None of them");
		  }
		  
		  
		  
		  //  FOR LOOP
			
			int num;  //Declaring your variable
			num = 0;  //Initializing your variable
			
			
//			for(int i = 0; i < 10; i++) {
				//num = num + i;
//			int num = i;
//				
//				System.out.println(num);
//			}
			
			
			
//		    FOR LOOP WITH CONDITIONAL STATEMENT
			for( int i = 0; i < 10; i++) {
				
				int num = i;
				
				if (i == 5)
					break;
				
				System.out.println(num);
			}
			
			
			
			
			
			
			
			
		//   FOR LOOP ARRAY
			
			  int[] num = {1,2,3,4,5,6,7,8,9};
			  
			  for(int i = 0; i < num.length; i++) {
				  
				  int num1 = num[i];
				
				System.out.println(num1);
				
				
			//   FOR EACH LOOP ARRAY
				
				  int[] num = {4,5,3,4,0,6,7,8,9};
				  
				  for(int num1 : num) {
					  
					System.out.println(num1);
			
			
			
			 //  WHILE LOOP
			
			int i = 0;  // You will first initialized the variable
			
			while( i < 10) {
				int num = i;
				
				System.out.println(num);
				
				i++;
			}
			
			
			
			
		//   DO WHILE LOOP ARRAY
			
			  int[] num = {4,5,3,4,0,6,7,8,9};
			  
			  int i = 0;
			  
			  do {
				  int num1 = num[i];
				  System.out.println(num1);
				  
				  i++;
				  
			  }while( i < num.length);
			
		
		
		
		//int x = 20, y = 10;
		//if(x <= y) {
			
			System.out.println();
		//}
		//else {
			System.out.println();
		//}
			
			
			//  Module
		//if(3 % 2 == 1) {
		
		System.out.println();
	//}
	//else {
		System.out.println();
	//}
		
		
		//   Short And
		//int x = 23, y = 23;
		//if(x == 23 && y == 23) {
		
				System.out.println();
			//}
			//else {
				System.out.println();
			//}
		
		
		//  Logical or
		//int x = 23, y = 23;
		//if(x == 23 || y == 23) {
		
				System.out.println();
			//}
			//else {
				System.out.println();
			//}
				
				
//			    SWITCH
				int temp = 73;
				
				switch(temp) {
				
				case 30: 
				case 31:
				case 32:
				case 33:
				case 34:
				case 35:
				case 36:
				{ System.out.println("I am Well");}; break;
				
				
				case 40: 
				case 51:
				case 62:
				case 73:
				case 84:
				case 95:
				case 46:
				{ System.out.println("I have Corona");}; break;
				
				default: System.out.println("I am Default");};
				
		
				
				
				System.out.println("Yes is equal to");
			
	
		
		
		
		
		      
		
		
		
		
		
		
		
		
	}

	/**
	 * 
	 */
	public App() {
		// TODO Auto-generated constructor stub
	}

}

