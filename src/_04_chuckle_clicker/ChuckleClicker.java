package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button  = new JButton();
	JButton button2 = new JButton();
	JPanel panel = new JPanel();	
	
	
	public void makeButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.add(button);
		frame.add(button2);
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		button.setText("Joke");
		button2.setText("Punchline");
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
		
	}
	
	
public static void main(String[] args) {
	new ChuckleClicker().makeButton();
	
	

}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
JButton buttonPressed = (JButton) e.getSource();

if(buttonPressed == button) {
	JOptionPane.showMessageDialog(null, "hi");
}




if(buttonPressed == button2) {
	JOptionPane.showMessageDialog(null, "hi");

}


if(e.getSource() == button) {
	JOptionPane.showMessageDialog(null, "Why do we tell actors to break a leg? Becauase every play has a cast.");
} else {
	JOptionPane.showMessageDialog(null, "Why does Waldo wear stripes? Because he doesn't want to be spotted.");
}








}
}
