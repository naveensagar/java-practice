import javax.swing.*;
import java.awt.*;

public class apples{
	public static void main(String args[]){
		JFrame f = new JFrame("graphics");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Drawing l = new Drawing();
		f.add(l);
		f.setSize(500, 300);
		f.setVisible(true);
	}
}
