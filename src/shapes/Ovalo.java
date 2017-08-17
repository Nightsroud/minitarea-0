package shapes;

import geoTools.CartesianPoint;

public class Ovalo extends AbstractShape {
	private double a;
	private double b;
	public Ovalo(CartesianPoint c, double A, double B) {
		super(c);
		a = A;
		b = B;
	}

	@Override
	public double getArea() {
		return a*b*3.14;
	}

	@Override
	public double getPerimeter() {
		return 3.14*(3.0*(a+b)-Math.sqrt((3.0*a + b)*(a + 3.0*b)));
	}

	@Override
	public double getWidth() {
		return 2.0*a;
	}

	@Override
	public double getHeight() {
		return 2.0*b;
	}

	@Override
	public String toString() {
		return  "(" + b + "," + a + ")";
	}

}
