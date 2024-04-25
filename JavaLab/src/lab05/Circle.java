package lab05;

import java.util.Scanner;

public class Circle {

	// Instance variables
	private static final double PI = Math.PI;
	private double radius, diameter, circumference, area;

	// compile time polymorphism with constructor overloading
	public Circle() {
		System.out.println("Zero param");
		radius = 0;
		calculateArea();
		calculateCircumference();
		setDiameter(0);
	}
	
	public Circle(double radius) {
		System.out.println("1 param");
		this.radius = radius;
		calculateArea();
		calculateCircumference();
		setDiameter(radius);
	}
	
	public Circle(double radius, double area) {
		System.out.println("2 param");
		this.radius = radius;
		calculateArea();
		calculateCircumference();
		setDiameter(radius);
	}

	// GETTER & SETTERS
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		//this.diameter = diameter;
		this.diameter = 2*this.radius;
	}

	public double getCircumference() {
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}

	public double getArea() {
		this.calculateArea();
		return area;
	}

	public void setArea(double area) {
		// this.area = area;
		calculateArea();
	}
	
	public static double getPI() {
		return PI;
	}

	// initialize instance variables
	public void initObject() {
		radius = 1000;
		diameter = 2*radius;
		area = PI * radius * radius;
		circumference = 2 * PI * radius;
	}
	
	public void readRadius() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radius: ");
		radius = in.nextDouble();
//		diameter = 2*radius;
//		area = PI * radius * radius;
//		circumference = 2 * PI * radius;
	}
	
	// compute area
	public void calculateArea() {
		area = PI * radius * radius;
	}
	
	public void calculateCircumference() {
		circumference = 2 * PI * radius;
	}
	
	
	public String toString(String name) {
		return String.format("%s: [PI: %f, radius: %f, diameter: %f, circumference: %f, area: %f]", name, PI, radius,
				diameter, circumference, area);
	}

}
