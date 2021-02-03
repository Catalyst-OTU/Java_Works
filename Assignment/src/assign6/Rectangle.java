package assign6;

public class Rectangle extends Point implements Computable {
	
	private double width;
	private double height;

	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		
		this.width = width;
		this.height = height;
	}
	
	public double perimeter() {
		return 2 * (width * height);
	}

//	@Override
//	public double perimeter() {
//		return (super.getX() * super.gety()) * 2;
//	}
	
	public double area() {
		return width * height;
	}

//	@Override
//	public double area() {
//		return super.getX() * super.gety();
//	}
	
	public void diagonal() {
		
		System.out.println("This is the Diagonal");
	}

	@Override
	public String toString() {
		return super.toString() + "width=" + width + ", height=" + height + "]";
	}
	
	

//	@Override
//	public String toString() {
//		return super.toString() + "Rectangle [x =" + super.getX() + ",y=" + super.gety() + "]";
//	}
	
	
	
	
	
	


}
