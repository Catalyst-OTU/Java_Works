package assign3;

public class Mgr extends Emp {

	//  DECLARARTON OF INSTANCE VARIABLES
	private String dept;
	private double perfBonus;
	
	
	//  INITAILIZATION OF INSTANCE VARIABLES
	public Mgr(String name, String email, int deptid, double basic, String dept, double perfBonus) {
		
		    super(name, email, deptid, basic);

			this.dept = dept;
			this.perfBonus = perfBonus;
	}
	

	public double computeNetSalary(){

		return super.getBasic() + perfBonus;
	}
	
	
	public double getperfBonus() {
		
		return perfBonus;
	}


	@Override
	public String toString() {
		
		return super.toString() + "dept=" + dept + ", perfBonus=" + perfBonus;
	}
	
	
	
	
	
	
	

}
