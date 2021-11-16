import javax.swing.*;
import java.text.SimpleDateFormat;

public class Test {
   public static void main(String[] args){
       Person p1 = new Person(12 , "John");
       p1.birthDay();


       Person p2 = new Person();

       p2.setName("Susan");
       p2.setAge(25);

       Engineer jack = new Engineer("Jack" , 32);
       jack.setJobTitle("Computer Engineer");

       jack.setSalary(2250);
       jack.showSalary();
       jack.addBonusToSalary(1000);

       JOptionPane.showMessageDialog(null,jack.getName() + " " + jack.getAge() + " " + jack.getJobTitle() + " " + jack.getSalary());

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






   }
}
