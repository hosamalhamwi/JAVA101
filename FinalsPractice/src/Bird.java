import javax.swing.*;

public class Bird extends Animal{
    private String breed;

    Bird(){}

    @Override
    public void move(){
        JOptionPane.showMessageDialog(null,"Bird flies");
    }

}
