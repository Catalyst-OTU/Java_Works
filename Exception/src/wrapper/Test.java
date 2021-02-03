package wrapper;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Enum nums; 
		
//		System.out.println(Enum.Emmerson.getprice());
		
		for(Enum e : Enum.values())
			
			System.out.println(e + " " + e.getprice());

	}

}
