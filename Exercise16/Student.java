import javax.swing.*;

public class Student extends Person {
    protected int avMark;

    public Student(){}

    public Student(String nameInput, int ageInput,int markInput){
        super(nameInput,ageInput);

        this.avMark = markInput;
    }

    public void setMark(int markIn) {
        this.avMark = markIn;
    }

    public void study(int hours){
        avMark = avMark + (hours*2);
        JOptionPane.showMessageDialog(null,avMark);
    }

    @Override
    public void register(){
        String output= "Name is "+this.name + " Age is " + this.age + " AvgMark is " + this.avMark;
        JOptionPane.showMessageDialog(null,output);
    }

}
