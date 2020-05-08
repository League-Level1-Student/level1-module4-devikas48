package _01_nasty_surprise;

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

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton leftbutton = new JButton();
	JButton rightbutton = new JButton();
	
	
public void run() {
	
	frame.add(panel);
	frame.setVisible(true);
	leftbutton.setText("Trick");
	leftbutton.addActionListener(this);
    rightbutton.setText("Treat");	
    rightbutton.addActionListener(this);
	panel.add(leftbutton);
	panel.add(rightbutton);
	frame.pack();
	
}


private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent arg0) {
	
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) arg0.getSource();
	if(leftbutton == buttonPressed) {
		showPictureFromTheInternet("https://lh3.googleusercontent.com/proxy/MsSV8SUCVr8TA0ZmLLHyp-F3q6-uAzi"
				+ "72wjmm8E27fSdQ3F03jjJdHnhmSUJjBwclL6DY2E_EqUlvnDt2H8FYpCZ");
	} else {
		showPictureFromTheInternet("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/dog-puppy"
				+ "-on-garden-royalty-free-image-1586966191.jpg");
	}
	
	

}
}
