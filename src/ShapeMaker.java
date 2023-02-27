import java.util.*;
public class ShapeMaker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello and welcome to the shape calculator here you will be able to calculate the volume and surface area of 3d Shapes.");
		System.out.println("what shape would you like to do you can choose from: Cuboid, Pyramid, sphere, cylinder, and cone");
		boolean loop = true;
		while(loop) {
		System.out.println("please select which shape you would like to do 1 is cube, 2 is pyramid, 3 is sphere, 4 is cone, 5 is cylinder, and once you are doen press 6");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			//Cuboid
			int length = scan.nextInt();
			System.out.println("Length for Cuboid: ");
			System.out.println("Width for Cuboid: ");
			int width = scan.nextInt();
			System.out.println("Height for Cuboid: ");
			int height = scan.nextInt();
		    Cuboid c1 = new Cuboid(length,width,height);
			System.out.println("this is your volume: "+c1.calcVol());
			System.out.println("this is your surface area "+c1.calcSurfaceArea());
			break;
		case 2:
			//Pyramid
			System.out.println("Length for Pyramid: ");
			int lengthP = scan.nextInt();
			System.out.println("Width for Pyramid: ");
			int widthP = scan.nextInt();
			System.out.println("Height for Pyramid: ");
			int heightP = scan.nextInt();
		    Pyramid p1 = new Pyramid(lengthP,widthP,heightP);
			System.out.println("this is your volume: "+p1.calcVol());
			System.out.println("this is your surface area: "+p1.calcSurfaceArea());
			break;
		case 3:
			//Sphere
			System.out.println("Radius for Sphere: ");
			int radius = scan.nextInt();
		    Sphere s1 = new Sphere(radius);
			System.out.println("this is your volume: "+s1.calcVol());
			System.out.println("this is your surface area: "+s1.calcSurfaceArea());
			break;
		case 4:
			//Cone
			System.out.println("Radius for Cone: ");
			int heightC = scan.nextInt();
			System.out.println("Height for Cone: ");
			int radiusC = scan.nextInt();
		    Cone l1 = new Cone(heightC,radiusC);
			System.out.println("this is your volume: "+l1.calcVol());
			System.out.println("this is your surface area: "+l1.calcSurfaceArea());
			break;
		case 5:
			//Cylinder
			int heightL = scan.nextInt();
			System.out.println("Height for Cylinder: ");
			int radiusL = scan.nextInt();
			System.out.println("radius for cylinder: ");
		    Cylinder z1 = new Cylinder(heightL,radiusL);
			System.out.println("this is your volume: "+z1.calcVol());
			System.out.println("this is your surface area: "+z1.calcSurfaceArea());
			break;
		case 6:
			loop = false;
			break;
		  }
		}
		
	 
		
		scan.close();

	}
}
