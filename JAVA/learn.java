import java.awt.*;
import java.awt.event.*;
/**
 * Slip5
 */

public class learn extends Frame{
    public learn(String title){
        super(title);
        Button button = new Button("click me");
        Label label = new Label("hello friends");
        TextField textfield = new TextField("text"); 
        TextArea textarea= new TextArea("text text text");
         button.setBounds(20,40, 80, 20);
        label.setBounds(20,90,120,20);
        textfield.setBounds(20,120,100,30);
        textarea.setBounds(20,180,300,90);
        button.setBackground(Color.GRAY);
        button.setForeground(Color.RED);
        label.setBackground(Color.LIGHT_GRAY);
        label.setForeground(Color.RED);
        // textarea.addKeyListener(new KeyListener(){
        //     public void keyTyped(keyEvent e) {
                
        //     }
        // } );
            
        add(button);
        add(label);
        add(textfield);
        add(textarea);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
        }
    public static void main(String[] args) {
        new learn("hello my first gui");
    }
   
}