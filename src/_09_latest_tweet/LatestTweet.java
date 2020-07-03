package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LatestTweet implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton rightbutton = new JButton();
	JTextField textfield = new JTextField();
	
public void run() {
	frame.setVisible(true);
	frame.add(panel);
	rightbutton.setText("Search The Twitterverse");
	rightbutton.addActionListener(this);
	panel.add(rightbutton);
	panel.add(textfield);
	frame.pack();
}
	
	
	
	
	
public static void main(String[] args) {
	new LatestTweet().run();

	
	
}





@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
