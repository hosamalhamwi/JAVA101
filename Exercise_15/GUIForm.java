/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ST235_LAB
 */
public class GUIForm extends javax.swing.JFrame {


    /**
     * Creates new form GUIForm
     */
    public GUIForm() {
        initComponents();
        setLocationRelativeTo(null); // center the form
        genderGroup.add(radioMale);
        genderGroup.add(radioFemale);
        genderGroup.add(radioOther);
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {


        genderGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        radioOther = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        comboCountry = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        checkNetFlix = new javax.swing.JCheckBox();
        checkGym = new javax.swing.JCheckBox();
        checkVideo = new javax.swing.JCheckBox();
        btnSubmit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Enter name :");


        txtName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N


        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Enter surname :");


        txtSurname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N


        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Country of Origin:");


        radioMale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioMale.setText("male");
        radioMale.setToolTipText("");


        radioFemale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioFemale.setText("female");


        radioOther.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radioOther.setText("my gender is not listed");


        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Select Gender :");


        comboCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cyprus", "Turkey", "Nigeria", "Jordan", "Syria", "Pakistan" }));


        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Hobbies:");


        checkNetFlix.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkNetFlix.setText("Netflix");


        checkGym.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkGym.setText("Gym");


        checkVideo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkVideo.setText("Video Games");


        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });


        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Clear Form");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });


        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 153));
        jLabel6.setText("Please fill all of the fields below");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(radioOther)
                                    .addComponent(txtName)
                                    .addComponent(txtSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(radioFemale)
                                    .addComponent(radioMale)
                                    .addComponent(comboCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkNetFlix)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(checkGym)
                                        .addGap(28, 28, 28)
                                        .addComponent(checkVideo)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSubmit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(radioMale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioFemale)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioOther)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(checkNetFlix)
                    .addComponent(checkGym)
                    .addComponent(checkVideo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );


        pack();
    }// </editor-fold>                        


    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {                                          
     
       
        String name = this.txtName.getText().toString();
        String surname = this.txtSurname.getText().toString();
        String gender = "";
        String hobbies = "";
        
        if (radioMale.isSelected())
            gender = "male";
        else if (radioFemale.isSelected())
            gender = "female";
        else if (radioOther.isSelected())
            gender = "gender is not specified";
        
        String country = comboCountry.getSelectedItem().toString();
        
        
        if (checkNetFlix.isSelected())
            hobbies += "Netflix ";
        if (checkVideo.isSelected())
            hobbies += "Video Games ";
        if (checkGym.isSelected())
            hobbies += "Gym ";
        
        /*this is the object creation part*/
        GUIShow showForm = new GUIShow();
        
        showForm.setName(name);
        showForm.setSurname(surname);
        showForm.setGender(gender);
        showForm.setCountry(country);
        showForm.setHobbies(hobbies);
        showForm.setValues();
        showForm.setVisible(true);
        
        /*this is the object creation part*/
        
        
        dispose();//close this form
        
    }                                         




    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        this.txtName.setText("");
        this.txtSurname.setText("");
        this.genderGroup.clearSelection();
        this.comboCountry.setSelectedIndex(0);
        this.checkGym.setSelected(false);
        this.checkNetFlix.setSelected(false);
        this.checkVideo.setSelected(false);
        
    }                                        


    
    public void rememberValues (String name, String surname, String gender, String country){
    
        this.txtName.setText(name);
        this.txtSurname.setText(surname);
        
        if (gender.equals("male"))
            radioMale.setSelected(true);
        else if (gender.equals("female"))
            radioFemale.setSelected(true);  
        else if (gender.equals("gender is not specified"))
            radioOther.setSelected(true);
        
        comboCountry.setSelectedItem(country);
        
        
        
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox checkGym;
    private javax.swing.JCheckBox checkNetFlix;
    private javax.swing.JCheckBox checkVideo;
    private javax.swing.JComboBox<String> comboCountry;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioOther;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration                   
}

