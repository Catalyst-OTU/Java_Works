package New;

public class Basics extends App {

	
	private String title;
	
	public Basics(String name, String email, int age, double salary,String title) {
		// TODO Auto-generated constructor stub
	

	
		super(name, email, age, salary);
		
		this.title = title;
		
		//super.toString();
		
	}
	
	

	@Override
	public String toString() {
		return "Title=" + title + " " + super.toString();
	}


}
