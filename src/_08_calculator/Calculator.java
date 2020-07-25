package _08_calculator;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JTextField lefttextfield = new JTextField(20);
	JTextField righttextfield = new JTextField(20);
	
public int add(int number1, int number2) {
	return (number1 + number2);
}

public int sub(int number1, int number2) {
	return (number1 - number2);
}
	
public int mul(int number1, int number2) {
	return (number1 * number2);

}

public int div(int number1, int number2) {
	return (number1 / number2);

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
	panel.add(label);
	frame.pack();
	add.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	add.setText("add");
	sub.setText("sub");
	mul.setText("mul");
	div.setText("div");
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int number1 = Integer.parseInt(lefttextfield.getText());
	int number2 = Integer.parseInt(righttextfield.getText());
	
	JButton buttonclicked = (JButton) e.getSource();
	if(add == buttonclicked) {
		int a= new Calculator().add(number1, number2);
		label.setText(a + "");
	}
	

	else if(sub == buttonclicked) {
		int s= new Calculator().sub(number1, number2);
		label.setText(s + "");
	}
	
	else if(mul == buttonclicked) {
		int m= new Calculator().mul(number1, number2);
		label.setText(m + "");
	}
	
	else if(div == buttonclicked) {
		int d= new Calculator().div(number1, number2);
		label.setText(d + "");
	}
}









}
