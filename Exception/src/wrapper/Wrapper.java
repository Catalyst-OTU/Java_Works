package wrapper;

public class Wrapper {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  BOXING is you assign a wrapper class or an object to a variable
		Integer num = 1234;
		
		//  UN BOXING is when you assign an object to a variable which has a primitive type
		int num1 = num.intValue();
		
		//   AUTO BOXING is when you assign an object directly to a variable which has a primitive type without converting the object with a method
		int num2 = num;
		
		System.out.println(num2);

	}

}
