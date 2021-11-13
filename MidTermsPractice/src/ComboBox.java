import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame implements ActionListener {

    JCheckBox courseOOP = new JCheckBox("Object Oriented Programming");
    JCheckBox courseVisual = new JCheckBox("Visual Programming");
    JCheckBox courseMobile = new JCheckBox("Mobile Application Programming");

    JRadioButton radioCMPE = new JRadioButton("Computer Engineering");
    JRadioButton radioISE = new JRadioButton("Information System Security");
    JRadioButton radioSOFT = new JRadioButton("Software Engineering");

    JCheckBox []myCheckBoxes = new JCheckBox[] {courseOOP , courseVisual , courseMobile};
    JRadioButton [] myRadioButtons = {radioCMPE, radioISE, radioSOFT};
    String []countries = {"Turkey" , "Cyproit" , "Nigeria" , "Jordan" , "Syria" , "Pakistan"};
    JComboBox countryBox = new JComboBox(countries);

    ButtonGroup radioGroup = new ButtonGroup();

    JLabel infoLabel = new JLabel("Please select the courses you are taking this term and your department");
    JLabel infoLabel2 = new JLabel("Courses you are Taking are listed below");
    JLabel infoLabel3 = new JLabel("Select your country from the given options");

    JTextArea textArea = new JTextArea(10,50);
    JButton btnSubmit = new JButton("Submit");
    JButton btnClear = new JButton("Clear");

    String courses = "";
    String department;
    String country;

    public ComboBox(){
        setTitle("Combo Box");
        setLayout(new FlowLayout());
        setSize(750,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        infoLabel.setFont(new Font("Verdana" , Font.BOLD , 14));
        infoLabel.setForeground(Color.red);
        infoLabel2.setFont(new Font("Verdana" , Font.BOLD , 18));
        infoLabel3.setFont(new Font("Verdana" , Font.BOLD , 14));
        infoLabel3.setForeground(Color.red);

        textArea.setFont(new Font("Verdana" , Font.BOLD , 14));
        textArea.setForeground(Color.blue);

        countryBox.setFont(new Font("Verdana" , Font.BOLD , 14));

        add(infoLabel);

        for (JCheckBox eachCheck : myCheckBoxes){
            add(eachCheck);
            eachCheck.setFont(new Font("Verdana" , Font.BOLD , 13));
        }

        add(infoLabel2);

        for (JRadioButton eachRadio : myRadioButtons ){
            radioGroup.add(eachRadio);
            add(eachRadio);
            eachRadio.setFont(new Font("Verdana" , Font.BOLD , 14));
        }

        add(infoLabel3);
        add(countryBox);
        add(infoLabel2);
        add(textArea);
        add(btnSubmit);
        add(btnClear);


        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);




    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnClear){
            textArea.setText("");

            radioGroup.clearSelection();

            for (JCheckBox eachbtn : myCheckBoxes)
                eachbtn.setSelected(false);

            countryBox.setSelectedIndex(-1);
        }
        else if(e.getSource() == btnSubmit){
            try {
                courses = "";
                department = "";
                String Data;

                if (courseOOP.isSelected())
                    courses += courseOOP.getActionCommand();
                if (courseVisual.isSelected())
                    courses += courseVisual.getActionCommand();
                if (courseMobile.isSelected())
                    courses += courseMobile.getActionCommand();

                if (radioCMPE.isSelected())
                    department = radioCMPE.getActionCommand();
                else if (radioISE.isSelected())
                    department = radioISE.getActionCommand();
                else if (radioSOFT.isSelected())
                    department = radioSOFT.getActionCommand();

                country = countryBox.getSelectedItem().toString();

                Data = courses + "\nYour Department is " + department + "\nYour Country is " + country;

                textArea.setText(Data);
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }

        }
    }
}
