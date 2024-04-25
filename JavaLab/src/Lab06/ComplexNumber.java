package Lab06;

public class ComplexNumber {
	private int real;
	private int imaginary;
	
	public ComplexNumber() {
		real = 0;
		imaginary = 0;
	}
	
	public ComplexNumber(int imaginary) {
		real = 0;
		this.imaginary = imaginary;
	}
	
	public ComplexNumber(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public static ComplexNumber addComp(int a, ComplexNumber cn1) {
		return new ComplexNumber(cn1.real+a,cn1.imaginary);
	}
	
	public static ComplexNumber addComp(ComplexNumber cn1, ComplexNumber cn2) {
		return cn1.addComp(cn2);
	}
	
	public ComplexNumber addComp(ComplexNumber cn1) {
		return new ComplexNumber(real + cn1.real, imaginary + cn1.imaginary);
	}

	@Override
	public String toString() {
		return String.format("(%d%+di)", real, imaginary);
	}
	
	public static void main(String[] args) {
		ComplexNumber cn1 = new ComplexNumber(5, 3);
		ComplexNumber cn2 = new ComplexNumber(7, 2);
		
		System.out.println("cn1: " + cn1);
		System.out.println("cn2: " + cn2);
		System.out.println("cn1 + 2: " + ComplexNumber.addComp(2, cn1));
		System.out.println("cn1 + cn2: " + ComplexNumber.addComp(cn1, cn2));
		System.out.println("cn1 + (3-7i): " + cn1.addComp(new ComplexNumber(3, -7)));
		
	}
	
}
