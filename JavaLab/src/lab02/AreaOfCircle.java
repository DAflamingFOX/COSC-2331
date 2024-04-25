package lab02;

import java.util.Scanner;

import lab01.Welcome;

public class AreaOfCircle {
	public static void main(String[] args) {
		final double PI = Math.PI;
		double radius, area;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		radius = scanner.nextDouble();
		
		area = PI * Math.pow(radius,  2); // radius * radius;
		
		System.out.println("Circle with radius: " + radius + " has an area of: " + area);
	}
}
