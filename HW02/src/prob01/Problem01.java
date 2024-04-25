package prob01;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	// System.out.println("Enter two integer values for D distance and N days separated by a single space.");
	// D - distance kilometers (one-way)
	int d = input.nextInt();
	// N - days
	int n = input.nextInt();
	
	// System.out.println("Enter Xa, Xb, and Xc separated by a single space.");
	// Xa - Dollars for first Xb kilometers
	int xa = input.nextInt();
	// Xb - kilometers
	int xb = input.nextInt();
	// dollars per kilometer for the rest of distance
	int xc = input.nextInt();
	
	// System.out.println("Enter Ya, Yb, and Yc separated by a single space.");
	// Ya - dollars for first Yb kilometers
	int ya = input.nextInt();
	// Yb - kilometers
	int yb = input.nextInt();
	// dollars per kilometer for the rest of distance
	int yc = input.nextInt();
	
	// System.out.println("Enter Za, Zb, Zc, and Zd separated by a single space.");
	// Za - dollars, std price
	int za = input.nextInt();
	// Zb - time in minutes renting
	int zb = input.nextInt();
	// Zc - dollars for ever kilometer
	int zc = input.nextInt();
	// Zd - speed - kilometer per minute
	int zd = input.nextInt();
	
	// *********
	
	int totalDistance = d*2;
	
	int uberPrice = n * (xa + ((totalDistance - xb) * xc));
	int lyftPrice = n * (ya + ((totalDistance - yb) * yc));
	int bikePrice = n * (za + ((totalDistance/zd)*zb) + (totalDistance * zc));
	
	// System.out.printf("uber - %d lyft - %d motorbike - %d", uberPrice, lyftPrice, motorbikePrice);
	
	int cheapest = Math.min(uberPrice, Math.min(lyftPrice, bikePrice));
	String output = "";
	if (uberPrice == cheapest)
		output += "Uber is cheaper";
	if (lyftPrice == cheapest) {
		if (!output.isEmpty())
			output += " and ";
		output += "Lyft is cheaper";		
	}
	if (bikePrice == cheapest) {
		if (!output.isEmpty())
			output += " and ";
		output += "renting a motor bike is cheaper";
	}
	
	System.out.println(output);
	
	}

}

class Class2 {}