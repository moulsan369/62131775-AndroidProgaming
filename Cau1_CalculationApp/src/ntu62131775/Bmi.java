package ntu62131775;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Bmi extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtWeight;
    private JTextField txtHeight;
    private JTextField txtResult;

    public Bmi() {
        setTitle("BMI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblWeight = new JLabel("Cân năng(kg):");
        lblWeight.setBounds(30, 30, 80, 20);
        lblWeight.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        contentPane.add(lblWeight);

        JLabel lblHeight = new JLabel("Chiều cao(cm):");
        lblHeight.setBounds(30, 70, 80, 20);
        lblHeight.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        contentPane.add(lblHeight);

        txtWeight = new JTextField();
        txtWeight.setBounds(120, 30, 100, 20);
        txtWeight.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        contentPane.add(txtWeight);
        txtWeight.setColumns(10);

        txtHeight = new JTextField();
        txtHeight.setBounds(120, 70, 100, 20);
        txtHeight.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        contentPane.add(txtHeight);
        txtHeight.setColumns(10);

        JButton btnCalculate = new JButton("Tính");
        btnCalculate.setBounds(120, 120, 100, 23);
        btnCalculate.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        contentPane.add(btnCalculate);

        JLabel lblResult = new JLabel("Kết quả:");
        lblResult.setBounds(30, 160, 80, 20);
        lblResult.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        contentPane.add(lblResult);

        txtResult = new JTextField();
        txtResult.setBounds(120, 160, 100, 20);
        txtResult.setEditable(false);
        txtResult.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        contentPane.add(txtResult);
        txtResult.setColumns(10);

        JButton btnClear = new JButton("Clear Data");
        btnClear.setBounds(120, 200, 100, 23);
        btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        contentPane.add(btnClear);

        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateBMI();
            }
        });

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearData();
            }
        });
    }

    private void calculateBMI() {
    try {
        double weight = Double.parseDouble(txtWeight.getText());
        double height = Double.parseDouble(txtHeight.getText());

        
        double bmi = weight / (height * height);

        String bmiCategory;
       
        if (bmi < 18.5) {
            bmiCategory = "Thiếu cân";
        } else if (bmi < 25) {
            bmiCategory = "bình thường";
        } else if (bmi < 30) {
            bmiCategory = "Thừa cân";
        } else {
            bmiCategory = "Chịu";
        }

        
        txtResult.setText(String.format("BMI: %.2f - Category: %s", bmi, bmiCategory));
    } catch (NumberFormatException ex) {
        txtResult.setText("Invalid input");
    }

   }

    private void clearData() {
        txtWeight.setText("");
        txtHeight.setText("");
        txtResult.setText("");
    }

}
