import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip10b extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel p = new JPanel();
        JLabel label = new JLabel("Compound Interest Calculator", JLabel.LEFT);
        JLabel l1 = new JLabel("Principal Amount", JLabel.CENTER);
        JTextField Pa = new JTextField(15);
        JLabel l2 = new JLabel("Interest Rate(%)");
        JTextField Ir = new JTextField(15);
        JLabel l3 = new JLabel("Time(yrs)");
        JTextField T = new JTextField(15);
        JLabel l4 = new JLabel("Total Amount");
        JTextField Ta = new JTextField(15);
        Ta.setEditable(false);
        JLabel l5 = new JLabel("Interest Amount");
        JTextField Ia = new JTextField(15);
        JButton Calculate = new JButton("Calculate");
        JButton Clear = new JButton("Clear");
        JButton Close = new JButton("Close");
        // adding listners on button click
        Calculate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent a) {
                try {
                    double P = Double.parseDouble(Pa.getText());
                    double In = Double.parseDouble(Ir.getText());
                    int Time = Integer.parseInt(T.getText());
                    double Tam = P * Math.pow((1 + (In / 100)), Time);
                    Ta.setText(String.format("%2f", Tam));

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Please enter number format values in text box");
                }

            }

        });
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                Pa.setText("");
                Ir.setText("");
                T.setText("");
                Ta.setText("");
                Ia.setText("");
            }
        });
        Close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        // addding all components
        p.add(label);
        frame.add(p);
        frame.add(l1);
        frame.add(Pa);
        frame.add(l2);
        frame.add(Ir);
        frame.add(l3);
        frame.add(T);
        frame.add(l4);
        frame.add(Ta);
        frame.add(l5);
        frame.add(Ia);
        frame.add(Calculate);
        frame.add(Clear);
        frame.add(Close);
        frame.setLayout(new FlowLayout(2, 6, EXIT_ON_CLOSE));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
