
// Create an Applet that displays the x and y position of the cursor movement 
// using Mouse and Keyboard. (Use appropriate listener)
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Slip19b extends Applet implements KeyListener, MouseListener {
    String msg = "applet";
    int X = 10, Y = 20;
    String clickDesc;
    int x, y;

    public void init() {
        addKeyListener(this);
        addMouseListener(this);
        requestFocus();
    }

    public void keyPressed(KeyEvent ke) {
        showStatus("Key Down");
    }

    public void keyReleased(KeyEvent ke) {
        showStatus("Key Up");
    }

    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, X, Y);
        g.drawString("Mouse was " + clickDesc + "-clicked at location (" + x + ", " + y + ")", x, y);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2)
            clickDesc = "double";
        else
            clickDesc = "single";

        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
