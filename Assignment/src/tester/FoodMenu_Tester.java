package tester;

import java.util.*;



//Display food menu to user. User will select items from menu along with the quantity.
//Hard code food prices. (eg 1. fufu.......20 2. banku .......10 . Generate Bill ) When user enters 'Generate Bill' option, display total bill & exit.
//Create above class in "tester" package


public class FoodMenu_Tester {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
			Scanner input = new Scanner(System.in);
						
			Food_Menu foodMenu = new Food_Menu();
			
			boolean exit = true;
			
			while(exit) {
				
			System.out.println("Welcome to DiDi Na Tafri Wonsa Food Joint. Please select a Menu \n");
			System.out.println(" 1. Fufu and Groundnut Soup \n 2. Banku and Okro Stew  \n 3. Rice and Kontomire Stew \n 4. Generate Bill \n 5. Exit");
			
			
			     
			switch(input.nextInt()) {
			
					case 1: {
						 System.out.println("Banku and Okro Stew" + "..........." + "$" +foodMenu.getFufuPrice());
						 System.out.println("Please enter quantity of Fufu and Groundnut Soup you want :");
						 double quantity = input.nextInt();
						 double fufu = foodMenu.getFufuPrice() * quantity;
						 System.out.println("Your cost for Fufu and Groundnut Soup is " + "$" +fufu);
					};break;
					
					case 2: {
						 System.out.println("Banku and Okro Stew" + "..........." + "$" +foodMenu.getBankuPrice());
						 System.out.println("Please enter quantity of Banku and Okro Stew you want :");
						 double quant = input.nextInt();
						 double banku = foodMenu.getFufuPrice() * quant;
						 System.out.println("Your cost for Banku and Okro Stew is " + "$" +banku);
					};break;
					
					case 3: {
						 System.out.println("Rice and Kontonmire Stew" + "..........." + "$" +foodMenu.getRicePrice());
						 System.out.println("Please enter quantity of Rice and Kontonmire Stew you want :");
						 double quatity = input.nextInt();
						 double rice = foodMenu.getFufuPrice() * quatity;
						 System.out.println("Your cost for Rice and Kontonmire Stew is " + "$" +rice);
					};break;
					
					case 4: {
						
						
						System.out.println("Your total cost for all the menus is" + "$");
						
						
						exit = false;
					};break;
					
					case 5: {
						
						exit = false;
					};break;
					
					default: {
						
						System.out.println("Please select between 1 to 5");
					}
			
			}
			
		}
		
	
input.close();
	

}
	
}
