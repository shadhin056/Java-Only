package Applet;
import java.awt.Graphics;
import javax.swing.JApplet;

public class basic extends JApplet {
		public void paint (Graphics g)
		{
			super.paint(g);
			g.drawString("wow it's work", 25, 26);
		}
}
