import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    JPanel panel1 = new JPanel(new GridLayout(0,3));
    JPanel panel2 = new JPanel(new GridLayout(0,2));
    JButton []calButtons = new JButton[10];
    JButton btnClear = new JButton("Clear");
    JTextField numText = new JTextField(10);


    int counter = 9;
    String value = "";

    public Calculator(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(600,400));
        setLayout(new FlowLayout());

        numText.setFont(new Font("Verdana" , Font.BOLD , 28));
        numText.setEditable(false);
        panel1.setPreferredSize(new Dimension(300,200));
        panel2.setPreferredSize(new Dimension(300,50));


        add(numText);
        add(panel1);
        add(panel2);

        for (JButton eachbtn : calButtons){
            eachbtn = new JButton("" + counter);
            eachbtn.setName("button"+counter);

            if(counter > 0) {
                panel1.add(eachbtn);
            }
            else {
                panel2.add(eachbtn);

            }
            --counter;
            eachbtn.addActionListener(this);

        }


        add(btnClear);
        btnClear.addActionListener(this);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnClear){
            numText.setText("0");
            value="";
        }else{
            value+=e.getActionCommand();
            numText.setText(value);
        }
    }
}
