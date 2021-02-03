package tester;

import java.util.*;

//Display food menu to user. User will select items from menu along with the quantity.
//Hard code food prices. (eg 1. fufu.......20 2. banku .......10 . Generate Bill ) When user enters 'Generate Bill' option, display total bill & exit.
//Create above class in "tester" package

public class Food_Menu extends Price_Menu {

	
	
	public void displayFufu() {
		
		System.out.println("Fufu and Groundnut Soup" + "$" +super.getFufuPrice());
	}
	

	public void displayBanku() {
		
		System.out.println("Banku and Okro Stew" + "$" +super.getBankuPrice());
	}

	public void displayRice() {
	
	System.out.println("Rice and Kontomire Stew" + "$" +super.getRicePrice());
	}
	


	

	
	
	

}
