
package mygui;
import config.dbConnect;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class registrationForm extends javax.swing.JFrame {

    
    public registrationForm() {
        initComponents();
        
    
        
      setSize(950, 600);  
    setLocationRelativeTo(null); 
 
    setResizable(false); 
    
  
    this.addComponentListener(new java.awt.event.ComponentAdapter() {
        @Override
        public void componentMoved(java.awt.event.ComponentEvent evt) {
            setLocationRelativeTo(null);
        }
    });
    
    
    }
 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passportnumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        ln = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        phonenumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        UserType = new javax.swing.JComboBox<>();
        createaccount1 = new javax.swing.JButton();
        CANCEL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setBackground(new java.awt.Color(102, 204, 255));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/regformwhite.png"))); // NOI18N
        mainpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 520, 110));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Phone Number");
        mainpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        mainpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, -1, -1));

        passportnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passportnumberActionPerformed(evt);
            }
        });
        mainpanel.add(passportnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 330, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Email");
        mainpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        mainpanel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 330, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Username");
        mainpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("First Name");
        mainpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Last Name");
        mainpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, -1, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        mainpanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 330, 30));

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        mainpanel.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 180, 30));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        mainpanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 330, 30));

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        mainpanel.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 160, 30));

        phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberActionPerformed(evt);
            }
        });
        mainpanel.add(phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 330, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Passport Number");
        mainpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("About us");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Enjoy reward flights, upgrades, exclusive benefits");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("and more.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 20));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("efficient and comfortable aircraft, and our culturally");
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, 20));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 3, 40)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Join the Matrix");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 340, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Open up a world of rewards every time you travel.");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("customers across six continents every day.");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, 20));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(" our global hub in Philippines. We operate modern, ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 20));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Matrix Airlines connects the world to, and through,");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, 20));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText(" diverse workforce delivers award-winning services  ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, 20));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/BLACKLOGO-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, -1, -1));

        mainpanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 630));

        Back.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        mainpanel.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/purp.png"))); // NOI18N
        mainpanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -40, -1, -1));

        UserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Type", "Admin", "Passenger" }));
        UserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTypeActionPerformed(evt);
            }
        });
        mainpanel.add(UserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 330, 30));

        createaccount1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        createaccount1.setText("CREATE ACCOUNT");
        createaccount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccount1ActionPerformed(evt);
            }
        });
        mainpanel.add(createaccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 150, 30));

        CANCEL.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        CANCEL.setText("CANCEL");
        CANCEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CANCELMouseClicked(evt);
            }
        });
        mainpanel.add(CANCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passportnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passportnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passportnumberActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
     
    }//GEN-LAST:event_emailActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
      
   
    
    }//GEN-LAST:event_passwordActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
      
    }//GEN-LAST:event_usernameActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberActionPerformed
       
    

    }//GEN-LAST:event_phonenumberActionPerformed

    private void UserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTypeActionPerformed
       
    
}

// In your form's initialization (e.g., constructor or initComponents()):
private void initializeComboBox() {
    UserType.addItem("Admin");
    UserType.addItem("Passenger");
    }//GEN-LAST:event_UserTypeActionPerformed

    private void createaccount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccount1ActionPerformed
       dbConnect dbc = new dbConnect();

    String firstName = fn.getText().trim();
    String lastName = ln.getText().trim();
    String emailText = email.getText().trim();
    String userType = (String) UserType.getSelectedItem();
    String usernameText = username.getText().trim();
    String passwordText = password.getText().trim();
    String phoneNumber = phonenumber.getText().trim();
    String passportNumber = passportnumber.getText().trim();

    
    if (firstName.isEmpty() || !firstName.matches("[a-zA-Z]+")) {
        JOptionPane.showMessageDialog(null, "First Name is required and must contain only letters!");
        return;
    }
    if (lastName.isEmpty() || !lastName.matches("[a-zA-Z]+")) {
        JOptionPane.showMessageDialog(null, "Last Name is required and must contain only letters!");
        return;
    }

    
    if (emailText.isEmpty() || !emailText.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com$")) {
        JOptionPane.showMessageDialog(null, "Enter a valid email (must contain '@' and end with '.com')!");
        return;
    }
    if (dbc.checkDuplicate("passengers", "p_email", emailText)) {
        JOptionPane.showMessageDialog(null, "Email is already registered!");
        return;
    }

   
    if (userType == null || userType.equals("Select User Type")) {
        JOptionPane.showMessageDialog(null, "Please select a User Type!");
        return;
    }
   
    if (usernameText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Username is required!");
        return;
    }
    if (dbc.checkDuplicate("passengers", "p_username", usernameText)) {
        JOptionPane.showMessageDialog(null, "Username is already taken!");
        return;
    }

    
    if (passwordText.isEmpty() || passwordText.length() < 8) {
        JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!");
        return;
    }

   
    if (phoneNumber.isEmpty() || !phoneNumber.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "Phone Number is required and must contain only numbers!");
        return;
    }

    
    if (passportNumber.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Passport Number is required!");
        return;
    }
       String hashedPassword;
    try {
        hashedPassword = passwordHasher.hashPassword(passwordText); 
    } catch (NoSuchAlgorithmException e) {
        JOptionPane.showMessageDialog(null, "Error hashing password: " + e.getMessage());
        return;
    }
    
    if (dbc.insertData("INSERT INTO passengers (p_fname, p_lname, p_email, p_usertype, p_username, p_password, p_pnumber, p_passport, status) " +
            "VALUES ('" + firstName + "', '" + lastName + "', '" + emailText + "', '" + userType + "', " +
            "'" + usernameText + "', '" + hashedPassword + "', '" + phoneNumber + "', '" + passportNumber + "', 'Pending')") == 0) {
        JOptionPane.showMessageDialog(null, "Registered Successfully!");
    }
    }//GEN-LAST:event_createaccount1ActionPerformed

    private void CANCELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CANCELMouseClicked
       new loginForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_CANCELMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
       new loginForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton CANCEL;
    private javax.swing.JComboBox<String> UserType;
    private javax.swing.JButton createaccount1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ln;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextField passportnumber;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phonenumber;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
