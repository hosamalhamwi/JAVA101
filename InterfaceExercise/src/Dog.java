import javax.swing.*;

public class Dog extends Pet{

    private String name;

    public Dog(int age, String breed) {
        super(age, breed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void adaptionCompleted() {
        JOptionPane.showMessageDialog(null,this.name+" is owned by "+owner.getName());
    }

    @Override
    public void move(String from, String to) {
        JOptionPane.showMessageDialog(null,"Runs from "+from+" to "+to);
    }

    @Override
    public void eat(String food) {
        JOptionPane.showMessageDialog(null,"Eats "+food);
    }

    @Override
    public void sleep(int hours) {
        JOptionPane.showMessageDialog(null,"Sleep "+hours+" a day");
    }
}
