package assign6;

import java.util.Scanner;

public class Tester2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("How many Bounded shapes do you want : ");
		Computable[] compute = new Computable[input.nextInt()];
		
		int count = 0;

		boolean exit = true;
				
				while(exit) {
					
			System.out.println("Choose your choice");
			System.out.println(" 1. Add Circle \n 2. Add Rectangle \n 3. Dispaly area and perimeter of all shapes \n 4. Exit");
					
		
		switch(input.nextInt()) {
		
		        case 1: {
		        		
		        	   System.out.println("Enter x of a circle");
		        	   System.out.println("Enter y of a circle");
		        	   System.out.println("Type in the radius of a circle");
		        	   compute[count++] = new Circle(input.nextDouble(), input.nextDouble(), input.nextDouble());
		        };break;
		        
		        case 2: {
	        		
		        	   System.out.println("Enter x of a Rectangle");
		        	   System.out.println("Enter y of a Rectangle");
		        	   System.out.println("Enter the Width of your Rectangle");
		        	   System.out.println("Enter the Height of your Rectangle");
		        	   compute[count++] = new Rectangle(input.nextDouble(), input.nextDouble(), input.nextDouble(),input.nextDouble());
		        };break;
        
        
		        case 3: {
		        	
		        	System.out.println("Area, Perimeter and Draw Arc for a Circle and Diagonals");
		        	
		        	for(Computable i : compute) {
		        		
		        		System.out.println("Area of a Circle : " + i.area());
		        		System.out.println("Perimeter of a Circle : " + i.perimeter());
		        		if(i instanceof Circle) 
		        			((Circle)i).drawArc();
		        		
		        		if(i instanceof Rectangle)
		        			((Rectangle)i).diagonal();	
		        	}
		        };break;
		        
		        case 4:{
		        	
		        		exit = false;
		        };break;
		        
		        default: {
		        	
		        	System.out.println("Should be between 1 and 5");
		        }
		        
		        
		}
		        
        
		}

	}

}
