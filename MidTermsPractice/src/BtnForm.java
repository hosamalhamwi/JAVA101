import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnForm extends JFrame implements ActionListener {

    JButton btnRed = new JButton("Red");
    JButton btnBlue = new JButton("Blue");
    JButton btnGreen = new JButton("Green");

    public BtnForm(String title){
        setLayout(new FlowLayout());
        setTitle(title);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(btnRed) ; add(btnBlue) ; add(btnGreen);

        JButton []btnArray = new JButton[] {btnRed , btnBlue , btnGreen};

        for(JButton eachButton : btnArray){
            eachButton.setFont(new Font("Verdana" , Font.BOLD , 12));
            eachButton.setForeground(Color.white);
            eachButton.setPreferredSize(new Dimension(150 , 50));
            eachButton.addActionListener(this);
        }

        btnRed.setBackground(Color.red);
        btnBlue.setBackground(Color.blue);
        btnGreen.setBackground(Color.green);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnRed){
            getContentPane().setBackground(Color.red);
        }
        else if(e.getSource() == btnBlue){
            getContentPane().setBackground(Color.blue);
        }
        else if(e.getSource() == btnGreen){
            getContentPane().setBackground(Color.green);
        }
    }
}
