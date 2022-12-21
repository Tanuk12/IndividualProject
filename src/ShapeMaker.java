 import java.util.*;
public class ShapeMaker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello and welcome to the shape calculator here you will be able to calculate the volume and surface area of 3d Shapes.");
		System.out.println("Length for Cuboid: ");
		int length = scan.nextInt();
		System.out.println("Width for Cuboid: ");
		int width = scan.nextInt();
		System.out.println("Height for Cuboid: ");
		int height = scan.nextInt();
	    Cuboid c1 = new Cuboid(length,width,height);
		System.out.println(c1.calcVol());
		System.out.println(c1.calcSurfaceArea());
		System.out.println("Length for Pyramid: ");
		int lengthP = scan.nextInt();
		System.out.println("Width for Pyramid: ");
		int widthP = scan.nextInt();
		System.out.println("Height for Pyramid: ");
		int heightP = scan.nextInt();
	    Pyramid p1 = new Pyramid(lengthP,widthP,heightP);
		System.out.println(p1.calcVol());
		System.out.println(p1.calcSurfaceArea());
		System.out.println("Radius for Sphere: ");
		int radius = scan.nextInt();
	    Sphere s1 = new Sphere(radius);
		System.out.println(s1.calcVol());
		System.out.println(s1.calcSurfaceArea());
		scan.close();

	}

}
