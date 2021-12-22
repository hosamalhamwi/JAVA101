public  class Employee extends Person {

    private String jobTitle;

    public Employee(String name, long salary, int age) {
        super(name, salary, age);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public double calculateWeeklyIncome() {
        return salary * 7;
    }

    @Override
    public double calculateMonthlyIncome() {
        return salary * 30;
    }

    public double calculateYearlyIncome(){
        return salary * 365;
    }
}
