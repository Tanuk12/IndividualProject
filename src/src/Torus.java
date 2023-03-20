import java.lang.Math;
public class Torus {
	int r, R;
	Torus(int r, int R){
		this.r = r;
		this.R = R;
	}
	double calcVol() {
		double vol = (Math.PI*(r*r)*(2*(Math.PI*R)));
		return vol;
	}
	double calcSurfaceArea() {
		double sa = (2*Math.PI*R)*(2*Math.PI*r);
		return sa;
	}

}
