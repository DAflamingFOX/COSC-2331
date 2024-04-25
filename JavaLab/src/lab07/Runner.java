package lab07;

public class Runner {
	
	public static void main(String[] args) {
		System.out.println("Main method..." + Volume.getCountObject());
		
		
		Volume cone = new Volume("Cone");
		Volume cube = new Volume("Cube");
		Volume cuboid = new Volume("Cuboid");
		Volume sphere = new Volume("Sphere");
		Volume cylinder = new Volume("Cylinder");
		
		System.out.println(cone);
		System.out.println(cube);
		System.out.println(cuboid);
		System.out.println(sphere);
		System.out.println(cylinder);

	
	
	}
}
