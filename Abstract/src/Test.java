import javax.swing.*;

public class Test {

    public static void main(String[] args) {

        Employee jack = new Employee("Jack" , 70 , 30);
        jack.setJobTitle("Computer Engineer");

        Student suzan = new Student("Suzan" , 19 , 20);
        suzan.setSchoolName("Cyprus International University");


        String output = "----------Jack Information----------\n\n Weekly income = " + jack.calculateWeeklyIncome() + " \n Monthly income = " + jack.calculateMonthlyIncome() +
                "\nYearly Salary = " + jack.calculateYearlyIncome() +
                "\n\n----------Suzan Information----------\n\nWeekly allowence = " + suzan.calculateWeeklyIncome() + " \nMonthly allowence = " + suzan.calculateMonthlyIncome() + "\nSuzan birth year is " + suzan.CalculateBirthYear()  + "\n";

        JOptionPane.showMessageDialog(null,output);
    }
}
