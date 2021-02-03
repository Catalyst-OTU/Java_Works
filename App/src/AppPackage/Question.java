package AppPackage;

import java.awt.Point;
import java.util.Arrays;
import java.util.Date;

//import BasicPackage.Basic;

public class Question {

	public Question() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Date now = new Date();
		System.out.println(now);
		// So why is Y still 1 and not changing to 2.
		byte x = 1;
		byte y = x;
	    x = 2;
		System.out.println(y);
		
		Point point1 = new Point(x=1, y=1);
		Point point2 = point1;
		point1.x = 2;
		System.out.println(point2);
		
		int[] num = {4,2,7,0,1,6,3};
		
		Arrays.sort(num);
		System.out.println(num[2]);
		System.out.println(num.length);
		System.out.println(Arrays.toString(num));
		
		
		
		
		
		
		
		
		
		
		 //numbers.setNum1(num1);
	     //numbers.SetNum2(num2);
	
	
		//Basic numbers = new Basic();
		//numbers.setNum1(10);
		//numbers.SetNum2(3);
		
		System.out.println("The Multiplication answer is: ");
		System.out.println("The Subtraction answer is: ");
		System.out.println("The Addition answer is: ");
		System.out.println("The Division answer is: ");


	}

}
