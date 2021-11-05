import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {


    JCheckBox OOPBox = new JCheckBox("Object Oriented Programming");
    JCheckBox VisBox = new JCheckBox("Visual Programming");
    JCheckBox MobBox = new JCheckBox("Kotlin Mobile");

    JRadioButton redColor = new JRadioButton("Red");
    JRadioButton blueColor = new JRadioButton("Blue");
    JRadioButton greenColor = new JRadioButton("Green");

    ButtonGroup colorGroup = new ButtonGroup();
    JLabel courseList = new JLabel();
    JButton btnSubmit = new JButton("Submit");

    JTextArea courseArea = new JTextArea(5,30);

    public GUI(){

        setMinimumSize(new Dimension(400 , 400));
        setMaximumSize(new Dimension(800 , 800));
        setLayout(new FlowLayout());
        setTitle("GUI Components");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        colorGroup.add(redColor);
        colorGroup.add(blueColor);
        colorGroup.add(greenColor);

        add(new JLabel("Please select the course you are taking right now :"));
        add(OOPBox);
        add(VisBox);
        add(MobBox);
        add(new JLabel("Please select the Colors you are taking right now :"));
        add(redColor);
        add(blueColor);
        add(greenColor);




        add(new JLabel("The courses you are taking right now :"));
        add(courseList);
        add(btnSubmit);
        btnSubmit.addActionListener(this);
        add(courseArea);

//        OOPBox.addActionListener(this);
//        VisBox.addActionListener(this);
//        MobBox.addActionListener(this);




    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String courses = "";
        if(OOPBox.isSelected()){
            courses+= "\n " +  OOPBox.getActionCommand();
        }
        if(VisBox.isSelected()){
            courses+="\n " +  VisBox.getActionCommand();
        }
        if(MobBox.isSelected()){
            courses+="\n " + MobBox.getActionCommand();
        }

       courseArea.setText(courses);

        if(redColor.isSelected()){
            getContentPane().setBackground(Color.red);
        }
        else if(blueColor.isSelected()){
            getContentPane().setBackground(Color.blue);
        }
        else if(greenColor.isSelected()){
            getContentPane().setBackground(Color.green);
        }

    }
}
