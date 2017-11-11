import java.math.*;
import javax.swing.JFrame;
import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;

public class BasicSwing extends JFrame {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setSize(2000, 1250);
		window.setVisible(true);
		window.setResizable(true); 
		window.setTitle("This is a learning JFrame Program");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DrawingComponent DC = new DrawingComponent();
		window.add(DC);
		
	}

}
