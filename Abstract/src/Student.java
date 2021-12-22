public class Student extends Person {
    private String schoolName;

    public Student(String name, int age, long allowence) {
        super(name, age, allowence);
    }

    @Override
    public double calculateWeeklyIncome() {
        return allowence * 7;
    }

    @Override
    public double calculateMonthlyIncome() {
        return allowence * 30;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int CalculateBirthYear(){
        return currentYear - age;
    }
}
