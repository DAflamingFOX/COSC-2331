package lab09;

public class Circle extends Figure {

	private double radius = 0.0;
	
	public Circle() {
		super();
		System.out.println("Circle: zero param.");
		this.radius = 0.0;
	}
	
	public Circle(double radius) {
		super();
		System.out.println("Circle: one param.");
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		super(color);
		System.out.println("Circle: two param.");
		this.radius = radius;
	}
	
	@Override
	public String toString(String obj) {
		return "Circle "+obj+" [radius=" + radius + ", getPerimiter()=" + getPerimiter() + ", getArea()=" + getArea()
		+ ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + ", getDateCreated()=" + getDateCreated()
		+ "]";
	}


	@Override
	public double getPerimiter() {
		return 2* Math.PI * this.radius;
	}

	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
}
