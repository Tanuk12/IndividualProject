//all good
public class Sphere {
int r;
	
	//constructor 
	Sphere(int r) {
		this.r = r;
	}
	
	
	int calcVol() {
		int vol = (int) ((4/3)*3.1459*(r*r*r));
		return vol;
	}
	
	int calcSurfaceArea() {
		int sa = (int) (4*3.1459*r*r);
		return sa;
	}

}
