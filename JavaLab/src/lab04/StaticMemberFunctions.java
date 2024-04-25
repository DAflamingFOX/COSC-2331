package lab04;

import java.util.Scanner;
import java.util.Random;

public class StaticMemberFunctions {
	// smf - 1
	public static int howMany() {
		Scanner in = new Scanner(System.in);
		System.out.print("How many numbers: ");
		return in.nextInt();
	}
	
	// smf-2
	public static int[] generateRandom(int n, int min, int max) {
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * (max - min) + min);
		}
		return a;
	}
	
	// smf-3
	public static void checkPalindrome(int num) {
		int rev = 0;
		
		for(int i = 0; i < (int) Math.log10(num) + 1; i++) {
			rev = addDigit(rev, getDigit(num, i));
		}
		
		if (rev == num) {
			System.out.println("original: " + num + "\tReverse: "+rev + " palindrome");				
		} else {
			System.out.println("original: " + num + "\tReverse: "+rev + " not palindrome");								
		}
	}
	
	// smf-4
	public static int getDigit(int num, int index) {
		return (num / (int) Math.pow(10, index)) % 10;
	}
	
	// smf-5
	public static int addDigit(int num, int digit) {
		return num * 10 + digit;
	}
}
