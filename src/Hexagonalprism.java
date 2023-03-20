import java.lang.Math;
public class Hexagonalprism {
	int a,h;
	Hexagonalprism(int a, int h){
		this.a = a;
		this.h = h;
		
	}
	double calcVol() {
		double vol = (3*Math.sqrt(3))*Math.pow(a, 2)*h;
		return vol;
		
	}
	double calcSurfacearea() {
		double sa = 6*a*h+3*Math.sqrt(3)*Math.pow(a, 2);
		return sa;
	}

}
