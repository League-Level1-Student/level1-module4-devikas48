package _08_calculator;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JTextField lefttextfield = new JTextField(20);
	JTextField righttextfield = new JTextField(20);
	
public int add(int number1, int number2) {
	return (number1 + number2);
}

public void sub(int number1, int number2) {
}
	
public void mul(int number1, int number2) {
}

public void div(int number1, int number2) {
}


public void run() {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(lefttextfield);
	panel.add(righttextfield);
	panel.add(add);
	panel.add(sub);
	panel.add(mul);
	panel.add(div);
	frame.pack();
	add.setText("add");
	sub.setText("sub");
	mul.setText("mul");
	div.setText("div");

}









}
