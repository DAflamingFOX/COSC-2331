package lab02;

import java.util.Scanner;

public class DemoClassStaticMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Press 1. to finds the sum of n natural numbers and its average \n"
				+ "Press 2. to show the multiplication table of a number n.");
		System.out.println("Enter your choice: ");
		int choice = input.nextInt();
		System.out.println(choice + "selected...");
		
		if (choice == 1) {
			taskOne();
		} else if (choice == 2) {
			taskTwo();
		} else
			System.out.println("invalid choice silly");
	}
	
	public static void taskOne() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many natural numbers need to be generated: ");
		int n = input.nextInt();
		System.out.println(n + " natural numbers...");
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum: " + sum + " avg: " + (double) sum / n);
	}
	
	public static void taskTwo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many multiplication tables to generate: ");
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(j + " * " + i + " = " + j*i);
			}
			System.out.println();
		}
	}
}
