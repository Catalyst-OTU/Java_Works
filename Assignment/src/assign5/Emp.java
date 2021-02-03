package assign5;


//1. Apply abstraction to emp based organization.
//
//Test it.
//
//Add new options 
//
//6. Display employee specific details
//
//I/P emp id 
//
//O/P If its manager --display its performance bonus , if its worker then display its hourly rate.


public class Emp {
	
	//  DECLARATION OF VARIABLES
	private int id;
	private String name;
	private String email;
	
	
	public Emp(int id,String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Employee Details [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
