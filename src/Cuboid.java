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
	
	public int calcVol() {
		int vol = l*w*h;
		return vol;
	}
	
	int calcSurfaceArea() {
		int sa = 2*l*h + 2*w*l + 2*h*w;
		return sa;
	}

}
