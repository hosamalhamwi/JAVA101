import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame implements ActionListener {


    JPanel northPanel = new JPanel(new FlowLayout());
    JPanel southPanel = new JPanel(); //leaving this empty means flowLaout shabab Khalas :)
    JButton btnLogout = new JButton("LogOut");
    JLabel labelInfo = new JLabel("<Welcome>");
    private String username = "admin";
    private String password = "admin";

    public Welcome(){


        setMinimumSize(new Dimension(600,400));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login Sucess");
        setLayout(new BorderLayout());

        labelInfo.setFont(new Font("Verdana",Font.BOLD,22));
        labelInfo.setForeground(Color.BLUE);
        northPanel.add(labelInfo);


        northPanel.setPreferredSize(new Dimension(200,200));
        //northPanel.setBorder(BorderFactory.createLineBorder(Color.RED));

        southPanel.add(btnLogout);



        add("North",northPanel);
        add("South",southPanel);

        btnLogout.addActionListener(this);


    }

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        setVisible(false);
        new GUI().setVisible(true);

    }
}
