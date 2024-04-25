
import java.util.Scanner;

public class Person {
	private String name = null;
	private int age = 1;
	private String occupation = null;
	private String address = null;
	private char gender = '\u0000';
	private boolean eligibleToVote = false;

	public Person() {
		readObjectFields();
	}
	
	public Person(String name, int age, String occupation, String address, char gender) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
		this.address = address;
		this.gender = gender;
		eligibleToVote = checkVotingEligibility();
	}
	
	public Person(Person person) {
		name = person.name;
		age = person.age;
		occupation = person.occupation;
		address = person.address;
		gender = person.gender;
		eligibleToVote = person.eligibleToVote;
	}
	
	
	boolean checkVotingEligibility() {
		return age > 18 ? true : false;
	}

	void readObjectFields() {
		Scanner input = new Scanner(System.in);
		System.out.print("Name: ");
		name = input.nextLine();
		System.out.print("Age: ");
		age = input.nextInt();
		input.nextLine();
		System.out.print("Occupation: ");
		occupation = input.nextLine();
		System.out.print("Address: ");
		address = input.nextLine();
		System.out.print("Gender: ");
		gender = input.nextLine().charAt(0);
		eligibleToVote = checkVotingEligibility();
	}

	@Override
	public String toString() {
		return String.format(
				"Person: [Name: %s, Age: %d, Occupation: %s, Address: %s, Gender: %c, Eligible To Vote: %b]", name, age,
				occupation, address, gender, eligibleToVote);
	}
}
