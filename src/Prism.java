//NEED TO WORK ON LITERALLY EVERYTHING THIS WAS MORE COMPLICATED THAN I THOUGHT IT WOULD BE
public class Prism  {
int l,w,h;
	
	//constructor 
	Prism(int l, int w, int h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}
	
	
	int calcVol() {
		int vol = (l*w*h)/3;
		return vol;
	}
	
	int calcSurfaceArea() {
		int sa = 2*l*h + 2*w*l + 2*h*w;
		return sa;
	}

}
