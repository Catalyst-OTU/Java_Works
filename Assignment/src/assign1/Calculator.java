package assign1;

public class Calculator {

	
	//  DECLARATION OF INSTANCE VARIABLES
	private double firstNumber;
	private double secondNumber;
	
	
	
	//  SETTING THE INSTANCE VARIABLES
	public void setfirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public void setsecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	
	
	//  GETTING THE INSTANCE VARIABLES
	public double getfirstNumber() {
		return firstNumber;
	}
	
	public double getsecondNumber() {
		return secondNumber;
	}
	
	
	
	//    4 INSTANCE METHODS
	//   ADDITION METHOD
	public double add() {
		return firstNumber + secondNumber;
	}
	
	//   SUBTRACTION MEHTOD
	public double subtract() {
		return firstNumber - secondNumber;
	}
	
	//   MULTIPLICATION METHOD
	public double multiply() {
		return firstNumber * secondNumber;
	}
	
	//   DIVISION MEHTOD
	public double divide() {
		if(firstNumber == 0) {
			
			System.out.println("Please your first Number should be greater than zero");
			return 0;
		}
		else {
			return firstNumber / secondNumber;

		}
	}
	
	
	
	
}
