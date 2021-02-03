/**
 * 
 */
package BasicPackage;


/**
 * @author BISMARK  OTU
 *
 */
public class Basic {
	
	
	
//GET(Allows you to view want you input does not accept inputs. Anytime you GET you need to ReturnThe return is the data type(int)
//SET(Allows users to manage their inputs and also accept inputs.The return type is Void)
//  Declaring Instance variables
	
	int num1;
	int num2;
	//int answer;
	
	//  SETTING
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void SetNum2(int num2) {
		this.num2 = num2;
	}
	
	//  GETTING
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	// MULTIPLICATION
	public int multi() {
		return num1 * num2;
	}
	
	//  SUBTRACTION
	public int sub() {
		return num1 - num2;
	}
	
	//    MODULE
	public int reminder() {
		return num1 % num2;
	}
	
	// ADDITION
	public int add() {
		return num1 + num2;
	}
	
	 //  DIVISION
	public int div() {
		if(num1 == 0) {
			
			System.out.println("Your first number should be greater than zero");

			return 0;
		}
		else {
              return num1 / num2;			
		}
	}
	
	
	
	
	
	
	
	
	

		
		//   DATA TYPE AND VARIABLE NAMES
		String lname = "Nana";
		String fname = "Kwesi";
		int age = 20;
		
		
		public void disp() {
			
			System.out.println("Good is good all the time");
			
		}
		
		
		
		
		
		public int add(int num, int num1) {
		
		return num + num1;
		
		}
		
		
		// Declaring of Variables
		double number1;
		double number2;
		int ans;
		
		// This Method is not accepting Input or Parameters
         public void mult() {
        	 
        	 number1 = 23;
        	 number2 = 2;
        	 ans = (int)(number1 * number2);
        	 
        	 System.out.println("The first answer is " + ans);
			
		}
         
         
      // This Method is accepting Input or Parameters and is not returning but rather outputing the outcome
         public void multi(double number3, double number4) {
 			
        	 ans = (int)(number3 * number4);
        	 System.out.println("The second answer is " + ans);
 		}
         
         
         
         // This Method is returning an output but not outputing it
         public int mult3(double number5, double number6) {
        	 
        	 return ans = (int)(number5 * number6);
         }
         
         
         
         
         
         
         
         
 		
		
		
		
		
	
	

	}

