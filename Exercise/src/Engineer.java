import javax.swing.*;

public class Engineer {

    private String name ;
    private double salary;
    private int age;
    private  String jobTitle ;

    public Engineer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void addBonusToSalary(double bounus){
        this.salary += bounus;
    }

    public void showSalary(){
        JOptionPane.showMessageDialog(null , this.salary);
    }
}
