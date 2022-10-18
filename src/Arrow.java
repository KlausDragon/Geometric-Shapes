import java.awt.*;
/**
 * @author aabbasimoghadd00
 * this class is a subclass of GeometricShape class
 * and is going to be used for creating an Arrow object
 * - radius: double is the variable used for the methods
 */
public class Arrow extends GeometricShape {
	private double side;
	private double height;
	Rectangle rec;
	/**
	 * method that is called when an object is instantiated.
	 * this Arrow class constructor initializes instances(objects) 
	 * of the class
	 * @param side: is arrow's sideLength
	 * @param filledOrNot: is to instantiate for whether the shape is filled or not 
	 * @param color: for setting a color
	 */
	public Arrow (double side, boolean filledOrNot, Color color, int X, int Y) {
		super(color,filledOrNot, X, Y);
		this.side = side;
		this.height = (side * Math.sqrt(3))/2;
	}
	/**
	 * is used to draw the wanted geometric shape by passing a graphics object to the method
	 */
	public void draw(Graphics2D g2) {
		rec = new Rectangle(X, Y, (int)side, (int)side);
		int[] xPoint = {X+(int)side, (X+(int)side) , (X+(int)side) + (int)height};
		int[] yPoint = {Y-(int)side, Y+((int)side*2), Y+((int)side/2)};
		Polygon tri = new Polygon(xPoint, yPoint, 3);
		g2.setColor(getColor());
		if(isFilledOrNot()) {
			g2.fill(rec);
			g2.fill(tri);
		} else {
			g2.draw(rec);
			g2.draw(tri);
		}
	}
	@Override
	public double getArea() {
		double area = (4*side)+(1/2 *(3*side)*height);
		return area;
	}
	@Override
	public double getPerimeter() {
		double perimeter = 7*side;
		return perimeter;
	}
}
