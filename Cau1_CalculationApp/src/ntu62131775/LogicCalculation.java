package ntu62131775;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogicCalculation extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtKq;

    public LogicCalculation() {
        setTitle("Máy Tính");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnHomeCal = new JButton("Trang chủ");
        btnHomeCal.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        btnHomeCal.setBounds(335, 227, 89, 23);
        contentPane.add(btnHomeCal);

        JLabel lblA = new JLabel("Number A");
        lblA.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblA.setBounds(38, 11, 66, 23);
        contentPane.add(lblA);

        JLabel lblB = new JLabel("Number B");
        lblB.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblB.setBounds(38, 45, 66, 23);
        contentPane.add(lblB);

        txtA = new JTextField();
        txtA.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        txtA.setBounds(111, 12, 86, 20);
        contentPane.add(txtA);
        txtA.setColumns(10);

        txtB = new JTextField();
        txtB.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        txtB.setColumns(10);
        txtB.setBounds(111, 46, 86, 20);
        contentPane.add(txtB);

        JLabel lblKq = new JLabel("Kết Quả");
        lblKq.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        lblKq.setBounds(38, 131, 66, 23);
        contentPane.add(lblKq);

        txtKq = new JTextField();
        txtKq.setEditable(false);
        txtKq.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        txtKq.setColumns(10);
        txtKq.setBounds(111, 132, 86, 20);
        contentPane.add(txtKq);

        JButton btnCong = new JButton("Cộng");
        btnCong.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        btnCong.setBounds(255, 22, 89, 23);
        contentPane.add(btnCong);

        JButton btnTru = new JButton("Trừ");
        btnTru.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        btnTru.setBounds(255, 64, 89, 23);
        contentPane.add(btnTru);

        JButton btnNhan = new JButton("Nhân");
        btnNhan.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        btnNhan.setBounds(255, 107, 89, 23);
        contentPane.add(btnNhan);

        JButton btnChia = new JButton("Chia");
        btnChia.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        btnChia.setBounds(255, 148, 89, 23);
        contentPane.add(btnChia);
        
        JButton btnClear = new JButton("ClearData");
        btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        btnClear.setBounds(10, 205, 89, 23);
        contentPane.add(btnClear);

        
        btnHomeCal.addActionListener(new HomeButtonListener());

        
        btnCong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate("+");
            }
        });

        btnTru.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate("-");
            }
        });

        btnNhan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate("*");
            }
        });

        btnChia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate("/");
            }
        });
        
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearData();
            }
        });
    }

    
    public class HomeButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Calculation mainFrame = new Calculation();
            mainFrame.setVisible(true);
            dispose(); 
        }
    }

  
    private void calculate(String operator) {
        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double result = 0.0;
            switch (operator) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b != 0) {
                        result = a / b;
                    } else {
                        txtKq.setText("Cannot divide by zero");
                        return;
                    }
                    break;
                default:
                    break;
            }
            txtKq.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            txtKq.setText("Invalid input");
        }
    }
    
    private void clearData() {
        txtA.setText("");
        txtB.setText("");
        txtKq.setText("");
    }
}
