package lab05;

public class CircleDemo {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		System.out.println(c1.toString("c1"));
		c1.setRadius(5);
		c1.setArea(Math.pow(c1.getRadius(),2)*Circle.getPI());
		System.out.println(c1.toString("c1"));
		
		Circle c2 = new Circle();
		System.out.println(c2.toString("c2"));
		c2.initObject();
		System.out.println(c2.toString("c2"));		
		
		Circle c3 = new Circle();
		System.out.println(c3.toString("c3"));
		c3.readRadius();
		c3.setArea(Circle.getPI() * c3.getRadius() * c3.getRadius());
		c3.setCircumference(Circle.getPI() * 2 * c3.getRadius());
		c3.setDiameter(2*c3.getRadius());
		System.out.println(c3.toString("c3"));
		
		Circle c4 = new Circle();
		System.out.println(c4.toString("c4"));
		c4.setRadius(156.13);
		c4.calculateArea();
		c4.calculateCircumference();
		c4.setDiameter(2*c4.getRadius());
		System.out.println(c4.toString("c4"));
		
		Circle c5 = new Circle();
		System.out.println(c5.toString("c5"));
		c5.setArea(200);
		System.out.println(c5.toString("c5"));
		
		Circle c6 = new Circle(100);
		System.out.println(c6.toString("c6"));
		
		Circle c7 = new Circle(125, 1023);
		System.out.println(c7.toString("c7"));
	}
}
