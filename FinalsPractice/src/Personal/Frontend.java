import javax.swing.*;

public class Frontend extends Developer{

    private int salary;
    private String job;
    private int hours;

    Frontend(String email, boolean isPartTime) {
        super(email, isPartTime);
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public void setSalary(int s){
        this.salary = s;
    }

    public int getSalary(){
       return this.salary;
    }

    public void setJob(String job){
        this.job = job;
    }

    @Override
    public void birthday(String name) {
        int age = super.age+=1;
        JOptionPane.showMessageDialog(null,name+" Happy Birthday now you are " + age);
    }

    @Override
    public void report(String email) {
        JOptionPane.showMessageDialog(null,"Report of" + email + " Manager : " + super.managerName());
    }

    @Override
    public void hoursWorked(int hours) {
        JOptionPane.showMessageDialog(null,"Worked ");
    }

    @Override
    public void projectStatus(int s) {
        JOptionPane.showMessageDialog(null,"Project status is " + s  + "%");
    }

    @Override
    public int calculateSalary(int s) {
            return s*hours+500;
    }
}
