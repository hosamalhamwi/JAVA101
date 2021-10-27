import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame implements ActionListener {


    JButton btnRed = new JButton("Red");
    JButton btnGreen = new JButton("Green");
    JButton btnBlue = new JButton("Blue");


    public Form(String title){

        setTitle(title);
        setSize(600,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(btnRed);
        add(btnGreen);
        add(btnBlue);

        JButton []mybutton = new JButton[] {btnRed , btnBlue , btnGreen};

        for(JButton eachButton : mybutton){
            eachButton.setPreferredSize(new Dimension(150,50));
            eachButton.setForeground(Color.white);
            eachButton.setFont(new Font("verdana" , Font.BOLD , 15));

            eachButton.addActionListener(this);
        }

        btnRed.setBackground(Color.red);
        btnBlue.setBackground(Color.blue);
        btnGreen.setBackground(Color.green);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnRed)
            getContentPane().setBackground(Color.RED);
        else if(e.getSource() == btnBlue)
            getContentPane().setBackground(Color.BLUE);
        else if (e.getSource() == btnGreen)
            getContentPane().setBackground(Color.GREEN);

    }
}
