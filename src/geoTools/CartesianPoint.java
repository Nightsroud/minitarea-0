package geoTools;

public class CartesianPoint {
	private double x;
	private double y;
	
	public CartesianPoint(double cx, double cy) {
		moveTo(cx, cy);
	}
	
	/**
	 * X coordinate getter
	 * @return x coordinate of point
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * Y coordinate getter
	 * @return y coordinate of point
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * Allows to move a point to position (cx, cy)
	 * @param cx Position in x axis
	 * @param cy Position in y axis
	 */
	public void moveTo(double cx, double cy) {
		x = cx;
		y = cy;	
	}
	
	/**
	 * Allows to move a point relatively to its current position
	 * @param dx Delta in x axis
	 * @param dy Delta in y axis
	 */
	public void moveDelta(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	/**
	 * Returns a new point, with coordinates added between this point
	 * and argument's point
	 * @param p2 The other point
	 * @return A new point, with added coordinates
	 */
	public CartesianPoint add(CartesianPoint p2) {
		return new CartesianPoint(x + p2.x, y + p2.y); // Does this line work? why?
	}
	
	/**
	 * Returns the distance between this point and another point
	 * @param p2 The other point
	 * @return double representing the distance between points.
	 */
	public double distance(CartesianPoint p2) {
		return Math.sqrt(Math.pow(p2.x - x, 2) + Math.pow(p2.y - y, 2));
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
	

