package lab03;

import java.util.Scanner;

public class Lab03 {

	public static void main(String[] args) {
		int op1, op2, iResult;
		double dResult;

		for (;;) {
			displayMenu();
			switch (readInput("Selection: ")) {
			case 1 -> {
				op1 = readInput("Enter operand 1: ");
				op2 = readInput("Enter operand 2: ");
				displayResult(op1, op2, addition(op1, op2), "+");
			}
			case 2 -> {
				op1 = readInput("Enter operand 1: ");
				op2 = readInput("Enter operand 2: ");
				displayResult(op1, op2, subtraction(op1, op2), "-");
			}
			case 3 -> {
				op1 = readInput("Enter operand 1: ");
				op2 = readInput("Enter operand 2: ");
				displayResult(op1, op2, multiplication(op1, op2), "*");
			}
			case 4 -> {
				op1 = readInput("Enter operand 1: ");
				op2 = readInput("Enter operand 2 (/or%): ");

				displayResult(op1, op2, division(op1, op2), "/");
			}
			case 5 -> {
				op1 = readInput("Enter operand 1: ");
				op2 = readInput("Enter operand 2 (/or%): ");
				displayResult(op1, op2, modulo(op1, op2), "%");
			}
			case 6 -> {
				op1 = readInput("Enter operand 1: ");
				op2 = readInput("Enter operand 2: ");
				displayResult(op1, op2, additionShorthand(op1, op2), "+=");
			}
			case 7 -> {
				op1 = readInput("Enter operand 1: ");
				op2 = readInput("Enter operand 2: ");
				displayResult(op1, op2, subtractionShorthand(op1, op2), "-=");
			}
			case 8 -> {
				op1 = readInput("Enter operand 1: ");
				op2 = readInput("Enter operand 2: ");
				displayResult(op1, op2, multiplicationShorthand(op1, op2), "*=");
			}
			case 9 -> {
				op1 = readInput("Enter operand 1: ");
				op2 = readInput("Enter operand 2 (/or%): ");
				displayResult(op1, op2, divisionShorthand(op1, op2), "/=");
			}
			case 10 -> {
				op1 = readInput("Enter operand 1: ");
				op2 = readInput("Enter operand 2 (/or%): ");
				displayResult(op1, op2, moduloShorthand(op1, op2), "%=");
			}
			case 11 -> quitApp();
			}
		}
	}

	public static void displayResult(int op1, int op2, double dResult, String operator) {
		System.out.println(op1 + " " + operator + " " + op2 + " = " + dResult);
	}

	public static void displayResult(int op1, int op2, int iResult, String operator) {
		System.out.println(op1 + " " + operator + " " + op2 + " = " + iResult);
	}

	public static void displayMenu() {
		System.out.println("Enter 1. to perform addition using the + operator\r\n"
				+ "Enter 2. to perform subtraction  using the - operator\r\n"
				+ "Enter 3. to perform multiplication using the * operator\r\n"
				+ "Enter 4. to perform division  using the / operator\r\n"
				+ "Enter 5. to perform modulo using the % operator\r\n"
				+ "Enter 6. to perform addition using the shorthand += operator\r\n"
				+ "Enter 7. to perform subtraction  using the shorthand -= operator\r\n"
				+ "Enter 8. to perform multiplication using the shorthand *= operator\r\n"
				+ "Enter 9. to perform division  using the shorthand /= operator\r\n"
				+ "Enter 10. to perform modulo using the shorthand %= operator\r\n"
				+ "Enter 11. to QUIT the application");
	}

	public static int readInput(String message) {
		Scanner input = new Scanner(System.in);

		int num = 0;
		if (message.equals("Selection: ")) {
			do {
				System.out.println(message);
				num = input.nextInt();
			} while (validate(num, message));
			return num;
		} else if (message.equals("Enter operand 2 (/or%): ")) {
			do {
				System.out.println(message);
				num = input.nextInt();
			} while (validate(num, message));
			return num;
		}
		System.out.print(message);
		return input.nextInt();
	}

	public static boolean validate(int num, String message) {

		if (message.equals("Enter operand 2 (/or%): ")) {
			if (num == 0) {
				System.out.println("Zero is invalid try again.");
				return true;
			} else
				return false;
		} else {
			if (num >= 1 && num <= 11) {
				return false;
			} else {
				invalidChoice();
				return true;
			}
		}

	}

	public static void invalidChoice() {
		System.out.println("Invalid choice, please select again...");
		displayMenu();
	}

	public static void quitApp() {
		System.out.println("Goodbye!");
		System.exit(0);
	}

	public static int moduloShorthand(int op1, int op2) {
		op1 %= op2;
		return op1;
	}

	public static double divisionShorthand(double op1, int op2) {
		op1 /= op2;
		return op1;
	}

	public static int multiplicationShorthand(int op1, int op2) {
		op1 *= op2;
		return op1;
	}

	public static int subtractionShorthand(int op1, int op2) {
		op1 -= op2;
		return op1;
	}

	public static int additionShorthand(int op1, int op2) {
		op1 += op2;
		return op1;
	}

	public static int modulo(int op1, int op2) {
		return op1 % op2;
	}

	public static double division(int op1, int op2) {
		return (double) op1 / op2;
	}

	public static int multiplication(int op1, int op2) {
		return op1 * op2;
	}

	public static int subtraction(int op1, int op2) {
		return op1 - op2;
	}

	public static int addition(int op1, int op2) {
		return op1 + op2;
	}

}
