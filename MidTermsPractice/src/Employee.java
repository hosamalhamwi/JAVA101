import java.util.Date;

public class Employee {

    private String employeeName ;
    private String employeeSex;
    private String employeePosition;
    private Date employeeDOB;
    private Boolean isFullTime;
    private double hoursWorked;
    private double Salary;
    private int STANDARD_PAY_RATE = 17;


    public Employee(){}

    public Employee(String name , String gender , String position){
        this.employeeName = name;
        this.employeeSex = gender;
        this.employeePosition = position;
    }

    public void setName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public void setPosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public void setDOB(Date employeeDOB) {
        this.employeeDOB = employeeDOB;
    }

    public void setFullTimeSalary(double salary){
        this.Salary = salary;
    }

    public void setPartTimeHours(double hours) {

        this.Salary = hours * STANDARD_PAY_RATE;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public void setFullTime(Boolean fullTime) {
        isFullTime = fullTime;
    }

    public Boolean getFullTime() {
        return isFullTime;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public Date getEmployeeDOB() {
        return employeeDOB;
    }

    public double getSalary() {
        return Salary;
    }
}
