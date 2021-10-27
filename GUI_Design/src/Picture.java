import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Picture extends JFrame implements ActionListener {

//    File kali1 = new File("Images//kali.png");
//    File kali2 = new File("Images//kali2.png");
//    File kali3 = new File("Images//kali3.jpg");
//
    ImageIcon kali1 = new ImageIcon("Images//kali.png");
    ImageIcon kali2 = new ImageIcon("Images//kali2.png");
    ImageIcon kali3 = new ImageIcon("Images//kali3.jpg");

    JButton kaliBtn = new JButton(kali1);
    JButton kali2Btn = new JButton(kali2);
    JButton kali3Btn = new JButton(kali3);

    JLabel label = new JLabel("This is the picture label");



    public Picture(String title){

        setTitle(title);
        setSize(600,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(kaliBtn);
        add(kali2Btn);
        add(kali3Btn);

        add(label);

        JButton []btnArray = new JButton[] {kaliBtn , kali2Btn  , kali3Btn};

        for(JButton eachbtn : btnArray){

            eachbtn.setPreferredSize(new Dimension(100,100));
        }

//        if(kali1.exists())
//            System.out.println(12);
//        if(kali2.exists())
//            System.out.println(123);
//        if(kali3.exists())
//            System.out.println(123123);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == kaliBtn)
            label.setText("Kali 1");

        else if(e.getSource() == kali2Btn)
            label.setText("Kali 2");

        else if(e.getSource() == kali3Btn)
            label.setText("Kali 3");


    }
}
