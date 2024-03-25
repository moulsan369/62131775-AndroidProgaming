package ntu62131775;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public Calculation() {
		setTitle("Calculation App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalcu = new JButton("Calculation");
		btnCalcu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogicCalculation calcuFrame = new LogicCalculation();
				calcuFrame.setVisible(true);
				dispose(); 
			}
		});
		btnCalcu.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnCalcu.setBounds(139, 21, 89, 23);
		contentPane.add(btnCalcu);
		
		JButton btnBmi = new JButton("BMI");
		btnBmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bmi bmiFrame = new Bmi();
		        bmiFrame.setVisible(true);
		        dispose(); 
			}
		});
		btnBmi.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnBmi.setBounds(139, 65, 89, 23);
		contentPane.add(btnBmi);
		
		JButton btnSwitch = new JButton("Switch");
		
		btnSwitch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Swing swingFrame = new Swing();
				 swingFrame.setVisible(true);
				 dispose(); 
			}
		});
		btnSwitch.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnSwitch.setBounds(139, 109, 89, 23);
		contentPane.add(btnSwitch);
	}
}
