package exception;

public class CalculatoException {
	
	
	
//  THROWS ERROR
		public static void show() throws IllegalAccessException{
			
			throw new IllegalAccessException("I am Illegal");
		}

//		public static void show() {
//			
//			try {
//				
//				int num1 = 12;
//				int num2 = 0;
//				System.out.println(num1/num2);
//				
//				throw new ArithmeticException("In show mehtod");
//				
//			}catch(ArithmeticException ee) {
//				
//				System.out.println("This is Error is " + ee);
//			}
//		}
		
		
		
		//    THROWS ERROR
		public static void showme(int age) throws ArithmeticException{
			
			try {
				if(age < 18)
					throw new ArithmeticException("In show() method");
				
				else {
					System.out.println("I am 18");
				}
				
			}catch(ArithmeticException aa) {
				System.out.println("the error is due to " + aa);
			}
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			showme(12);

			
			
			
			
			
			
			
	
		//    MULTIPLE CATCHING
//		
//		try {
//			int num1 = 12;
//			int num2 = 0;
//			int num = num1 / num2;
//			System.out.println(num);
//			
//		}
//		
//		   //  ArithmeticException
//		catch(ArithmeticException ae) {
//			
//			System.out.println("The exception is " + ae);
//			System.out.println("Please your denomintor should be greater than zero");
//		}
//		
//		//  MULTIPLE   CATCHING
//		catch(Exception e) {
//			
//			System.out.println("The exception is " + e);
//			System.out.println("Please your denomintor should be greater than zero");
//		}

}

}
