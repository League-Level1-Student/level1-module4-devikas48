package _11_whack_a_mole;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
JFrame frame =  new JFrame();
JPanel panel  = new JPanel();
JButton button  = new JButton();




public void run() {
	frame.setVisible(true);
	frame.add(panel);
	frame.setTitle("Whack a Button for Fame and Glory");
	frame.setSize(200, 200);
	
	for (int i = 0; i < 24; i++) {
		JButton button = new JButton();
		panel.add(button);	
}
	
	
}

public void drawButtons() {
	Random ran = new Random();
	
}



}