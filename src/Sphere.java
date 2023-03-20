

//all good
public class Sphere {
int r;
	
	//constructor 
	Sphere(int r) {
		this.r = r;
	}
	
	
	double calcVol() {
		double vol = ((4/3)*3.1459*(r*r*r));
		return vol;
	}
	
	double calcSurfaceArea() {
		double sa = (4*3.1459*r*r);
		return sa;
	}

}
