package lab02;

import java.util.Scanner;


// int max = Math.max(n1, Math.max(n2, n3)); this is SO MUCH EASIER.....

public class BigestOfThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter 3 numbers to find the largest:");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		
		System.out.println("The numbers entered were: " + n1 + ", " + n2 + ", " + n3 );
		
		System.out.println(""
				+ "Press 1 for code logic written using if only\r\n"
				+ "Press 2 for code logic written using nested if\r\n"
				+ "Press 3 for code logic written using if else only\r\n"
				+ "Press 4 for code logic written using else if ladder ");
		System.out.println("Enter your choice:");
		int choice = input.nextInt();
		System.out.println("your choice: " + choice);
		if(choice == 1) {
			System.out.println("code logic written using if only");
			int max = 0;
			if (n1 >= n2 && n1 >= n3)
				max = n1;
			if (n2 >= n1 && n2 >= n3)
				max = n2;
			if (n3 >= n1 && n3 >= n2)
				max = n3;
			System.out.println("Largest number is " + max);
		} else if (choice == 2) {
			System.out.println("code logic written using nested if");
			int max = 0;

			if (n1 >= n2)
				if (n1 >= n3)
					max = n1;
			if (n2 >= n1)
				if (n2 >= n3)
					max = n2;
			if (n3 >= n1)
				if (n3 >=n2)
					max = n3;
			System.out.println("Largest number is " + max);
		
		} else if (choice == 3) {
			System.out.println("code logic using if else only");
			int max = 0;
			
			if (n1 >= n2 && n1 >= n3)
				max = n1;
			else {
				if (n2 >= n1 && n2 >= n3)
					max = n2;
				else 
					max = n3;
				
			}
			
			System.out.println("Largest number is " + max);

		} else if (choice == 4) {
			System.out.println("code logic using else if ladder");
			int max = 0;
			if (n1 >= n2 && n1 >= n3)
				max = n1;
			else if (n2 >= n1 && n2 >= n3)
				max = n2;
			else if (n3 >= n1 && n3 >= n1)
				max = n3;
			System.out.println("Largest number is " + max);

		} else {
			System.out.println("invalid choice womp womp");
		}
	}

}
