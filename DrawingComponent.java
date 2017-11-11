import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;

import javax.swing.JComponent;
import java.awt.*;

public class DrawingComponent extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.fill(new Rectangle2D.Double(0, 0, 2000, 1250));
		int counter = 3;
		int iterations;
		int movingNumber;
		int redIndex = 175;
		int greenIndex = 255;
		int blueIndex = 85;
		while (counter < 8000000) {
			iterations = 0;
			movingNumber = counter;
			while (movingNumber >= counter) {
				if (movingNumber % 2 == 1) {
					movingNumber = movingNumber * 3 + 1;
				}else {
					movingNumber /= 2;
				}
				iterations += 1;
			}
			redIndex = counter % 255;
			greenIndex = iterations % 255;
			blueIndex = (counter * iterations) % 255;
			g2.setColor(new Color(redIndex, greenIndex, blueIndex));
			g2.fill (new Ellipse2D.Double(counter/1000, iterations * 5, 2, 2));
			counter += 1;
		}
	}

}
