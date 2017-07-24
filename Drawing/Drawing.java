import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Drawing extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.drawLine(10, 25, 200, 45);
		
		g.setColor(Color.CYAN);
		g.drawRect(10, 55, 200, 30);
		
		g.setColor(Color.GREEN);
		g.fillOval(10, 95, 200, 30);
		
		g.setColor(Color.MAGENTA);
		g.fill3DRect(10, 135, 200, 50, true);
	}
}

