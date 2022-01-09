public interface Report {

    public abstract void report(String email);
    public abstract void hoursWorked(int hours);
    public abstract void projectStatus(int s);
    public abstract int calculateSalary(int h);

}
