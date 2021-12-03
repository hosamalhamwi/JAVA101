import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        Silly silly = new Silly("John");
        silly.showMessage();


        String name = JOptionPane.showInputDialog(null , "Please enter the name :");
        String surname = JOptionPane.showInputDialog(null , "Please enter the surname :");

        Reverse reverse = new Reverse(name , surname);
        reverse.showReverse();

        Person john = new Person(21 , "John");
        JOptionPane.showMessageDialog(null , "Age before calling Birthday() :" + john.getAge());
        john.birthday();
        JOptionPane.showMessageDialog(null , "Age after calling Birthday() :" + john.getAge());



        Person susan = new Person();
        susan.setAge(25);
        susan.setName("Susan");
        JOptionPane.showMessageDialog(null , "Susan :" + susan.getAge() + " " + susan.getName());


        Engineer jack = new Engineer("Jack" , 32);
        jack.setJob("Computer Engineer");
        jack.setSalary(2250);
        jack.addBonusToSalary(1000);

        String Data  = jack.getName() + " " + jack.getAge() + " " + jack.getJob() + " " + jack.getSalary();
        JOptionPane.showMessageDialog(null, Data);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Employee e1 = new Employee("John" , "man" ,"Engineer" );
        e1.setDOB(formatter.parse("12-12-1989"));
        e1.setFullTime(true);
        e1.setFullTimeSalary(2500);
        String e1Data = e1.getEmployeeName() + " " +
                e1.getEmployeeSex() + " " + e1.getEmployeePosition() + " " + e1.getEmployeeDOB() + " " +
                e1.getSalary() + " " + e1.getFullTime();

        JOptionPane.showMessageDialog(null , e1Data);


        Employee e2 = new Employee("Jane" , "Woman" , "consultant");
        e2.setDOB(formatter.parse("12-12-1989"));
        e2.setFullTime(false);
        e2.setPartTimeHours(120);
        e2.getSalary();
        e2.setDOB(formatter.parse("12-12-1989"));

        String e2Data = e2.getEmployeeName() + " " +
                e2.getEmployeeSex() + " " + e2.getEmployeePosition() + " " + e2.getEmployeeDOB() + " " +
                e2.getSalary() + " " + e2.getFullTime();
        JOptionPane.showMessageDialog(null , e2Data);

        GUI gui = new GUI("Authentication");
        gui.setVisible(true);

        BtnForm form = new BtnForm("Colors Button Form");
        form.setVisible(true);

        AnimalForm animal = new AnimalForm("Animal Form");
        animal.setVisible(true);

        CheckRadioForm check = new CheckRadioForm();
        check.setVisible(true);


        ComboBox combo = new ComboBox();
        combo.setVisible(true);

        Menu menu = new Menu();
        menu.setVisible(true);

        Layout layout = new Layout("Login");
        layout.setVisible(true);


        Calculator cal = new Calculator();
        cal.setVisible(true);






    }
}
