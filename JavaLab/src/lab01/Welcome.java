/**
 * package is a keyword used to create package
 * this should be written as first line of code in 
 * the source file
 * lab01.exp01 name of the package. follow same rule as
 * creating variable names and use lowercase.
 * each dot creates a folder by the name followed.
 */
package lab01;

/**
 * every source file can have more than one class
 * all code in Java resides inside the class definition
 * Only one class should have a main function or main
 * method.
 */

/**
 * class is a keyword
 * Welcome is an identifier just like variable. Follow the same rules as
 * variable creation. First character in each word of class name
 * maintain upper-case. (style)
 */
public class Welcome { // start of class definition
	/**
	 * main method header:
	 * public is keyword that allows anyone to access
	 * this method
	 * static is keyword that allows this method to be called
	 * or invoked by JVM without creating any object of Welcome class
	 * main is the name of the method. Execution starts from here
	 * and end by end of main
	 * String is a built in class to support string operations
	 * args[] is an array by name args of type String[] It can hold array of strings
	 */
	public static void main(String[] args) { // start of main method
		/**
		 * output statement. Same as printf in c. (not really, that would be System.out.printf();)
		 * print is a method defined in PrintStream class
		 * out is a standard output stream object
		 * System is a built in class supports system related
		 * operations
		 * 
		 */
		System.out.print("Welcome to Java Programming!");
	}	// end of main method
} // end of class definition



