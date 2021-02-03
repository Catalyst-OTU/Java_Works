package assign5;

public class Worker extends Emp {
	
	private double hourlyRate;

	
//  INITAILIZATION OF INSTANCE VARIABLE
	public Worker(int id,String name, String email, double hourlyRate) {
		
		
		super(id,name, email);

		this.hourlyRate = hourlyRate;
	}
	
    public double hourlyRate() {
		
		return hourlyRate;
	}

    
	@Override
	public String toString() {
		return super.toString() + "hourlyRate=" + hourlyRate + "";
	}
    
    

}
