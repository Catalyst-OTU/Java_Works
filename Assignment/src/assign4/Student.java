package assign4;



//Day 3
//0. Open javadocs in browser .(java8_docs\docs\api\index.html)
//1. Follow lab sequence for revision
//2. Solve this.
//Create java application for the following.
//Create Student class in a package "com.cdac.core" 
//2.1 Every student must have   --- id(int) --if possible system generated(clue : use static id counter), name (String), email(String), age(int), gpa (double)
//
//2.2 Add suitable parameterized constructor.
//Don't accept gpa in constructor , since it has to be computed.
//
//2.3 Add a method getDetails to  fetch complete student details
//(ret type -- String



public class Student {

//	private double highest_score;
	private static int counter;
	private int id;
	private String name;
	private String email;
	private int age;
	private double gpa;
	

	
	static {
		
		counter = 0;
	}
	
	
	public Student(String name, String email, int age) {
		
		this.id = ++counter;
		this.name = name;
		this.email = email;
		this.age = age;

	}




	public double computeGPA(double quiz, double test, double assignment) {
		
		return gpa = (0.2 * quiz) + (0.5 * test) + (0.3 * assignment);
		
	}
	
	
	public double getGPA() {
		
		return gpa;
	}
	
	public String getName() {
		
		return name;
	}
	
	

	
	
	public String getDetails() {
		
		return "Student Details [ID=" + id + ", NAME=" + name + ", EMAIL=" + email + ", AGE=" + age + ", GPA=" + gpa + "]";
	}
	
	

}
