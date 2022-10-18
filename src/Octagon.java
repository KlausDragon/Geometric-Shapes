import java.awt.Color;
import java.awt.Graphics2D;
/**
 * @author aabbasimoghadd00
 * this class is a subclass of GeometricShape class
 * and is going to be used for creating an Octagon object
 * - sideLength: double is the variable used for the methods
 */
public class Octagon extends GeometricShape {
	private double sideLength;
	/**
	 * method that is called when an object is instantiated.
	 * this Octagon class constructor initializes instances(objects) 
	 * of the class
	 * @param radius: is circle's radius
	 * @param filledOrNot: is to instantiate for whether the shape is filled or not 
	 * @param color: for setting a color
	 */
	public Octagon(double sideLength, boolean filledOrNot, Color color, int X, int Y) {
		super(color,filledOrNot, X, Y);
		this.sideLength = sideLength;
	}
	public void draw(Graphics2D g2) {
		int a = (int) (sideLength/Math.sqrt(2));
		int d = (int) (sideLength);
		// x coordinates
		int x[] = {X, X+d, X+d+a, X+d+a, X+d, X, X-a, X-a};
		//int x[] = {X+19, X+63, X+92, X+92, X+63, X+19, X-10, X-10}; 
		// y coordinates
		int y[] = {Y, Y, Y+a, Y+a+d, Y+ 2*a+d, Y+ 2*a+d, Y+a+d, Y+a};
        //int y[] = {Y-10, Y-10, Y+19, Y+63, Y+92, Y+92, Y+63, Y+19};

        // set the color of line drawn to blue 
        g2.setColor(getColor());
        // draw the polygon using drawPolygon function 
        if(isFilledOrNot()) {
        	g2.fillPolygon(x, y, 8);
        } else {
        	g2.drawPolygon(x, y, 8);
        }
	}
	/**
	 * a method that reads the value of sideLength
	 * @return sideLength: type double
	 */
	public double getSideLength() {
		return sideLength;
	}
	/**
	 * method that updates the value of radius variable
	 * @param sideLength: initialized
	 */
	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}
	@Override
	/**
	 * returns a rounded double
	 * of the Area of Octagon
	 */
	public double getArea() {
		double area = (2*(1+Math.sqrt(2)))*Math.pow(sideLength, 2);
		return Math.round(area*10)/10.0;
	}
	@Override
	/**
	 * returns a rounded double
	 * of the Perimeter of Octagon
	 */
	public double getPerimeter() {
		double perimeter = (8)*(sideLength);
		return Math.round(perimeter*10)/10.0;
	}
	/**
	 * returns the string representation of the object
	 */
	public String toString() {
		return "the " + getColor() + " Octagon with Area " + getArea()
		+ " and Parameter " + getPerimeter() + (isFilledOrNot()==true?" and it is filled":" and it's not filled");
	}
}
