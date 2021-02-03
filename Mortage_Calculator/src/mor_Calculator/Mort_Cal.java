package mor_Calculator;

import java.text.*;
import java.util.*;

public class Mort_Cal {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Principal : ");
		int principal = scanner.nextInt();
		
		System.out.println("Annual Interest Rate :");
		float annualInterest = scanner.nextFloat();
		float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
		
		System.out.println("Period (YEARS) : ");
		byte years = scanner.nextByte();
		int numberOfPayments = years * MONTHS_IN_YEAR;
		
		double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
		/ (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
		
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		
		System.out.println("Mortgage : " + mortgageFormatted);
	}

}
