package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JFrame frame =  new JFrame();
JPanel panel  = new JPanel();
JButton button  = new JButton();




public void run() {
	frame.setVisible(true);
	frame.add(panel);
	frame.setTitle("Whack a Button for Fame and Glory");
	frame.setSize(200, 200);
	
		Random ran = new Random();
		int number = ran.nextInt(24);
		drawButtons(number);
} 
	
	


public void drawButtons(int number) {
	
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
		WhackAMole mole = new WhackAMole();
		Random ran = new Random();
		int number = ran.nextInt(24);
		mole.drawButtons(number);
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















}