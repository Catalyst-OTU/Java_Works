package wrapper;



public class Enumeration {
	                // Constance
	enum Wheat{Emmerson, Dedrum, commonwheat, Spelt};


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("These are all the Wheat Constance");
		
		   //  FIRST STEP
//		Wheat[] type = Wheat.values();
//		for(Wheat num : type) {
//			System.out.println(num);
//		}
		
		   // ANOTHER STEP
		for(Wheat num : Wheat.values());
		
		      System.out.println();
		
		}
	
	
	
	
		
		
		
		
//		Wheat all = Wheat.Emmerson;
//		System.out.println(all);
//		
//		all = Wheat.Dedrum;
//		System.out.println(all);
//		
//		all = Wheat.Dedrum;
//		if(all == Wheat.commonwheat) {
//			System.out.println("I am not a common wheat");
//		}
//		
//		switch(all) {
//		
//		      case Emmerson:{System.out.println("I am  Emmerson");};break;
//		      case Dedrum:{System.out.println("I am  Dedrum");};break;
//		      case commonwheat:{System.out.println("I am  Common Wheat");};break;
//		      case Spelt:{System.out.println("I am  Spelt");};break;
//		
//		}

	}


