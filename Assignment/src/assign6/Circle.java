package assign6;

public class Circle extends Point implements Computable {

	private double radius;
	
	public Circle(double x, double y, double radius) {
		super(x, y);
		
		this.radius = radius;
	}

	@Override
	public double perimeter() {
		
		return 2 * PI * radius;
	}

	@Override
	public double area() {
		
		return PI * radius * radius;
	}
	
	public void drawArc() {
		
		System.out.println("Drawing an Arc");
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Circle [radius=" + radius + "]";
	}

	
	
}





