import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {

    JLabel welcomeLabel = new JLabel("Welcome");
    JButton btnLogout = new JButton("Logout");
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();

    private String adminUser = "admin";
    private String adminPassword = "admin";


    public String getAdminUser() {
        return adminUser;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public Admin(String title){
        setTitle(title);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        northPanel.add(welcomeLabel);
        southPanel.add(btnLogout);

        add("North" , northPanel);
        add("South" , southPanel);

        btnLogout.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        new Layout("Login");
        this.setVisible(false);
    }
}
