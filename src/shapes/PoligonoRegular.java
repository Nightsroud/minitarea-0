package shapes;

import geoTools.CartesianPoint;

public class PoligonoRegular extends AbstractShape {
	private double lado;
	private double cantidad;
	
	public PoligonoRegular(CartesianPoint c, double l, double cl) {
		super(c);
		lado = l;
		cantidad = cl;
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public double getPerimeter() {
		return lado*cantidad;
	}

	@Override
	public double getWidth() {
		return 0;
	}

	@Override
	public double getHeight() {
		return 0;
	}

	@Override
	public String toString() {
		return null;
	}

}
