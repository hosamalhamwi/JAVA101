import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {


    JLabel infoLabel = new JLabel("Please select the options from the menu");
    JMenuBar navigationMenu = new JMenuBar();
    JMenu formMenu = new JMenu("Form");
    JMenu colorMenu = new JMenu("Color");
    JMenu subForm = new JMenu("This Form");
    JMenuItem newForm = new JMenuItem("New Form");
    JMenuItem closeForm = new JMenuItem("Close Form");
    JMenuItem exitApplication = new JMenuItem("Exit Application");
    JMenuItem redColor = new JMenuItem("Red");
    JMenuItem blueColor = new JMenuItem("Blue");
    JMenuItem greenColor = new JMenuItem("Green");

    JMenuItem []menuItems = new JMenuItem[] {newForm , closeForm , exitApplication , redColor , blueColor , greenColor};



    public Menu(){
        setTitle("Menu");
        setSize(new Dimension(500,500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setResizable(false);

        infoLabel.setFont(new Font("Verdana",Font.BOLD,14));
        infoLabel.setForeground(Color.RED);

        formMenu.add(subForm);
        formMenu.add(newForm);
        formMenu.add(closeForm);
        subForm.add(exitApplication);
        colorMenu.add(redColor);
        colorMenu.add(blueColor);
        colorMenu.add(greenColor);

        for (JMenuItem eachitem : menuItems)
            eachitem.addActionListener(this);


        setJMenuBar(navigationMenu);
        navigationMenu.add(formMenu);
        navigationMenu.add(colorMenu);

        add(navigationMenu);
        add(infoLabel);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == newForm)
            new Menu().setVisible(true);
        else if(e.getSource() == closeForm)
            dispose();
        else if(e.getSource() == exitApplication)
            System.exit(0);
        else if(e.getSource() == redColor)
            getContentPane().setBackground(Color.red);
        else if(e.getSource() == blueColor)
            getContentPane().setBackground(Color.blue);
        else if (e.getSource() == greenColor)
            getContentPane().setBackground(Color.green);


    }
}
