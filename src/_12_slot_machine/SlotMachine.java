package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JLabel label2 = new JLabel();
JLabel label3 = new JLabel();
JButton button = new JButton();

public void run() {
	frame.add(panel);
	button.setText("SPIN");
	frame.setVisible(true);
	button.addActionListener(this);
	
	try {
	label = createLabelImage("cherry.jpg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
	label2 = createLabelImage("lime.jpeg");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
	label3 = createLabelImage("orange.png");
	} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
		e.printStackTrace();

	}  
	panel.add(label);
	panel.add(label2);
	panel.add(label3);
	frame.pack();
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	
}


private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
}