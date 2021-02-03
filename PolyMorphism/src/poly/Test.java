package poly;

public class Test {

	public static void main(String[] args) {
		
		StaticPoly poly = new StaticPoly();
		poly.add(12, 4, 4);
		
		
		Constructor cons = new Constructor("Nana", "Asoum", 12);
		//cons.toString();
		System.out.println(cons.toString());
		
	}
}
