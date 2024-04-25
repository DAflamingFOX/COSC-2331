package lab09;

public class Rectangle extends Figure {

	private double height, width;
	
	public Rectangle() {
		super();
		System.out.println("Rectangle: zero param.");
		height = 0;
		width = 0;
	}
	
	public Rectangle(double width, double height) {
		super();
		System.out.println("Rectangle: two param.");
		this.height = height;
		this.width = width;
	}
	
	public Rectangle(double width, double height, String color) {
		super(color);
		System.out.println("Rectangle: two param.");
		this.height = height;
		this.width = width;
	}
	
	@Override
	public String toString(String obj) {
		return "Rectangle "+obj+" [height=" + height + ", width=" + width + ", getPerimiter()=" + getPerimiter()
		+ ", getArea()=" + getArea() + ", getColor()=" + getColor() + ", isFilled()=" + isFilled()
		+ ", getDateCreated()=" + getDateCreated() + "]";
	}

	@Override
	public double getPerimiter() {
		return 2*height + 2*width;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	
	
	
}
