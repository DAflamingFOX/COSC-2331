// this tells java what package this class is in.
package lab01;


// This is the class which contains all of the code for this problem
public class ExpressionEvaluation {

	// The main function, which is the entry point to the code
	public static void main(String[] args) {
		// this uses the XOR operator instead of a power operator, in java you have to use Math.pow() to do a power operation as there is no native operator symbol
		double val = (2^2+(3*4))/(3.0+4.0);
		// these two lines print out the value, the first one uses the stored value, the second one re evaluates it, within the println parameters.
		System.out.println("Exp2: (2^2+(3*4))/(3.0+4.0) = " + val);
		System.out.println("Exp2: (2^2+(3*4))/(3.0+4.0) = " + (2^2+(3*4))/(3.0+4.0));
	
		// this changes the equation to use the power function as expected and the value as shown in the console is correct this time.
		val = Math.pow(2, 2)+(3*4)/(3.0+4.0);
		// same thing as before.
		System.out.println("Exp1: Math.pow(2, 2)+(3*4)/(3.0+4.0) = " + val);
		System.out.println("Exp1: Math.pow(2, 2)+(3*4)/(3.0+4.0) = " + (Math.pow(2, 2)+(3*4)/(3.0+4.0)));
	} // end of main
} // end of class
