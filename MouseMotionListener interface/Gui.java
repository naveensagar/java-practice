import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame{
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public Gui(){
		super("title");
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		
		HandlerClass handler = new HandlerClass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
		
	}
	
	private class HandlerClass implements MouseListener, MouseMotionListener {
		public void mouseClicked(MouseEvent event){
			statusbar.setText(String.format("you have clicked at %d, %d", event.getX(), event.getY()));
		}
		public void mousePressed(MouseEvent event){
			statusbar.setText("you have presses down the mouse");
		}
		public void mouseReleased(MouseEvent event){
			statusbar.setText("you have released the mouse");
		}
		public void mouseEntered(MouseEvent event){
			statusbar.setText("you entered the erea");
			mousepanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event){
			statusbar.setText("you have exited the window");
			mousepanel.setBackground(Color.WHITE);
		}
		// these are mouse motion listener
		
		public void mouseDragged(MouseEvent event){
			statusbar.setText("you are dragging the mouse");
		}
		public void mouseMoved(MouseEvent event){
			statusbar.setText("you moved the mouse");
		}
		
	}
}

