import java.util.Date;

public class Employee {
    private String employeeName ;
    private String employeeSex;
    private String employeePosition;
    private Date employeeDOB;
    private boolean isFullTime;
    private double hoursWorked;
    private double STANDARD_PAY_RATe = 17;
    private double salary;

    public Employee(){}

    public Employee(String employeeName, String gender, String position) {
        this.employeeName = employeeName;
        this.employeeSex = gender;
        this.employeePosition = position;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public void setEmployeeDOB(Date employeeDOB) {
        this.employeeDOB = employeeDOB;
    }

    public void setFullTimeSalary(double s) {

    }

    public void setPartTimeHours(double h) {

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeSex() {
        return employeeSex;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public Date getEmployeeDOB() {
        return employeeDOB;
    }

    public double getSalary() {
        return salary;
    }
}
