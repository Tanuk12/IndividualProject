import java.lang.Math;
public class Ellipsoid {
	int a,b,c,d,e,f,g;
	Ellipsoid(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;	
		d = a*b;
		e = a*c;
		f = b*c;
		g = a*b*c;
	}
	double calcVol() {
		double vol =  (1.33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333)*Math.PI*g;
		return vol;
		
	}
	double calcSurfaceArea() {
		double sa = 4*Math.PI*(Math.pow(((Math.pow(d , 1.6)+Math.pow(e, 1.6)+Math.pow(f, 1.6))/3), 1/1.6));
		return sa;
	}

}
