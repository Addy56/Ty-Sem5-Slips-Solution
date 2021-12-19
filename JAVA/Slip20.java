// A) Write a java program using AWT to create a Frame with title “TYBBACA”, 
// background color RED. If user clicks on close button then frame should close.
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


    
public class Slip20 extends Frame{

    Slip20(){
        
        super("TYBBACA");

        setBackground(Color.RED);

        addWindowListener(new WindowAdapter(){
           @Override
           public void windowClosing(WindowEvent e){
               dispose();
           }
       });
       setSize(300,400);
       setVisible(true);
    }
        public static void main(String[] args) {
        new Slip20();
    }
}
