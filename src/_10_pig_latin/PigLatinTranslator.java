package _10_pig_latin;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JTextField lefttextfield = new JTextField();
JTextField righttextfield = new JTextField();




public void run() {
	frame.setVisible(true);
	frame.add(panel);
	button.setText("translate");
	panel.add(button);
	panel.add(lefttextfield);
	panel.add(righttextfield);
	frame.pack();

}
}