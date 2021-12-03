import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame implements ActionListener {

    JButton button = new JButton("Click me");
    public Form(){
        setLayout(new FlowLayout());
        setSize(500 , 500);
        setTitle("Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(button);

        button.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {
        System.out.println("Hellow World");
    }
}
