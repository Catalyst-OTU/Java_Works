package assign3;

public class Emp {

	public Emp() {
		// TODO Auto-generated constructor stub
	}
	
	private static int counter;
	private int id;
	private String name;
	private String email;
	private double deptid;
	private double basic;
	
	
	static {
		counter = 100;
	}
	
	public Emp(String name, String email, double deptid, double basic) {
		
		this.id = ++counter;
		this.name = name;
		this.email = email;
		this.deptid = deptid;
		this.basic = basic;
	}
	
	public double getBasic() {
		
		return basic;
	}
	
	
	public double getUpdateSalary(double update) {
		
		return basic += update;
//		basic = basic + update
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", deptid=" + deptid + ", basic=" + basic
				+ " ";
	}
	
	
	
	
	
	

}
