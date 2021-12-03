import javax.swing.*;

public class Form2 extends JFrame {

    private JPanel form2;
    private JLabel firstlbl;
    private JLabel surnamelbl;
    private JLabel genderlbl;
    private JLabel nationlbl;
    private JLabel courseslbl;

    public Form2(Form1 frm) {
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        add(form2);

        firstlbl.setText(frm.firtnametext.getText());
        surnamelbl.setText(frm.surnametext.getText());
       if (frm.maleRadioButton.isSelected()){
           genderlbl.setText("Male");
       }else if(frm.femaleRadioButton.isSelected()){
           genderlbl.setText("Female");
       }

       nationlbl.setText(frm.comboBox1.getSelectedItem().toString());
        String courses = "";
      if(frm.opearingSystemCheckBox.isSelected()){
          courses+= " Operaing System ";
      } if(frm.visualProgrammingCheckBox.isSelected()){
          courses+=" Visual Programming ";
      } if(frm.kotlinCheckBox.isSelected()){
          courses+=" Kotlin ";
      } if(frm.OOPCheckBox.isSelected()){
          courses+=" OOP ";
      }

      courseslbl.setText(courses);
    }
}
