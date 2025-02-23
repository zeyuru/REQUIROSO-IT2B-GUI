
package mygui;
import config.dbConnect;
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
        createaccount = new javax.swing.JButton();
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
        jLabel25 = new javax.swing.JLabel();
        UserType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setBackground(new java.awt.Color(102, 204, 255));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/regformwhite.png"))); // NOI18N
        mainpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 520, 110));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Phone Number");
        mainpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        mainpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, -1));

        passportnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passportnumberActionPerformed(evt);
            }
        });
        mainpanel.add(passportnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 330, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Email");
        mainpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, -1, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        mainpanel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 330, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Username");
        mainpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("First Name");
        mainpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Last Name");
        mainpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, -1, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        mainpanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 330, 30));

        createaccount.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        createaccount.setText("CREATE ACCOUNT");
        createaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccountActionPerformed(evt);
            }
        });
        mainpanel.add(createaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 150, 30));

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        mainpanel.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 180, 30));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        mainpanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 330, 30));

        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        mainpanel.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 160, 30));

        phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberActionPerformed(evt);
            }
        });
        mainpanel.add(phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 330, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Passport Number");
        mainpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("About us");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Enjoy reward flights, upgrades, exclusive benefits");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("and more.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, 20));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("efficient and comfortable aircraft, and our culturally");
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, 20));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 3, 40)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Join the Matrix");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 340, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Open up a world of rewards every time you travel.");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("customers across six continents every day.");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, 20));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(" our global hub in Philippines. We operate modern, ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, 20));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Matrix Airlines connects the world to, and through,");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 20));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText(" diverse workforce delivers award-winning services  ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, 20));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/BLACKLOGO-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 10, -1, -1));

        mainpanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 390, 580));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/purp.png"))); // NOI18N
        mainpanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -40, -1, -1));

        UserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Type", "Admin", "Passenger" }));
        UserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTypeActionPerformed(evt);
            }
        });
        mainpanel.add(UserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 330, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
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

    private void createaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccountActionPerformed
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

    // Email validation (Not empty, contains '@' and '.com', and not duplicate)
    if (emailText.isEmpty() || !emailText.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com$")) {
        JOptionPane.showMessageDialog(null, "Enter a valid email (must contain '@' and end with '.com')!");
        return;
    }
    if (dbc.checkDuplicate("passengers", "p_email", emailText)) {
        JOptionPane.showMessageDialog(null, "Email is already registered!");
        return;
    }

    // User Type validation (Must be selected)
    if (userType == null || userType.equals("Select User Type")) {
        JOptionPane.showMessageDialog(null, "Please select a User Type!");
        return;
    }

    // Username validation (Not empty & not duplicate)
    if (usernameText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Username is required!");
        return;
    }
    if (dbc.checkDuplicate("passengers", "p_username", usernameText)) {
        JOptionPane.showMessageDialog(null, "Username is already taken!");
        return;
    }

    // Password validation (Not empty & at least 8 characters)
    if (passwordText.isEmpty() || passwordText.length() < 8) {
        JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!");
        return;
    }

    // Phone number validation (Not empty & only digits)
    if (phoneNumber.isEmpty() || !phoneNumber.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "Phone Number is required and must contain only numbers!");
        return;
    }

    // Passport Number validation (Not empty)
    if (passportNumber.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Passport Number is required!");
        return;
    }

    // Declare result before using it
    int result = dbc.insertData("INSERT INTO passengers (p_fname, p_lname, p_email, p_usertype, p_username, p_password, p_pnumber, p_passport, status) " +
            "VALUES ('" + firstName + "', '" + lastName + "', '" + emailText + "', '" + userType + "', " +
            "'" + usernameText + "', '" + passwordText + "', '" + phoneNumber + "', '" + passportNumber + "', 'Pending')");

    if (result == 1) {  // Check if the insertion was successful
        JOptionPane.showMessageDialog(null, "Registered Successfully!");

        // Close the registration form
        this.dispose();

        // Open the login form
        new loginForm().setVisible(true);
    } else {
        JOptionPane.showMessageDialog(null, "Registration Failed!");
    }
    }//GEN-LAST:event_createaccountActionPerformed

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
    private javax.swing.JComboBox<String> UserType;
    private javax.swing.JButton createaccount;
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
