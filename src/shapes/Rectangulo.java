package shapes;

import geoTools.CartesianPoint;

public class Rectangulo extends AbstractShape {
	private double largo;
	private double alto;

	public Rectangulo(CartesianPoint c, double L, double A) {
		super(c);
		largo = L;
		alto = A;
	}

	@Override
	public double getArea() {
		return largo*alto;
	}

	@Override
	public double getPerimeter() {
		return 2.0*largo + 2.0+alto;
	}

	@Override
	public double getWidth() {
		return largo;
	}

	@Override
	public double getHeight() {
		return alto;
	}

	@Override
	public String toString() {
		return "(" + largo + "," + alto + ")";
	}

}
