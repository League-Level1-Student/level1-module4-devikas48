package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	private char currentLetter;
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	

	
public void run() {
	JFrame frame  = new JFrame();
	frame.setVisible(true);
	frame.setTitle("Type or Die");
	currentLetter = generateRandomLetter();
	label.setText("" + currentLetter);
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.addKeyListener(this);
}
	
	

public static void main(String[] args) {
	new TypingTutor().run();
}


@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void keyPressed(KeyEvent e) {
	char keyTyped = e.getKeyChar();
	// TODO Auto-generated method stub
	System.out.println(keyTyped);
	if(keyTyped == currentLetter) { 
		System.out.println("correct");
		panel.setBackground(Color.green);
	} else {
		System.out.println("incorrect");
		panel.setBackground(Color.red);
	}
		
}
}
