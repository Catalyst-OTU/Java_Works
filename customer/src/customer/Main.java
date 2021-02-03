package customer;

public class Main {
	
	// ENCAPSULATION
	private double number1;
	private double number2;;
	private double number;
	
	
	//   STATIC POLYMORPHISM ( METHOD OVER LOADING )
	public void addtion(double number1, double number2) {
		
		number = number1 + number2;
		System.out.println(number);
	}
	
	public int addition(int number1, int number2) {
		
		return number1 + number2;
	}
	
	public byte addition(byte number1, byte number2) {
		
		return (byte) (number1 + number2);
	}
	
	
	
	
	
	
	
	
	
	
	
	// ENCAPSULATION
	private int num1;
	private int num2;
	private int ans;

	
	//   PARAMETERIZE CONSTRUCTOR
	public Main(int num1, int num2) {
		// TODO Auto-generated constructor stub
		
		this.num1 = num1;
		this.num2 = num2;
		
		//   INITIALIZING OF INSTANCE VARIABLES IN A CONSTRUCTOR
		num1 = 12;
		num2 = 3;
	}
	
	
//  PARAMETERIZELESS CONSTRUCTOR
	public Main() {
		// TODO Auto-generated constructor stub
		
		//   INITIALIZING OF INSTANCE VARIABLES IN A CONSTRUCTOR
		num1 = 12;
		num2 = 3;
	}
	
	//  INITIALIZING OF INSTANCE VARIABLES
	public void add(int num1, int num2) {
		ans = num1 + num2;
		System.out.println();
	}
	
	
	public void adds() {
		ans = num1 + num2;
		System.out.println();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Basics him = new Basics();
		him.sweet();
		him.holy();
		
		
		// DYNAMIC POLYMORPHISM METHOD OVER RIDING
		Basics how = new Inheritance();
		how.sweet();
		how.holy();
		
		
	}
	

}
