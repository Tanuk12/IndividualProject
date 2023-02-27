

//all good
public class Cuboid {
	//member variables
	int l,w,h;
	
	//constructor 
	
	Cuboid(int l, int w, int h){
		this.l = l;
		this.w = w;
		this.h= h;
		
	}
	
	public double calcVol() {
		double vol = l*w*h;
		return vol;
	}
	
	double calcSurfaceArea() {
		double sa = 2*l*h + 2*w*l + 2*h*w;
		return sa;
	}

}
