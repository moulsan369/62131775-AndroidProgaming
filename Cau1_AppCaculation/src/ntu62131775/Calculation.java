package ntu62131775;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculation implements ActionListener{

	JFrame frame;
	JTextField textField;
	JButton[] numberButtons = new JButton[10];
	JButton[] funtionButtons = new JButton[8];
	JButton addButton, subButton, mulButton, divButton;
	
	
	Calculation(){
		
	}
	
	public static void main(String[] args) {
		
		Calculation calc = new Calculation();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
