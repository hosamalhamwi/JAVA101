import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GIU2 extends JFrame implements ActionListener {

    JLabel info1 = new JLabel("Please select the Country :");
    JButton btnSubmit = new JButton("Submit");
    JButton btnClear = new JButton("Clear");
    String [] country = {"Turkey" , "Cyprus" , "Nigerian" , "Jordan" , "Lebanon"};

    JComboBox countryCombo = new JComboBox(country);

    JLabel labelResult = new JLabel();

    JMenuBar myMenuBar = new JMenuBar();
    JMenu menuBar = new JMenu("Form Options");
    JMenu menuBar2 = new JMenu("Form close");
    JMenu menuBar3 = new JMenu("Form Clear");
    JMenu newForm = new JMenu("Form");
    JMenuItem closeForm = new JMenuItem("Close");
    JMenuItem closeForm1 = new JMenuItem("Close");






    public GIU2(){

        setMinimumSize(new Dimension(400 , 400));
        setMaximumSize(new Dimension(800 , 800));
        setLayout(new FlowLayout());
        setTitle("GUI Components");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        info1.setFont(new Font("Verdana" , Font.BOLD , 20));
        labelResult.setFont(new Font("Verdana" , Font.BOLD , 20));
        labelResult.setForeground(Color.blue);

        myMenuBar.add(menuBar);
        menuBar.add(newForm);
        myMenuBar.add(menuBar2);
        myMenuBar.add(menuBar3);
        newForm.add(closeForm);
        newForm.add(closeForm1);
        menuBar.add(closeForm);
        add(myMenuBar);
        setJMenuBar(myMenuBar);



        add(info1);
        add(countryCombo);
        add(btnSubmit);
        add(btnClear);
        add(labelResult);


        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);
        menuBar2.addActionListener(this);



    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnSubmit){
            labelResult.setText("Selected item is " + countryCombo.getSelectedItem().toString());
        }
        else if(e.getSource() == btnClear){
            labelResult.setText("");
            countryCombo.setSelectedIndex(-1);
        }
        else if(e.getSource() == menuBar2){
            System.exit(0);
        }



    }
}
