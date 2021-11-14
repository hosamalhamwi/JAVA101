import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layout extends JFrame implements ActionListener {

    JButton btnSubmit = new JButton("Submit");
    JButton btnClear = new JButton("Clear");
    JTextField usernameText = new JTextField(15);
    JPasswordField passwordText = new JPasswordField(15);
    JLabel userLabel = new JLabel("Enter username");
    JLabel pwdLabel = new JLabel("Enter password");

    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel userPanel = new JPanel();

    private int counter = 0;

    public Layout(String title){
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(new BorderLayout());
        setResizable(false);
        setLocationRelativeTo(null);

        userPanel.add(userLabel);
        userPanel.add(usernameText);
        userPanel.add(pwdLabel);
        userPanel.add(passwordText);

        userPanel.setPreferredSize(new Dimension(350 , 400));
        southPanel.add(btnSubmit);
        southPanel.add(btnClear);
        northPanel.add(userPanel);

        add("North",northPanel);
        add(southPanel);

        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSubmit){
            String userName = usernameText.getText();
            String password = passwordText.getText();

            Admin login = new Admin("Admin");

            if(counter >= 2){
                JOptionPane.showMessageDialog(this,"Login attempts more then 3 Times" , "Error" , JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }


            if(userName.equals(login.getAdminUser()) && password.equals(login.getAdminPassword())){
                login.welcomeLabel.setText("Welcome to admin panel");
                login.setVisible(true);
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(this,"Incorrect username or Password" , "Error" , JOptionPane.ERROR_MESSAGE);
                ++counter;
            }

        }
        else if(e.getSource() == btnClear){
            usernameText.setText("");
            passwordText.setText("");


        }
    }
}
