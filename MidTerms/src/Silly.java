import javax.swing.*;

public class Silly {
    private String name;


    public Silly(String name){
        this.name = name;
    }

    public void showMessage() {
        JOptionPane.showMessageDialog(null , "This is a silly name");
    }


}
