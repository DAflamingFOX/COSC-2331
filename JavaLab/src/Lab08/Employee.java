package Lab08;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {

	private int employeeID;
	private double pay, allowance, netSalary, incomeTax;
	private String name;

	public Employee(Employee e[], int i) {
		readEmployeeInfo(e, i);
		calAllowance();
		calTax();
		calSalary();
		System.out.println(this);
	}

	static int getInput(String msg) {
		Scanner s = new Scanner(System.in);
		System.out.println(msg);
		return s.nextInt();
	}

	static void search(Employee e[], int id) {
		for (Employee emp : e) {
			if (emp.employeeID == id) {
				displayAll(new Employee[] {emp});
				return;
			}
		}
		System.out.println("No Employee found.");
	}

	void readEmployeeInfo(Employee[] e, int i) {
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Enter ID: ");
			employeeID = s.nextInt();
		} while (validateID(e, i, employeeID));
		s.nextLine();
		System.out.println("Enter Name: ");
		name = s.nextLine();
		System.out.println("Enter Basic Pay: ");
		pay = s.nextDouble();
	}

	boolean validateID(Employee[] e, int i, int id) {
		for (Employee emp : e) {
			if (emp == null)
				continue;
			if (emp.employeeID == id)
				return true;
		}
//		
//		for (int j = 0; j < i; j++) {
//			if (this.employeeID == e[i].employeeID) {
//				System.out.println("Invalid id.");
//				return true;
//			}
//		}
		return false;
	}

	void calAllowance() {
		this.allowance = .5 * this.pay;
	}

	void calTax() {
		double gross = pay + allowance;
		if (gross <= 5000)
			incomeTax = 0;
		else if (gross > 5000 && gross <= 6000)
			incomeTax = .1 * pay;
		else if (gross > 6000 && gross <= 10000)
			incomeTax = .15 * pay;
		else
			incomeTax = .2 * pay;
	}

	void calSalary() {
		netSalary = pay + allowance - incomeTax;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getIncomeTax() {
		return incomeTax;
	}

	public void setIncomeTax(double incomeTax) {
		this.incomeTax = incomeTax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", pay=" + pay + ", allowance=" + allowance + ", netSalary="
				+ netSalary + ", incomeTax=" + incomeTax + ", name=" + name + "]";
	}

	public static void displayAll(Employee[] e) {
		
		System.out.println("|------------------------------------------------------------------------------------------|");
		System.out.printf("|%-10s%-20s%-15s%-15s%-15s%-15s|\n", "EMP ID", "Name", "Basic Pay", "Allowance", "Income Tax",
				"Net Salary");
		System.out.println("|------------------------------------------------------------------------------------------|");
		
		for(Employee emp : e) {
		
		System.out.printf("|%-10d%-20s%-15.2f%-15.2f%-15.2f%-15.2f|\n", emp.employeeID, emp.name, emp.pay, emp.allowance, emp.incomeTax,
				emp.netSalary);
		}
		
		System.out.println("|------------------------------------------------------------------------------------------|");

	}

	public static void sortBasedOnNames(Employee[] e) {
		Arrays.sort(e, (e1, e2) -> e1.name.compareTo(e2.name));
	}

}
