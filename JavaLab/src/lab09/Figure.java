package lab09;

import java.util.Date;

public abstract class Figure {

	private String color = "WHITE";
	private boolean filled = false;
	private Date dateCreated;
	
	public abstract String toString(String obj);
	public abstract double getPerimiter();
	public abstract double getArea();
	
	public Figure() {
		System.out.println("Figure: zero param.");
		color = "WHITE";
		filled = color.equals("WHITE") ? false : true;
		this.dateCreated = new Date();
	}
	
	public Figure(String color) {
		System.out.println("Figure: one param.");
		this.color = color.toUpperCase();
		filled = color.equals("WHITE") ? false : true;		
		this.dateCreated = new Date();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	

}
