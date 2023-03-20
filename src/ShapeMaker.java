import java.util.*;
public class ShapeMaker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello and welcome to the shape calculator here you will be able to calculate the volume and surface area of 3d Shapes.");
		System.out.println("what shape would you like to do you can choose from: Cuboid, Pyramid, sphere, cylinder, and cone");
		boolean loop = true;
		while(loop) {
		System.out.println("please select which shape you would like to do 1 is cube, 2 is pyramid, 3 is sphere, 4 is cone, 5 is cylinder, 6 is triangluar pyramid, 7 is torus, 8 is ellipsoid, 9 is triangular prism, and once you are done press 10");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			//Cuboid
			System.out.println("Length for Cuboid: ");
			int length = scan.nextInt();
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
			System.out.println("Height for Cylinder: ");
			int heightL = scan.nextInt();
			System.out.println("radius for cylinder: ");
			int radiusL = scan.nextInt();
		    Cylinder z1 = new Cylinder(heightL,radiusL);
			System.out.println("this is your volume: "+z1.calcVol());
			System.out.println("this is your surface area: "+z1.calcSurfaceArea());
			break;
		case 6:
			//triangular pyramid
			System.out.println("height for triangular pyramid: ");
			int heightZ = scan.nextInt();
			System.out.println("width for triangular pyramid: ");
			int widthZ = scan.nextInt();
			System.out.println("length for triangular pyramid: ");
			int lengthZ = scan.nextInt();
			System.out.println("slant for triangluar pyramid: ");
			int slantZ = scan.nextInt();
			TriangularP t1 = new TriangularP(heightZ,widthZ,lengthZ,slantZ);
			System.out.println("this is your volume: "+t1.calcVol());
			System.out.println("this is your surface area: "+t1.calcSurfaceArea());
			break;
		case 7:
			//Torus
			System.out.println("remember that the R has to be bigger than the r or else you will get a wrong calculation");
			System.out.println("radius r: ");
			int radiusY = scan.nextInt();
			System.out.println("radius R: ");
			int RadiusY = scan.nextInt();
			Torus o1 = new Torus(radiusY,RadiusY);
			System.out.println("this is your volume: "+o1.calcVol());
			System.out.println("this is your surface area: "+o1.calcSurfaceArea());
			break;
		case 8:
			// Ellipsoid
			System.out.println("value for axis a: ");
			int aE = scan.nextInt();
			System.out.println("value for axis b: ");
			int bE = scan.nextInt();
			System.out.println("value for axis c: ");
			int cE = scan.nextInt();
			Ellipsoid v1 = new Ellipsoid(aE,bE,cE);
			System.out.println("this is your volume: "+v1.calcVol());
			System.out.println("this is your surface area: "+v1.calcSurfaceArea());
			break;
		case 9:
			System.out.println("a base side: ");
			int a = scan.nextInt();
			System.out.println("b base side: ");
			int b = scan.nextInt();
			System.out.println("c base side: ");
			int c = scan.nextInt();
			System.out.println("height: ");
			int h = scan.nextInt();
			Triangularprism x1 = new Triangularprism(a,b,c,h);
			System.out.println("this is your volume: "+x1.calcVol());
			System.out.println("this is your surface area: "+x1.calcSurfaceArea());
			break;
		case 10:
			System.out.println("base edge: ");
			int aF = scan.nextInt();
			System.out.println("height: ");
			int hF = scan.nextInt();
			Hexagonalprism r1 = new Hexagonalprism(aF,hF);
			System.out.println("this is your volume: "+r1.calcVol());
			System.out.println("this is your surface area: "+r1.calcSurfacearea());
			break;
		case 11:
			loop = false;
			break;
		  }
		}
		scan.close();

	}
}
