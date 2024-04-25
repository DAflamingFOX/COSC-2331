package lab09;

public class Triangle extends Figure{

	private double a,b,c;

	public Triangle() {
		super();
		a = b = c = 0;
		System.out.println("Triangle: zero param");
	}
	
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Triangle: three param.");
	}
	
	public Triangle(double a, double b, double c, String color) {
		super(color);
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Triangle: four param.");
	}
	
	@Override
	public String toString(String obj) {
		return "Triangle "+obj+" [a=" + a + ", b=" + b + ", c=" + c + ", getPerimiter()=" + getPerimiter() + ", getArea()="
				+ getArea() + ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + ", getDateCreated()="
				+ getDateCreated() + "]";
	}

	@Override
	public double getPerimiter() {
		return a + b + c;
	}

	@Override
	public double getArea() {
		return 0.25 * Math.sqrt( (a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c) );
	}
	
	
	
	
	
}
