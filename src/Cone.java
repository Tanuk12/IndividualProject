import java.lang.Math;

public class Cone {
int r,h;
	
	//constructor 
	
	Cone(int h, int r){
		this.r = r;
		this.h= h;
		
	}
	
	public double calcVol() {
		double vol = (Math.PI*(r*r)*h/3);
		return vol;
	}
	
	double calcSurfaceArea() {
		double sa =  ((Math.PI*r)*(r+(Math.sqrt((h*h)+(r*r)))));
		return sa;
	
}

	
}
