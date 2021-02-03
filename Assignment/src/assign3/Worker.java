package assign3;

public class Worker extends Emp {

	// DECLARATION OF INSTANCE VARIABLES
	private double hoursWorked;
	private double hourlyRate;
	
	
	//   INITAILIZATION OF INSTANCE VARIABLE
	public Worker(String name, String email, int deptid, double basic, int hoursWorked, double hourlyRate) {
		
		super(name, email, deptid, basic);
		
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	
	public double getHourlyRate() {
		
		return hourlyRate;
	}

	
     public double computeNetSalary(){
		
		return super.getBasic() + (hoursWorked + hourlyRate);
	}

	@Override
	public String toString() {
		return super.toString() + "hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate;
	}
	
	
	
	
	
	
	
	

}
