import javax.swing.*;

public class Engineer {

    private String name;
    private double salary;
    private int age;
    private String jobTitle;

    public Engineer(String name , int age){
        this.age = age;
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJob(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return jobTitle;
    }

    public void addBonusToSalary(double bonus){
        this.salary = this.salary + bonus;
    }

    public void showSalary(){
        JOptionPane.showMessageDialog(null , "Your salary is " + this.salary);
    }
}
