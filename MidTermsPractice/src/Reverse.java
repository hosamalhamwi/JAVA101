import javax.swing.*;

public class Reverse {
    private String name;
    private String surname;

    public Reverse(String name , String surname){
        this.name = name;
        this.surname = surname;
    }

    public void showReverse(){
        JOptionPane.showMessageDialog(null , surname + " " + name);
        JOptionPane.showMessageDialog(null , name.charAt(0));
    }


}
