package Lab08;

import java.util.Scanner;

public class Runner {

	
	public static void main(String[] args) {
		
		
		Employee e[] = new Employee[Employee.getInput("How many employees:")];
		
		for (int i = 0; i < e.length; i++) {
			e[i] = new Employee(e, i);
		}
		
		Scanner s = new Scanner(System.in);
		
		int id = Employee.getInput("Enter the id to be searched:");
		
		Employee.search(e, id);
		
		System.out.println();
		System.out.println("Employee information before sorting...");
		Employee.displayAll(e);
		
		Employee.sortBasedOnNames(e);
		System.out.println("Employee information after sorting...");
		Employee.displayAll(e);
	}
}
