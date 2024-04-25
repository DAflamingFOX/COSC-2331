package prob04;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem04 {

	public static final Scanner kUserInput = new Scanner(System.in);

	public static void main(String[] args) {

		int choice = 0;
		boolean firstTime = true;
		while (!(1 <= choice && choice <= 5)) {
			if (!firstTime) {
				System.out.println("Input " + choice + " is not valid!\n");
			} else
				firstTime = false;
			System.out.println("Menu items\r\n" + "\r\n" + "Press 1 for Linear equations\r\n"
					+ "Press 2 for the shopping bill\r\n" + "Press 3 for directions\r\n"
					+ "Press 4 for square root and cube root of n numbers\r\n" + "Press 5 for QUIT\r\n");
			choice = kUserInput.nextInt();
		}

		switch (choice) {
		case 1 -> linearEquation();
		case 2 -> shoppingBill();
		case 3 -> routeSuggestions();
		case 4 -> roots();
		case 5 -> {
			System.out.println("Goodbye!");
			System.exit(0);
		}
		}

	}

	public static void linearEquation() {
		float a, b, c, d, e, f;
		a = b = c = d = e = f = 0f;
		System.out.println("\r\nLinear Equations\r\n" + "\r\n" + "ax+by=e\r\n" + "cx+dy=f\r\n" + "\r\n");
		System.out.print("Enter value for a: ");
		a = kUserInput.nextFloat();
		System.out.print("Enter value for b: ");
		b = kUserInput.nextFloat();
		System.out.print("Enter value for e: ");
		e = kUserInput.nextFloat();
		System.out.print("Enter value for c: ");
		c = kUserInput.nextFloat();
		System.out.print("Enter value for d: ");
		d = kUserInput.nextFloat();
		System.out.print("Enter value for f: ");
		f = kUserInput.nextFloat();

		System.out.println("\r\n" + a + "x + " + b + "y" + " = " + e + "\r\n" + c + "x + " + d + "y" + " = " + f);
		float x, y;
		x = y = 0f;

		x = (e * d - b * f) / (a * d - b * c);
		y = (a * f - e * c) / (a * d - b * c);

		System.out.println("Solution: (" + x + "," + y + ")\r\n");
		main(null);
	}

	public static void shoppingBill() {
		final Map<String, Integer> kUnitsPrice = new LinkedHashMap<>();
		kUnitsPrice.put("Monitor", 100);
		kUnitsPrice.put("Keyboard", 50);
		kUnitsPrice.put("Mouse", 35);
		kUnitsPrice.put("CPU", 500);
		kUnitsPrice.put("RAM", 400);
		kUnitsPrice.put("SSD", 200);
		final double kSalesTax = 7.2e-2;

		Map<String, Integer> unitsQuantity = getQuantity(kUnitsPrice.keySet());
		printBill(kUnitsPrice, kSalesTax, unitsQuantity);

		main(null);
	}

	public static Map<String, Integer> getQuantity(Collection<String> units) {
		Map<String, Integer> quantity = new LinkedHashMap<>();

		units.forEach((unit) -> {
			System.out.println("How many " + unit + "?");
			quantity.put(unit, kUserInput.nextInt());
		});

		return quantity;
	}

	public static void printBill(Map<String, Integer> unitsPrice, double salesTax, Map<String, Integer> unitQuantity) {
		int subtotal = unitsPrice.entrySet().stream().map(entry -> {
			return entry.getValue() * unitQuantity.get(entry.getKey());
		}).reduce(0, (x, y) -> x + y);

		System.out.println("*".repeat(65));
		System.out.printf("*%15s*%15s*%15s*%15s*\r\n", center("Item", 15), center("Unit Price", 15),
				center("Quantity", 15), center("Price", 15));
		System.out.println("*".repeat(65));
		unitsPrice.forEach((unit, price) -> {
			int quantity = unitQuantity.get(unit);
			System.out.printf("*%15s*%15s*%15s*%15s*\r\n", center(unit, 15),
					center(String.format("$%.2f", (double) price), 15), center(String.valueOf(quantity), 15),
					center(String.format("$%.2f", (double) quantity * price), 15));
		});
		System.out.println("*".repeat(65));
		System.out.printf("*%31s*%15s*%15s*\r\n", "", center("Subtotal", 15),
				center(String.format("$%.2f", (double) subtotal), 15));
		System.out.printf("*%31s*%15s*%15s*\r\n", "", center("Sales Tax", 15),
				center(String.format("$%.2f", (subtotal * salesTax)), 15));
		System.out.println("*".repeat(65));
		System.out.printf("*%31s*%15s*%15s*\r\n", "", center("Total", 15),
				center(String.format("$%.2f", subtotal + subtotal * salesTax), 15));
		System.out.println("*".repeat(65));
	}

	public static String center(String s, int size) {
		size = size - s.length();
		return " ".repeat(size / 2) + s + " ".repeat(((size + 1) / 2));
	}

	public static void routeSuggestions() {
		int sum = 0;
		while (sum <= 1000) {
			int miles = (int) (Math.random() * (99 - 10) + 10);
			System.out.println("In " + miles + " miles, " + (miles == 50 ? "take a right turn."
					: miles == 60 ? "take a left turn." : "continue straight."));
			sum += miles;
		}
		System.out.println("You have arrived at your destination.");
		
		main(null);
	}
	
	public static void roots() {
		System.out.println("Enter a number n to caclulate square, and cube roots of:");
		int n = kUserInput.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\u221A("+i+") = " + String.format("%.4f", Math.sqrt(i)) + "\t\u221B("+i+") = " + String.format("%.4f", Math.cbrt(i)));
		}
		
		main(null);
	}
}
