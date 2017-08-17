package shapes;

import geoTools.CartesianPoint;

public class PoligonoRegular extends AbstractShape {
	private double lado;
	private double cantidad;
	private double apotema;
	private double circunradio;
	
	/**
	 * Constructor para PoligonoRegular
	 * @param c Centro de la figura
	 * @param l Medida de los lados de la figura
	 * @param cl Numero de lados de la figura
	 * @param ap Valor de la apotema de la figura
	 * @param cr Valor del circunradio de la figura
	 */
	public PoligonoRegular(CartesianPoint c, double l, double cl, double ap, double cr) {
		super(c);
		lado = l;
		cantidad = cl;
		apotema = ap;
		circunradio = cr;
	}
	
	/**
	 * Retorna el area de la figura
	 */
	@Override
	public double getArea() {
		return (lado/2)*apotema*cantidad;
	}
	
	/**
	 * Retorna el perimetro de la figura
	 */
	@Override
	public double getPerimeter() {
		return lado*cantidad;
	}
	
	/**
	 * Retorna el ancho de la figura
	 */
	@Override
	public double getWidth() {
		if(lado%4 == 0) {return 2.0*apotema;}
		else {return 2*lado;}
		
	}
	
	/**
	 * Retorna la altura de la figura
	 */
	
	@Override
	public double getHeight() {
		if(lado%2 != 0) {return apotema + circunradio;}
		else {return 2.0*apotema;}
	}
	
	@Override
	public String toString() {
		return "("+lado+","+cantidad+","+apotema+","+circunradio+")";
	}

}
