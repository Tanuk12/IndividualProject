// NEED TO WORK ON SURFACE AREA FOR THIS
public class Pyramid {
	int l,w,h;
	Pyramid(int w, int h, int l) {
		this.w = w;
		this.h = h;
		this.l = l;
	}
	
	
	int calcVol() {
		int vol = (l*w*h)/3;
		return vol;
	}
	
	int calcSurfaceArea() {
		int sa = (int) (l*w+l);
		return sa;
		
	}
	

}
