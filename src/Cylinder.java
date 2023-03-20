import java.lang.Math;
public class Cylinder {
int r,h;
	
	//constructor 
	
	Cylinder(int h, int r){
		this.r = r;
		this.h= h;
		
	}
	
	public double calcVol() {
		double vol = (Math.PI*(r*r)*h);
		return vol;
	}
	
	double calcSurfaceArea() {
		double sa =  (2*Math.PI*r*h)+(2*Math.PI*r*r);
		return sa;
	
}

	
}