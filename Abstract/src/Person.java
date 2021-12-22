import java.util.Calendar;

public abstract class Person {
    protected String name;
    protected int age;
    protected long allowence;
    protected long salary;
    protected int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    Person(){}

    public Person(String name, int age, long allowence) {
        this.name = name;
        this.age = age;
        this.allowence = allowence;
    }
    public Person(String name, long salary, int age) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public abstract double calculateWeeklyIncome();

    public abstract double calculateMonthlyIncome();

}
