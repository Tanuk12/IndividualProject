class TriangluarP{
	
}
public class TriangularP extends Pyramid {
	int s;

	TriangularP(int w, int h, int l, int s) {
		super(w, h, l);
		this.w = w;
		this.h = h;
		this.l = l;
		this.s = s;
	}
	double calcVol() {
		double vol = (((l*w)/2)*h)/3;
		return vol;
	}
	double calcSurfaceArea() {
		double sa = (.5*(h*((l*w)/2)))+(1.5*((l*w)/2)*s);
		return sa;
		
	

}
}
