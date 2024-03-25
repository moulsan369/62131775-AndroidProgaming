package ntu62131775;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class Swing extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public Swing() {
        setTitle("Chuyển đổi số đo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("Trang chủ");
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        btnNewButton.setBounds(335, 227, 89, 23);
        contentPane.add(btnNewButton);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calculation mainFrame = new Calculation();
                mainFrame.setVisible(true);
                dispose(); 
            }
        });
    }
}
