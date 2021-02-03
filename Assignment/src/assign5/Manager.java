package assign5;

public class Manager extends Emp {

	private double perfBonus;
	
	public Manager(int id, String name, String email, double perfBonus) {
		
		super(id,name, email);

		this.perfBonus = perfBonus;
	}
	
	
	public double perfBonus() {
		
		return perfBonus;
	}


	@Override
	public String toString() {
		return super.toString() + "perfBonus=" + perfBonus() + "";
	}

	
}
