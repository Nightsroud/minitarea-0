package shapes;

import geoTools.CartesianPoint;

/**
 * Represents an abstract cartesian shape.
 * @author eriveros
 *
 */
public abstract class AbstractShape {
	
	private CartesianPoint center;
	
	/**
	 * Constructor for AbstractShape
	 * @param c Center of shape
	 */
	public AbstractShape(CartesianPoint c) {
		center = c;
	}
	
	/**
	 * Returns the center of the shape
	 * @return shape's center
	 */
	public  CartesianPoint getPosition() {
		return center;
	}
	
	/**
	 * Returns the area of the shape
	 * @return shape's area
	 */
	public abstract double getArea();
	
	/**
	 * Returns the perimeter of the shape
	 * @return shape's perimeter
	 */
	public abstract double getPerimeter();
	
	/**
	 * Returns the width of the shape
	 * @return shape's width;
	 */
	public abstract double getWidth();
	
	/**
	 * Returns the height of the shape
	 * @return shape's height
	 */
	public abstract double getHeight();
	
	@Override
	public abstract String toString();
	
}
