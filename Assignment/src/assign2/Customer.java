package assign2;

public class Customer {

	//  DECLARING INSTANCE VARIABLE
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	
	
    //  PARAMETER LESS CONSTRUCTOR
	public Customer() {
		
		this("Rama", "rama@gmail.com", 25, 10000);
	}
	
	//   PARAMETERISED CONSTRUCTOR
	public Customer(String name, String email, int age, double creditLimit) {
		
		this(15000,name,email,age);
		this.name = name;
		this.email = email;
		this.age = age;
		this.creditLimit = creditLimit;
	}
	
	
	
	public Customer(double creditLimit, String name, String email, int age) {
		
		this.creditLimit = creditLimit;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	
	
	public double getcreditLimit() {
		return creditLimit;
	}
	
	public void setcreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
	public String getDetails() {
		return "Name : " + name + " and " + "Credit Limit : " + creditLimit;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", age=" + age + ", creditLimit=" + creditLimit + "]";
	}
	
	
	public String getString() {
		return "Customer [creditLimit=" + creditLimit + ", email=" + email + ", age=" + age + ", name=" + name + "]";
	}
	
	
	

	

	
	

}
