import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    JPanel northPanel = new JPanel(new FlowLayout());
    JPanel southPanel = new JPanel(); //leaving this empty means flowLaout shabab Khalas :)
    JButton btnLogi = new JButton("Login");
    JButton btnClear = new JButton("Clear");
    JTextField userText = new JTextField(15);
    JPasswordField passwordText = new JPasswordField(15);


    private int counter = 0;

    public GUI(){
         setMinimumSize(new Dimension(400 , 400));
         setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setTitle("Login Interface");
         setLayout(new BorderLayout());

         northPanel.add(new JLabel("Username :"));
         northPanel.add(userText);
         northPanel.add(new JLabel("Password :"));
         northPanel.add(passwordText);

         northPanel.setPreferredSize(new Dimension(200,200));

         southPanel.add(btnLogi);
         southPanel.add(btnClear);

         add("North" , northPanel);
         add("South" , southPanel);


        btnLogi.addActionListener(this);
        btnClear.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnClear){
            this.userText.setText("");
            this.passwordText.setText("");

        }else if(e.getSource() == btnLogi){

            String enteredUsername = this.userText.getText();
            String enteredPassword = this.passwordText.getText();

            Welcome log = new Welcome();

            if(counter>=3){

                JOptionPane.showMessageDialog(this , "Sorry too many attempts" , "Error" , JOptionPane.ERROR_MESSAGE);

                System.exit(0);

            }

            else if(enteredUsername.equals(log.getUsername()) && enteredPassword.equals(log.getPassword())){
                log.labelInfo.setText("Welcome Admin , you sucessfully logged in");
                log.setVisible(true);
                setVisible(false);
            }
            else{
                ++counter;
                JOptionPane.showMessageDialog(this , "Username and Password do not match" , "Error" , JOptionPane.ERROR_MESSAGE);
                
            }
        }

    }
}
