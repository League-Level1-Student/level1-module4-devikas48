package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JLabel label2 = new JLabel();
JLabel label3 = new JLabel();
JButton button = new JButton();

public void run() {
	panel.add(button);
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
	label2 = createLabelImage("lime.png");
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
	label3 = createLabelImage("orange.jpg");
	} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
		e.printStackTrace();

	} 
	label.setPreferredSize(new Dimension (300, 300));
	label2.setPreferredSize(new Dimension (300, 300));
	label3.setPreferredSize(new Dimension (300, 300));
	panel.add(label);
	panel.add(label2);
	panel.add(label3);
	frame.add(panel);
	frame.pack();
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	Random ran  = new Random();
	int number1 = ran.nextInt(3);
	int number2 = ran.nextInt(3);
	int number3 = ran.nextInt(3);
	
	panel.removeAll();
	
	if(number1 == 0) {
		try {
			label = createLabelImage("cherry.jpg");
			} catch (MalformedURLException d) {
				// TODO Auto-generated catch block
				d.printStackTrace();
			}
	}
	
	if(number1 == 1) {
		try {
			label = createLabelImage("lime.png");
			} catch (MalformedURLException d) {
				// TODO Auto-generated catch block
				d.printStackTrace();
			}
	}
	
	if(number1 == 2) {
		try {
			label = createLabelImage("orange.jpg");
			} catch (MalformedURLException d) {
			// TODO Auto-generated catch block
				d.printStackTrace();
			}
	}
	
	if(number2 == 0) {
		try {
			label2 = createLabelImage("cherry.jpg");
			} catch (MalformedURLException d) {
				// TODO Auto-generated catch block
				d.printStackTrace();
			}
	}
	
	if(number2 == 1) {
		try {
			label2 = createLabelImage("lime.png");
			} catch (MalformedURLException d) {
				// TODO Auto-generated catch block
				d.printStackTrace();
			}
	}
	
	if(number2 == 2) {
		try {
			label2 = createLabelImage("orange.jpg");
			} catch (MalformedURLException d) {
			// TODO Auto-generated catch block
				d.printStackTrace();
			}
	}
	
	if(number3 == 0) {
		try {
			label3 = createLabelImage("cherry.jpg");
			} catch (MalformedURLException d) {
				// TODO Auto-generated catch block
				d.printStackTrace();
			}
	}
	
	if(number3 == 1) {
		try {
			label3 = createLabelImage("lime.png");
			} catch (MalformedURLException d) {
				// TODO Auto-generated catch block
				d.printStackTrace();
			}
	}
	
	if(number3 == 2) {
		try {
			label3 = createLabelImage("orange.jpg");
			} catch (MalformedURLException d) {
			// TODO Auto-generated catch block
				d.printStackTrace();
			}
	}
	
	
	
	label.setPreferredSize(new Dimension (300, 300));
	label2.setPreferredSize(new Dimension (300, 300));
	label3.setPreferredSize(new Dimension (300, 300));
	panel.add(label);
	panel.add(label2);
	panel.add(label3); 
	panel.add(button);
	frame.pack();
	
	if( number1 == number2 && number2 == number3) {
		JOptionPane.showMessageDialog(null, "YOU WIN!");
	}
	
	
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