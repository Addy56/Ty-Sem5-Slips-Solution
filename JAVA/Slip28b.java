import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;

// Write a java Program to accept the details of 5 employees (Eno, Ename, Salary) and 
// display it onto the JTable.
public class Slip28b extends JFrame {
    static JLabel l1;
    static JLabel l2;
    static JLabel l3;
    static JTextField tf1;
    static JTextField tf2;
    static JTextField tf3;
    static JButton button;
    static JTable j;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Employees");
        JPanel p = new JPanel();
        l1 = new JLabel("Enter Employee Number");
        l2 = new JLabel("Enter Employee Name");
        l3 = new JLabel("Enter Employee Salary");

        tf1 = new JTextField(15);
        tf2 = new JTextField(15);
        tf3 = new JTextField(15);

        // String[][] data = {
        // { "Kundan Kumar Jha", "4031", "CSE" },
        // { "Anand Jha", "6014", "IT" }
        // };

        // Column Names
        String[] columnNames = { "Name", "Roll Number", "Department" };
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        j = new JTable(model);
        JScrollPane sp = new JScrollPane(j);

        button = new JButton("submit");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String No = tf1.getText();
                String Name = tf2.getText();
                String Salary = tf3.getText();
                j.setBounds(30, 40, 200, 300);
                model.addRow(new Object[] {
                        No, Name, Salary
                });
                
            }
            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }


            
        });

        p.add(l1);
        p.add(tf1);
        p.add(l2);
        p.add(tf2);
        p.add(l3);
        p.add(tf3);
        p.add(button);
        p.add(sp);
        frame.add(p);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
