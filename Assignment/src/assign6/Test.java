package assign6;

import java.util.Scanner;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many bounded shapes?");
		
		int num = input.nextInt();
		
		Point[] com = new Point[num];
		
		Circle[] cir = new Circle[num];
		
		int count = 0;
		
        boolean run = true;
		
		while(run) {
		
		System.out.println("Choose your choice");
		System.out.println(" 1. Add Circle \n 2. Add Rectangle \n 3. Dispaly area and perimeter of all shapes");
		
		switch(input.nextInt()) {
		
		           case 1: {
		        	   
		        	   System.out.println("Enter the Width of a circle");
		        	   System.out.println("Enter the Height of a circle");
		        	   System.out.println("Type in the radius of a circle");
		        	   com[count++] = new Circle(input.nextDouble(), input.nextDouble(), input.nextDouble());
		           };break;
		           
		           case 2: {
		        	   
		        	   System.out.println("Enter the Width of a Rectangle");
		        	   System.out.println("Enter the Height of a Rectangle");
		        	   com[count++] = new Rectangle(input.nextDouble(), input.nextDouble());
		           };break;
		           
		           
		           case 3: {

		        	   for(int i = 0; i < num; i++) {
		        	    	
			        	    
				        	
//				     		System.out.println("Please enter the radius of your Circle");
//				     		double radius = input.nextDouble();
				     		
//				     		System.out.println("Please enter second radius");
//				     		double sec_radius = input.nextDouble();
				     		
//				     		double cal = Math.PI * (radius * 2);
				     		
//				     		double pie = Math.PI;
				     		
				     		 
				     		
				     		System.out.println("This is the Area of your Circle" + " " + cir[num].area());


			        	    }
		        	  
			        	 
			        	
						  			
						  };break;
		           
		           
		           
		}
		
		
		}

	}

}
