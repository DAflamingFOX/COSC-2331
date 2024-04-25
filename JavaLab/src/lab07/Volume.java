package lab07;

import java.util.Scanner;

public class Volume {

	private double dLength, dWidth, dHeight, dRadius;
	private String sShape;
	private static double dPI;
	
	static int countObject;
	
	
	static {
		System.out.println("Static block...");
		dPI = Math.PI;
	}
	
	Volume() {
		System.out.println("Zero param.");
	}
	
	Volume(String shape) {
		this(shape, rand(), rand(), rand(), rand());
		System.out.println("One param.");
	}
	
	Volume(String shape, double length, double width, double height, double radius) {
		sShape = shape.toUpperCase();
		dLength = length;
		dWidth = width;
		dHeight = height;
		dRadius = radius;
		if (sShape.equals("CUBE")) {
			dLength = dWidth = dHeight = length;
			dRadius = 0;
		}
		Volume.countObject++;
	}
	
	double calVolume() {
		return 0;
	}
	
	static double read(String msg) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(msg);
		return scanner.nextDouble();
	}
	
	static double rand() {
		return Math.round((Math.random() * (10 - 1) + 1)*100) / 100D; 
	}
	
	public double getdLength() {
		return dLength;
	}

	public void setdLength(double dLength) {
		this.dLength = dLength;
	}

	public double getdWidth() {
		return dWidth;
	}

	public void setdWidth(double dWidth) {
		this.dWidth = dWidth;
	}

	public double getdHeight() {
		return dHeight;
	}

	public void setdHeight(double dHeight) {
		this.dHeight = dHeight;
	}

	public double getdRadius() {
		return dRadius;
	}

	public void setdRadius(double dRadius) {
		this.dRadius = dRadius;
	}

	public String getsShape() {
		return sShape;
	}

	public void setsShape(String sShape) {
		this.sShape = sShape;
	}

	public static int getCountObject() {
		return countObject;
	}

	public static void setCountObject(int countObject) {
		Volume.countObject = countObject;
	}

	public static double getdPI() {
		return dPI;
	}

	public static void setdPI(double dPI) {
		Volume.dPI = dPI;
	}

	double getVolume() {
		double vol = switch(sShape) {
			default -> 0;
			case "CUBE" -> dLength * dWidth * dHeight;
			case "CUBOID" -> dLength * dWidth * dHeight;
			case "SPHERE" -> 4D/3D * dPI * dRadius * dRadius * dRadius;
			case "CYLINDER" -> dPI * dRadius * dRadius * dHeight;
			case "CONE" -> 1D/3D * dPI * dRadius * dRadius * dHeight;
		};
		
		return Math.round(vol * 100) / 100D;
	}

	@Override
	public String toString() {
		return "Volume [Volume="+getVolume()+", dLength=" + dLength + ", dWidth=" + dWidth + ", dHeight=" + dHeight + ", dRadius=" + dRadius
				+ ", sShape=" + sShape + ", countObjects="+ Volume.countObject+"]";
	}
	
	
}
