import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {
    protected JTextField firtnametext;
    protected JTextField surnametext;
    protected JRadioButton maleRadioButton;
    protected JRadioButton femaleRadioButton;
    protected JComboBox comboBox1;
    protected JCheckBox opearingSystemCheckBox;
    protected JCheckBox OOPCheckBox;
    protected JCheckBox kotlinCheckBox;
    protected JCheckBox visualProgrammingCheckBox;
    protected JTextArea textArea1;
    protected JButton submitButton;
    protected JButton clearButton;
    protected JPanel form1;

    private String countries  [] = {"Oman" , "Turkey" , "Iraq" , "Pakistan" };

    public Form1() {
        setSize(500,500);
        add(form1);
        Form1 obj = this;
        comboBox1.setModel(new DefaultComboBoxModel(countries));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Form2 f2 = new Form2(obj);
                f2.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        Form1 f1 = new Form1();
    }
}
