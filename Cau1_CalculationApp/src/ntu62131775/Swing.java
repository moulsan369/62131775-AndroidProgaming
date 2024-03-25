package ntu62131775;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

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

        JButton btnTrangChu = new JButton("Trang chủ");
        btnTrangChu.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        btnTrangChu.setBounds(335, 227, 89, 23);
        contentPane.add(btnTrangChu);

        btnTrangChu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                Calculation mainFrame = new Calculation();
                mainFrame.setVisible(true);
                dispose();
            }
        });

    
        JButton btnConvertToKB = new JButton("Convert to KB");
        btnConvertToKB.setBounds(50, 50, 150, 30);
        contentPane.add(btnConvertToKB);

        JButton btnConvertToMB = new JButton("Convert to MB");
        btnConvertToMB.setBounds(50, 100, 150, 30);
        contentPane.add(btnConvertToMB);

        JButton btnConvertToGB = new JButton("Convert to GB");
        btnConvertToGB.setBounds(50, 150, 150, 30);
        contentPane.add(btnConvertToGB);

       
        btnConvertToKB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                String input = JOptionPane.showInputDialog(contentPane, "Nhập dung lượng (byte):");
                if (input != null && !input.isEmpty()) {
                    try {
                        long bytes = Long.parseLong(input);
                        double kb = bytes / 1024.0;
                        JOptionPane.showMessageDialog(contentPane, bytes + " byte = " + kb + " KB");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(contentPane, "Nhập không hợp lệ!");
                    }
                }
            }
        });

        btnConvertToMB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
         
                String input = JOptionPane.showInputDialog(contentPane, "Nhập dung lượng (byte):");
                if (input != null && !input.isEmpty()) {
                    try {
                        long bytes = Long.parseLong(input);
                        double mb = bytes / (1024.0 * 1024.0);
                        JOptionPane.showMessageDialog(contentPane, bytes + " byte = " + mb + " MB");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(contentPane, "Nhập không hợp lệ!");
                    }
                }
            }
        });

        btnConvertToGB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
                String input = JOptionPane.showInputDialog(contentPane, "Nhập dung lượng (byte):");
                if (input != null && !input.isEmpty()) {
                    try {
                        long bytes = Long.parseLong(input);
                        double gb = bytes / (1024.0 * 1024.0 * 1024.0);
                        JOptionPane.showMessageDialog(contentPane, bytes + " byte = " + gb + " GB");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(contentPane, "Nhập không hợp lệ!");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Swing frame = new Swing();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

