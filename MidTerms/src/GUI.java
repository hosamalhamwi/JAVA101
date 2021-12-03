import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class GUI extends JFrame implements ActionListener {

    JLabel name = new JLabel("Name");
    JLabel surname = new JLabel("Surname");
    JLabel age = new JLabel("Age");

    JTextField nameTextFiled = new JTextField(15);
    JTextField surnameTextFiled = new JTextField(15);
    JTextField ageTextFiled = new JTextField(15);

    JButton btnSubmit = new JButton("Submit");
    JButton btnClear = new JButton("Clear");



    public GUI(String title){
        setTitle(title);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,200);


        add(name);
        add(nameTextFiled);
        add(surname);
        add(surnameTextFiled);
        add(age);
        add(ageTextFiled);
        add(btnSubmit);
        add(btnClear);

        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnClear){
            nameTextFiled.setText("");
            surnameTextFiled.setText("");
            ageTextFiled.setText("");
        }
        else if(e.getSource() == btnSubmit){

            int age = 0 , yearBorn = 0;
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            String output = "";

            String name = nameTextFiled.getText();
            String surname = surnameTextFiled.getText();
            String ageStr = ageTextFiled.getText();

            try{
                age = Integer.parseInt(ageStr);
                yearBorn = currentYear - age;

                output = "Hello , \n" + name + " " + surname + " " + "Born year is :" + " " + yearBorn + " Age is " + age;
                JOptionPane.showMessageDialog(null , output);

            }catch (Exception ex){
                JOptionPane.showMessageDialog(null , "Please enter the valid number in age");

                JOptionPane.showMessageDialog(null , ex.getMessage());
            }

        }
    }
}
