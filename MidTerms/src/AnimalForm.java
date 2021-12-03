import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimalForm extends JFrame implements ActionListener {

    ImageIcon kali1 = new ImageIcon("src//images//kali1.png");
    ImageIcon kali2 = new ImageIcon("src//images//kali2.jpg");
    ImageIcon kali3 = new ImageIcon("src//images//kali3.jpeg");

    JButton btn1 = new JButton(kali1);
    JButton btn2 = new JButton(kali2);
    JButton btn3 = new JButton(kali3);

    JLabel animalLabel = new JLabel("This is the animal label");


    public AnimalForm(String title){
        setTitle(title);
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(btn1); add(btn2) ; add(btn3); add(animalLabel);
        animalLabel.setFont(new Font("Verdana" , Font.BOLD , 12));

        JButton []btnArray = new JButton[] {btn1 , btn2 , btn3};
        for (JButton eachBtn : btnArray){
            eachBtn.setPreferredSize(new Dimension(100,150));
            eachBtn.addActionListener(this);
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1){
            animalLabel.setText("You pressed the button 1");
        }
        else if(e.getSource() == btn2){
            animalLabel.setText("You pressed the button 2");
        }
        else if(e.getSource() == btn3){
            animalLabel.setText("You pressed the button 3");
        }
    }
}
