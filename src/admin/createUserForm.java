
package admin;

import config.dbConnect;
import javax.swing.JOptionPane;
import mygui.loginForm;


public class createUserForm extends javax.swing.JFrame {

   
    public createUserForm() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
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
        UserID = new javax.swing.JTextField();
        phonenumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        UserType = new javax.swing.JComboBox<>();
        createaccount1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        UserType1 = new javax.swing.JComboBox<>();
        fn1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setBackground(new java.awt.Color(102, 204, 255));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Phone Number");
        mainpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        mainpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        passportnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passportnumberActionPerformed(evt);
            }
        });
        mainpanel.add(passportnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 330, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Email");
        mainpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        mainpanel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 330, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Username");
        mainpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("User ID");
        mainpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Last Name");
        mainpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        mainpanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 330, 30));

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        mainpanel.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 180, 30));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        mainpanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 330, 30));

        UserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDActionPerformed(evt);
            }
        });
        mainpanel.add(UserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 160, 30));

        phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberActionPerformed(evt);
            }
        });
        mainpanel.add(phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 330, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Passport Number");
        mainpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        UserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User Status", "Active", "Pending" }));
        UserType.setToolTipText("");
        UserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTypeActionPerformed(evt);
            }
        });
        mainpanel.add(UserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 330, 30));

        createaccount1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        createaccount1.setText("Add");
        createaccount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccount1ActionPerformed(evt);
            }
        });
        mainpanel.add(createaccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 150, 30));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/regformwhite.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, 110));

        Back.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        mainpanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 100));

        UserType1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Type", "Admin", "Passenger" }));
        UserType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserType1ActionPerformed(evt);
            }
        });
        mainpanel.add(UserType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 330, 30));

        fn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fn1ActionPerformed(evt);
            }
        });
        mainpanel.add(fn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 160, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("First Name");
        mainpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
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

    private void UserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIDActionPerformed

    private void phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberActionPerformed

    }//GEN-LAST:event_phonenumberActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        new loginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void UserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTypeActionPerformed

        }

        // In your form's initialization (e.g., constructor or initComponents()):
        private void initializeComboBox() {
            UserType.addItem("Admin");
            UserType.addItem("Passenger");
    }//GEN-LAST:event_UserTypeActionPerformed

    private void createaccount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccount1ActionPerformed
        dbConnect dbc = new dbConnect();

        String firstName = UserID.getText().trim();
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

        if (dbc.insertData("INSERT INTO passengers (p_fname, p_lname, p_email, p_usertype, p_username, p_password, p_pnumber, p_passport, status) " +
            "VALUES ('" + firstName + "', '" + lastName + "', '" + emailText + "', '" + userType + "', " +
            "'" + usernameText + "', '" + passwordText + "', '" + phoneNumber + "', '" + passportNumber + "', 'Pending')") == 0) {
        JOptionPane.showMessageDialog(null, "Registered Successfully!");
        }
    }//GEN-LAST:event_createaccount1ActionPerformed

    private void UserType1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserType1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserType1ActionPerformed

    private void fn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fn1ActionPerformed

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JTextField UserID;
    private javax.swing.JComboBox<String> UserType;
    private javax.swing.JComboBox<String> UserType1;
    private javax.swing.JButton createaccount1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fn1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField ln;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextField passportnumber;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phonenumber;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
