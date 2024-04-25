package lab05v2;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {

		Circle c1 = new Circle();
		System.out.println(c1.toString("c1"));
		c1.setRadius(5);
		c1.setArea(Math.pow(c1.getRadius(), 2) * Circle.getPI());
		System.out.println(c1.toString("c1"));

		Circle c2 = new Circle();
		System.out.println(c2.toString("c2"));
		c2.initObject();
		System.out.println(c2.toString("c2"));

		Circle c3 = new Circle();
		System.out.println(c3.toString("c3"));
		c3.readRadius();
		c3.setArea(Circle.getPI() * c3.getRadius() * c3.getRadius());
		c3.setCircumference(Circle.getPI() * 2 * c3.getRadius());
		c3.setDiameter(2 * c3.getRadius());
		System.out.println(c3.toString("c3"));

		Circle c4 = new Circle();
		System.out.println(c4.toString("c4"));
		c4.setRadius(156.13);
		c4.calculateArea();
		c4.calculateCircumference();
		c4.setDiameter(2 * c4.getRadius());
		System.out.println(c4.toString("c4"));

		Circle c5 = new Circle();
		System.out.println(c5.toString("c5"));
		c5.setArea(200);
		System.out.println(c5.toString("c5"));

		Circle c6 = new Circle(100);
		System.out.println(c6.toString("c6"));

		Circle c7 = new Circle(125, 1023);
		System.out.println(c7.toString("c7"));
	}

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
		// this.diameter = diameter;
		this.diameter = 2 * this.radius;
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
		diameter = 2 * radius;
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
