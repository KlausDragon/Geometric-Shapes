import javax.swing.*;
/**
 * 
 * @author aabbasimoghadd00
 * window that has decorations such as a 
 * border, a title, and supports button components that close or iconify the window
 */
public class TheFrame {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600,450);
		frame.setTitle("My Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new OptionPanel());
		frame.setVisible(true);
	}
}