package prob01;

public class Problem01 {

	public static void main(String[] args) {
		// compile-time error - no semicolon.
		// int x = 1 + 2
		// runtime error - divide by zero
		// double q = 150 / 0;
		// logic error - ^ is XOR operator, java has no power operator
		int f = 2^2; // result is 0, not 4
		System.out.println("2^2 = " + f);	
	}

}
