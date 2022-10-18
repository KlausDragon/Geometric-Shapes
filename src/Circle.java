import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
/**
 * @author aabbasimoghadd00
 * this class is a subclass of GeometricShape class
 * and is going to be used for creating a Circle object
 * - radius: double is the variable used for the methods
 */
public class Circle extends GeometricShape {
	private double radius;
	/**
	 * method that is called when an object is instantiated.
	 * this Circle class constructor initializes instances(objects) 
	 * of the class
	 * @param radius: is circle's radius
	 * @param filledOrNot: is to instantiate for whether the shape is filled or not 
	 * @param: for setting a color
	 */
	public Circle(double radius, boolean filledOrNot, Color color, int X, int Y) {
		super(color,filledOrNot, X, Y);
		this.radius = radius;
	}
	/**
	 * is used to draw the wanted geometric shape by passing a graphics object to the method
	 */
	public void draw(Graphics2D g2) {
		Ellipse2D.Double circle = new Ellipse2D.Double(X-radius,Y-radius,2*radius,2*radius);
		g2.setColor(getColor());
		if(isFilledOrNot()) {
			g2.fill(circle);
		} else {
			g2.draw(circle);
		}
	}
	/**
	 * a method that reads the value of radius
	 * @return radius: type double
	 */
	public double getRadius() {
		return radius;
	}
	/**
	 * method that updates the value of radius variable
	 * @param radius: initialized
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	/**
	 * returns a rounded double
	 * of the Area of Circle
	 */
	public double getArea() {
		double area = (Math.PI)*(Math.pow(radius, 2));
		return Math.round(area*10)/10.0;
	}
	@Override
	/**
	 * returns a rounded double
	 * of the Perimeter of Circle
	 */
	public double getPerimeter() {
		double perimeter = (2)*(Math.PI)*(radius);
		return Math.round(perimeter*10)/10.0;
	}
	/**
	 * returns the string representation of the object
	 */
	public String toString() {
		return "the "+ getColor() + " Circle with Area " + getArea()
		+ " and Parameter " + getPerimeter() + (isFilledOrNot()==true?" and it is filled":" and it's not filled");
	}
}
