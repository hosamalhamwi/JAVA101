package layoutex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    JPanel panel1 = new JPanel (new GridLayout (0,3));
    JPanel panel2 = new JPanel (new GridLayout (0,2));
    JButton [] myButtons = new JButton[10];
    JButton btnClear = new JButton("Clear");
    JTextField numText = new JTextField(10);

    int counter =9;
    String value="";

    Calculator (){

        setLocationRelativeTo(null);
        setMinimumSize(new Dimension (600,400));
        setTitle ("Calculator Exercise");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLayout (new FlowLayout());

        numText.setFont(new Font("Verdana", Font.BOLD, 28));
        numText.setEditable(false);
        panel1.setPreferredSize(new Dimension (300,200));
        panel2.setPreferredSize(new Dimension (300,50));
        //panel1.setBorder(BorderFactory.createLineBorder(Color.RED));

        add(numText);
        add(panel1);
        add(panel2);

        for (JButton b : myButtons){

            b = new JButton(""+counter);
            b.setName("button"+counter);
            if (counter>0)
                panel1.add(b);
            else
                panel2.add(b);
            --counter;

            b.addActionListener(this);

        }

        panel2.add(btnClear);
        btnClear.addActionListener(this);

    }

    public static void main(String[] args) {

        Calculator myCalc = new Calculator();
        myCalc.setVisible(true);
    }



    public void actionPerformed(ActionEvent action) {



        if (action.getSource() == btnClear){
            numText.setText("0");
            value = "";
        }
        else{
            value += action.getActionCommand();
            numText.setText(value);

        }
    }

}