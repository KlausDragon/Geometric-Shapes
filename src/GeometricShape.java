import java.awt.Color;
import java.awt.Graphics2D;

/**
 * @author aabbasimoghadd00
 * Creating our parent GeometricShape abstract class so that subclasses would be able to inherit the methods and attributes
 */
	public abstract class GeometricShape implements Comparable<GeometricShape>{
		private Color color;
		private boolean filledOrNot;
		protected int X,Y;
		public GeometricShape(Color color, boolean filledOrNot, int X, int Y) {
			this.color = color;
			this.setFilledOrNot(filledOrNot);
			this.X = X;
			this.Y = Y;
		}
	
	/*
	 * GeometricShape default constructor
	 */	
	public GeometricShape() {
		this(Color.WHITE, false, 0, 0);
	}
	
	/**
	 * a method that reads the value of X property
	 * @return X: type int
	 */
	public int getX() {
		return X;
	}
		
	public void setX(int x) {
		X = x;
	}
		
	/**
	 * a method that reads the value of Y property
	 * @return Y: type int
	 */
	public int getY() {
		return Y;
	}
	
	public void setY(int y) {
		Y = y;
	}
	
	/**
	 * a method that reads color
	 * @return color: type Color
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * method that updates the color variable
	 * @param color: initialized
	 */
	public void setColor(Color color) {
		this.color = color;
	}
		
	public boolean isFilledOrNot() {
		return filledOrNot;
	}
		
	public void setFilledOrNot(boolean filledOrNot) {
		this.filledOrNot = filledOrNot;
	}
		
	/**
	 * @return 0: if Integer is equal to the argument Integer,
	 * -1: if Integer is less than the argument Integer and
	 * 1: if Integer is greater than the argument Integer
	 */
	public int compareTo(GeometricShape g) {
		if(this.getArea() == g.getArea())
			return 0;
		else if(this.getArea() < g.getArea())
			return 1;
		else
			return -1;
	}
		
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract void draw(Graphics2D g);
		
	/**
	 * this method accepts two GeometricShapes as parameters and returns the larger of the two objects
	 * @param a1: first GeometricShape
	 * @param a2: second GeometricShape
	 * @return the larger of two shapes
	 */
	public static GeometricShape max(GeometricShape a1, GeometricShape a2) {
		int dif = Double.compare(a1.getArea(), a2.getArea());
		if(dif < 0)
			return a2;
		else
			return a1;
	}
		
	/**
	 * a static method for finding the total sum of the areas of a collection of GeometricShapes
	 * @param shapes: our array
	 * @return the rounded sum of type double
	 */
	public static double sumArea(GeometricShape[] shapes) {
		double sum = 0;
		for(int i = 0; i<shapes.length; i++) {
			sum += shapes[i].getArea();
		}
		return Math.round(sum*10)/10.0;
	}
}
