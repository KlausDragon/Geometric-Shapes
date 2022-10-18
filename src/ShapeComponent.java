import javax.swing.JComponent;
import java.awt.*;
/**
 * @author aabbasimoghadd00
 */
public class ShapeComponent extends JComponent  {
	
	private GeometricShape geo;
	public ShapeComponent(GeometricShape geo) {
		this.geo = geo;
		this.setPreferredSize(new Dimension(150,150));
	}
	
	public ShapeComponent() {
		this(new Arrow(25,true,Color.WHITE,25,25));
	}
	
	public void setG(GeometricShape geo) {
		this.geo = geo;
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		geo.draw(g2);
	}
}
