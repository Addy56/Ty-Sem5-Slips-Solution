
// A) Write a java program to display Label with text “Dr. D Y Patil College”, 
// background color Red and font size 20 on the frame.
import java.awt.*;

class Slip7 extends Frame {
    Slip7() {
        Label l = new Label("Dr. D Y Patil College");
        Font f = new Font("Georgia", Font.BOLD, 20);
        l.setFont(f);
        setForeground(Color.blue);
        setBackground(Color.red);
        add(l);
        setLayout(new FlowLayout());
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String arg[]) {
        new Slip7();
    }
}