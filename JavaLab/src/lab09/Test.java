package lab09;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1.toString("c1"));
		
		Circle c2 = new Circle(10);
		System.out.println(c2.toString("c2"));

		Circle c3 = new Circle(10, "blue");
		System.out.println(c3.toString("c3"));
		
		Figure ref = c1;
		System.out.println(ref.toString("ref"));
		
		Rectangle r1 = new Rectangle();
		System.out.println(r1.toString("r1"));
		Rectangle r2 = new Rectangle(10,20);
		System.out.println(r2.toString("r2"));
		Rectangle r3 = new Rectangle(30,40, "green");
		System.out.println(r3.toString("r3"));
		
		Triangle t1 = new Triangle();
		System.out.println(t1.toString("t1"));
		Triangle t2 = new Triangle(3, 5, 4);
		System.out.println(t2.toString("t2"));
		Triangle t3 = new Triangle(15, 51, 63, "yellow");
		System.out.println(t3.toString("t3"));
		
		
		System.out.println("\n\n");
		
		int n,m,o;
		n = getNum("How many circles: ");
		m = getNum("How many rectangles: ");
		o = getNum("How many triangles: ");
		Circle[] c = new Circle[n];
		for (int i= 0; i< c.length; i++) {
			c[i] = new Circle(10, "red");
		}
		
		Rectangle[] r = new Rectangle[m];
		for (int i= 0; i< r.length; i++) {
			r[i] = new Rectangle(10, 20, "orange");
		}
		
		Triangle[] t = new Triangle[o];
		for (int i= 0; i< t.length; i++) {
			t[i] = new Triangle(3, 4, 5, "Magenta");
		}
		
		for (int i= 0; i< c.length; i++) {
			ref = c[i];
			System.out.println(ref.toString("circle"));
		}
		for (int i= 0; i< r.length; i++) {
			ref = r[i];
			System.out.println(ref.toString("rectangle"));
		}
		for (int i= 0; i< t.length; i++) {
			ref = t[i];
			System.out.println(ref.toString("triangle"));
		}
		
		
	
		
	}
	
	public static int getNum(String msg) {
		Scanner s = new Scanner(System.in);
		System.out.println(msg);
		return s.nextInt();
	}
}
