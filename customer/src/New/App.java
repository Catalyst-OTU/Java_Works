package New;

public class App {

	// ENCAPSULATION
	private String name;
	private String email;
	private int age;
	private double salary;
	
	public App(String name, String email, int age, double salary) {
		
		this.name = name;
		this.email = email;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		
	}

	@Override
	public String toString() {
		return "Name=" + name + ", Email=" + email + ", Age=" + age + ", Salary=" + salary + "]";
	}
	
	
	
	

}
