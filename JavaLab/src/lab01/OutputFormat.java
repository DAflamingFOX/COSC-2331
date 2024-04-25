// again, this is the package identifier
package lab01;

// this is the class definition
public class OutputFormat {

	// this is the main method entry point
	public static void main(String[] args) {
		// these lines will all print the designated string to the std output with a newline at the end.
		System.out.println("________________________________________________________________");
		System.out.println("|NAME       PHONE_NUMBER     EMAIL           JOB_LOCATION      |");
		System.out.println("|--------------------------------------------------------------|");
		System.out.println("|Jonny      254-236-8888     jonny@xyz.com   Dallas, TX        |");
		System.out.println("|Susan      254-396-4458     susan@abc.com   Amarillo, TX      |");
		System.out.println("|Tommy      254-978-5052     tommy@qrs.com   Stephenville, TX  |");
		System.out.println("|Janet      214-901-5023     janet@ijk.com   Houston, TX       |");
		System.out.println("|--------------------------------------------------------------|");
		
		
		// These lines use string formatting with printf to align the prints instead of manually.
		System.out.println("___________________________________________________________________");
		System.out.printf("|%-10s%-15s%-20s%-20s|\n", "NAME", "PHONE_NUMBER", "EMAIL", "JOB_LOCATION");
		System.out.println("|-----------------------------------------------------------------|");
		System.out.printf("|%-10s%-15s%-20s%-20s|\n", "Jonny", "254-236-8888", "jonny@xyz.com", "Dallas, TX");
		System.out.printf("|%-10s%-15s%-20s%-20s|\n", "Susan", "254-396-4458", "susan@abc.com", "Amarillo, TX");
		System.out.printf("|%-10s%-15s%-20s%-20s|\n", "Tommy", "254-978-5052", "tommy@qrs.com", "Stephenville, TX");
		System.out.printf("|%-10s%-15s%-20s%-20s|\n", "Janet", "214-901-5023", "janet@ijk.com", "Houston, TX");
		System.out.println("|-----------------------------------------------------------------|");
		
	} // end of main
} // end of class
