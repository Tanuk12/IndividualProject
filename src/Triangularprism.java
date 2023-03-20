import java.lang.Math;
public class Triangularprism {
	int a,b,c,h;
	Triangularprism(int a, int b, int c, int h){
		this.a=a;
		this.b=b;
		this.c=c;
		this.h=h;
		
		
	}
	double calcVol() {
		double vol = .25*h*(((Math.sqrt((0-(Math.pow(a, 4)))+(2*(Math.pow(a, b)))+(2*(Math.pow(a, c)))+(0-(Math.pow(b, 4)))+(2*(Math.pow(b, c)))+(0-(Math.pow(c, 4)))))));
		return vol;
	}
	double calcSurfaceArea() {
		double sa = a*h+b*h+c*h+.5*(((Math.sqrt((0-(Math.pow(a, 4)))+(2*(Math.pow(a, b)))+(2*(Math.pow(a, c)))+(0-(Math.pow(b, 4)))+(2*(Math.pow(b, c)))+(0-(Math.pow(c, 4)))))));
		return sa;
	}

}