import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckRadioForm extends JFrame implements ActionListener {

    JLabel info = new JLabel("Select one or more hobbies from the boxes given below");
    JLabel info1 = new JLabel("Select the color below");

    JCheckBox gymCheck = new JCheckBox("Gym");
    JCheckBox footballCheck = new JCheckBox("Football");
    JCheckBox netflixCheck = new JCheckBox("Netflix");

    JLabel labelHobies = new JLabel();
    JButton btnSubmit = new JButton("Submit");
    String hobbies = "";

    JRadioButton redButton = new JRadioButton("Red");
    JRadioButton blueButton = new JRadioButton("Blue");
    JRadioButton greenButton = new JRadioButton("Green");

    ButtonGroup colorGroup = new ButtonGroup();


    public CheckRadioForm(){
        setTitle("Check and Radio");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        colorGroup.add(redButton);
        colorGroup.add(blueButton);
        colorGroup.add(greenButton);

        add(info);
        add(gymCheck);
        add(footballCheck);
        add(netflixCheck);

        add(info1);
        add(redButton);
        add(blueButton);
        add(greenButton);
        add(btnSubmit);
        add(labelHobies);

        btnSubmit.addActionListener(this);






    }

    @Override
    public void actionPerformed(ActionEvent e) {

        hobbies = " ";

        if (gymCheck.isSelected())
            hobbies+="Gym ";

        if(footballCheck.isSelected())
            hobbies+="Football ";

        if(netflixCheck.isSelected())
            hobbies+="Netflix ";



        if(redButton.isSelected())
            getContentPane().setBackground(Color.red);

        else if(blueButton.isSelected())
            getContentPane().setBackground(Color.blue);

        else if(greenButton.isSelected())
            getContentPane().setBackground(Color.green);


        labelHobies.setText(hobbies + " ");
        labelHobies.setFont(new Font("Verdana" , Font.BOLD , 15));
        labelHobies.setForeground(Color.white);

    }
}
