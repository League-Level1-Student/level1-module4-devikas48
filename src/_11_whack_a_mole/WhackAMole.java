package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JFrame frame =  new JFrame();
JPanel panel  = new JPanel();
JButton button  = new JButton();
int moleCount = 0;
int missCount = 0;
Date date;


public void run() {
	date = new Date();
	
	
		Random ran = new Random();
		int number = ran.nextInt(24);
		drawButtons(number);
} 
	
	


public void drawButtons(int number) {
	frame.setVisible(true);
	frame.add(panel);
	frame.setTitle("Whack a Button for Fame and Glory");
	frame.setSize(200, 200);
	
	for (int i = 0; i < 24; i++) {
		
		JButton button = new JButton();
		panel.add(button);
		button.addActionListener(this);
		if(i == number) {
			button.setText("mole");
			
		}
}


}




@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(!buttonPressed.getText().equals("mole")) {
		speak("You did not press the button");
		frame.dispose();
		Random ran = new Random();
		int number = ran.nextInt(24);
		drawButtons(number);
		missCount++;
		System.out.println(missCount);
	} else {
		moleCount++;
	} if (moleCount == 10) {
		endGame(date, 10);
		System.exit(0);
	} if (missCount == 1) {
		JOptionPane.showMessageDialog(null,"You missed");
	} if (missCount == 2) {
		JOptionPane.showMessageDialog(null, "The mole was not pressed :(");
	} if (missCount == 3) {
		JOptionPane.showMessageDialog(null, "Try again next time");
	} if (missCount == 4) {
		JOptionPane.showMessageDialog(null, "Bad luck this time");
	} if (missCount >= 5) {
		endGame(date, moleCount);
		System.exit(0);
	} 
		
	
	
}


static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}

private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}















}