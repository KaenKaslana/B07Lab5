package lab4;

public class Oval {
	Point center;
	double a;
	double b;
	
	public Oval(Point center, double a,double b) {
		this.center = center;
		this.a = a;
		this.b = b;
	
	}
	

	public double Area(){

		return Math.PI * a * b;
	}
	public boolean isCircle() {

		return a == b;
	}
}
