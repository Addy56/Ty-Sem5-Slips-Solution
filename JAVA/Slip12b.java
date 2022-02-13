import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Slip12b extends JFrame {

    // frame
    static JFrame f;
    static JList<String> list;
    static JButton button;
    static JTextField text;
    static JLabel lable;

    // main class
    public static void main(String[] args) {
        // create a new frame
        f = new JFrame("frame");

        // create a panel
        JPanel p = new JPanel();
        // creating lable
        lable = new JLabel("enter a number to get its multiplcation table");
        // creating a text field
        text = new JTextField(16);
        // String array to store weekdays

        // creating button to display
        button = new JButton("TABLE");
        String week[] = new String[10];
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 1; i <= 10; i++) {
                    int t = Integer.parseInt(text.getText());
                    week[i - 1] = t + "*" + i + "=" + (t * i);
                }
                // create list
                list = new JList<String>(week);
                p.add(list);
                list.revalidate();
            }
            
        });
        // add list to panel
        p.add(lable);
        p.add(text);
        p.add(button);
        f.add(p);
        // set the size of frame
        f.setSize(400, 400);

        f.setVisible(true);
    }

}
