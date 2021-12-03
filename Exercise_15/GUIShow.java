/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ST235_LAB
 */
public class GUIShow extends javax.swing.JFrame {


    private String name, surname, gender, country, hobbies;
        
    public GUIShow() {
        initComponents();
        setLocationRelativeTo(null); // center the form
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {


        labelWelcome = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelCountry = new javax.swing.JLabel();
        labelHobbies = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JButton();
        btnCloseApp = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        labelWelcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(255, 0, 153));
        labelWelcome.setText("Welcome <name> <surname>,");


        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel4.setText("followings are your selection of the form:");


        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Gender:");


        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Country of Origin:");


        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Hobbies:");


        labelCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCountry.setForeground(new java.awt.Color(0, 0, 153));
        labelCountry.setText("<country>");


        labelHobbies.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelHobbies.setForeground(new java.awt.Color(0, 0, 153));
        labelHobbies.setText("<hobbies>");


        labelGender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelGender.setForeground(new java.awt.Color(0, 0, 153));
        labelGender.setText("<gender>");


        btnGoBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGoBack.setText("<- Go Back");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });


        btnCloseApp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCloseApp.setText("Close Application");
        btnCloseApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseAppActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGoBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCloseApp, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelWelcome)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCountry)
                                    .addComponent(labelHobbies)
                                    .addComponent(labelGender))))
                        .addGap(0, 99, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelWelcome)
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelGender))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelCountry))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelHobbies))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCloseApp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );


        pack();
    }// </editor-fold>                        


    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {                                          
        GUIForm userForm = new GUIForm();
        userForm.rememberValues(name, surname, gender,country);
        userForm.setVisible(true);
        dispose();
    }                                         


    private void btnCloseAppActionPerformed(java.awt.event.ActionEvent evt) {                                            
        System.exit(0);
    }                                           


    public void setName(String name) {
        this.name = name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public void setCountry(String country) {
        this.country = country;
    }


    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }


    public void setValues(){
    
        this.labelWelcome.setText("Welcome " + name + " " + surname + ", ");
        this.labelGender.setText(gender);
        this.labelCountry.setText(country);
        this.labelHobbies.setText(hobbies);
    }




    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCloseApp;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelCountry;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelHobbies;
    private javax.swing.JLabel labelWelcome;
    // End of variables declaration                   
}

