import javax.swing.*;

public class Person {
    protected String name;
    protected int age;

    public Person(){}

    public Person(String nameInput , int ageInput){
        this.name = nameInput;
        this.age = ageInput;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void register(){
        String output="Name is "+ this.name + " Age is " + this.age;
        JOptionPane.showMessageDialog(null,output);
    }
}
