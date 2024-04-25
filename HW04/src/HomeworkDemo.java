
public class HomeworkDemo {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Jeffrey", 18, "Electrical Engineer", "123 Not Gonna Tell Ya Lane", 'M');
		Person p3 = new Person(p2);
		Telivision t1 = new Telivision();
		Telivision t2 = new Telivision(69, 3, true);
		Telivision t3 = new Telivision(t2);
		
		p1.readObjectFields();
		System.out.println("Can p2 vote? "+ (p2.checkVotingEligibility() ? "Yes!" : "No!"));
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		t1.turnOn();
		t2.turnOff();
		t3.setChannel(500);
		t1.setVolume(-3);
		t2.channelUp();
		t3.channelDown();
		t1.volumeUp();
		t2.volumeDown();
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
