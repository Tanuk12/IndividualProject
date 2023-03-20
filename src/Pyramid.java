
public class Pyramid {
	int l,w,h;
	Pyramid(int w, int h, int l) {
		this.w = w;
		this.h = h;
		this.l = l;
	}
	
	
	double calcVol() {
		double vol = (l*w*h)/3;
		return vol;
	}
	
	double calcSurfaceArea() {
		double sa = (l*w+l);
		return sa;
		
	}
	

}