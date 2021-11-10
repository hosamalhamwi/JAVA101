import javax.swing.*;

public class Main {
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

       Employee em = new Employee("John" , "man" , "Engineer");
       em.setFullTimeSalary(2500);


       JOptionPane.showMessageDialog(null ,em.getEmployeeName() + " " + em.getEmployeeSex() + " " + em.getEmployeePosition() + " " + em.getSalary());




   }
}
