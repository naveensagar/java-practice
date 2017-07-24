import javax.swing.*;

class apples{
	public static void main(String args[]){
		JFrame f = new JFrame("graphics");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Layout l = new Layout();
		f.add(l);
		f.setSize(200, 200);
		f.setVisible(true);
		
	}
}
