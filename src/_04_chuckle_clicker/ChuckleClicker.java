package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {
	JButton button  = new JButton("Joke");
	JButton button2 = new JButton("Punchline");
	JPanel panel = new JPanel();
	ChuckleClicker chuckleclicker = new ChuckleClicker();
	
	
	
	public void makeButton() {
		JOptionPane.showMessageDialog(null, "Make Buttons");
		JFrame frame = new JFrame();
		frame.add(button);
		frame.add(button2);
		frame.add(panel);
	
	}
	
	
public static void main(String[] args) {
	new ChuckleClicker().makeButton();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
