import javax.swing.*;

public class Undergraduate extends Student{
    protected String prog;
    protected int year;

    public Undergraduate(){}

    public Undergraduate(String nameInput, int ageInput,int markInput , String progInput , int yearInput){
        super(nameInput,ageInput,markInput);

        this.prog = progInput;
        this.year = yearInput;
    }

    public void setProg(String progIn) {
        this.prog = progIn;
    }

    public void setYear(int yearIn) {
        this.year = yearIn;
    }

    public void changeYear(){
        year+=1;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void study(int hours){
        avMark = avMark+(hours*2)-5;
        JOptionPane.showMessageDialog(null,super.name+" Average marks are " + avMark);
    }

    @Override
    public void register() {
        String output="Name is "+super.name + " Program is "+ this.prog + " year is " + this.year;
        JOptionPane.showMessageDialog(null,output);
    }
}
