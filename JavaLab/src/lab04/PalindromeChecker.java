package lab04;

import java.util.Random;
import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		
		
		int a[] = StaticMemberFunctions.generateRandom(StaticMemberFunctions.howMany(), 10, 1000);
		
		for(int i = 0; i < a.length; i++) {
			StaticMemberFunctions.checkPalindrome(a[i]);
		}
		
	}
	
	
	
	
}
