
package admin;

import config.dbConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import mygui.loginForm;


public class createUserForm extends javax.swing.JFrame {

    /**
     * @return the fn1
     */
    public javax.swing.JTextField getFn1() {
        return fn1;
    }

    /**
     * @param fn1 the fn1 to set
     */
    public void setFn1(javax.swing.JTextField fn1) {
        this.fn1 = fn1;
    }

   
    public createUserForm() {
       
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passportnumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        ln = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        phonenumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        addacc = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        update = new javax.swing.JButton();
        Delete1 = new javax.swing.JButton();
        CLEAR1 = new javax.swing.JButton();
        refresh1 = new javax.swing.JButton();
        UserType1 = new javax.swing.JComboBox<>();
        fn1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        UserStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        userID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setBackground(new java.awt.Color(102, 204, 255));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Phone Number");
        mainpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        mainpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        passportnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passportnumberActionPerformed(evt);
            }
        });
        mainpanel.add(passportnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 330, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Email");
        mainpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        mainpanel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 330, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Username");
        mainpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Last Name");
        mainpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        mainpanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 330, 30));

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        mainpanel.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 180, 30));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        mainpanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 330, 30));

        phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberActionPerformed(evt);
            }
        });
        mainpanel.add(phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 330, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Passport Number");
        mainpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addacc.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        addacc.setText("ADD");
        addacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addaccActionPerformed(evt);
            }
        });
        jPanel2.add(addacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 160, 50));

        cancel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 160, 50));

        update.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        update.setText("UPDATE");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 160, 50));

        Delete1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Delete1.setText("DELETE");
        Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete1ActionPerformed(evt);
            }
        });
        jPanel2.add(Delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 160, 50));

        CLEAR1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        CLEAR1.setText("CLEAR");
        CLEAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEAR1ActionPerformed(evt);
            }
        });
        jPanel2.add(CLEAR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 160, 50));

        refresh1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        refresh1.setText("REFRESH");
        refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh1ActionPerformed(evt);
            }
        });
        jPanel2.add(refresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 160, 50));

        mainpanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 140));

        UserType1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Type", "Admin", "Passenger" }));
        UserType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserType1ActionPerformed(evt);
            }
        });
        mainpanel.add(UserType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 330, 30));

        fn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fn1ActionPerformed(evt);
            }
        });
        mainpanel.add(fn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 160, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("First Name");
        mainpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        UserStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        UserStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserStatusActionPerformed(evt);
            }
        });
        mainpanel.add(UserStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 330, 30));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("USER ID");
        mainpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 70, -1));

        userID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userID.setEnabled(false);
        userID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDActionPerformed(evt);
            }
        });
        mainpanel.add(userID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 719, Short.MAX_VALUE)
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

    private void phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberActionPerformed

    }//GEN-LAST:event_phonenumberActionPerformed

    private void addaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addaccActionPerformed
      dbConnect dbc = new dbConnect();

    String firstName = fn1.getText().trim();
    String lastName = ln.getText().trim();
    String emailText = email.getText().trim();
    String selectedUserType = (String) UserType1.getSelectedItem();
    String selectedUserStatus = (String) UserStatus.getSelectedItem();
    String usernameText = username.getText().trim();
    String passwordText = password.getText().trim();
    String phoneNumber = phonenumber.getText().trim();
    String passportNumber = passportnumber.getText().trim();

    // Check if any fields are empty
    if (firstName.isEmpty() || lastName.isEmpty() || emailText.isEmpty() || usernameText.isEmpty() || passwordText.isEmpty() || phoneNumber.isEmpty() || passportNumber.isEmpty() || selectedUserType == null || selectedUserStatus == null || selectedUserType.equals("Select User Type") || selectedUserStatus.equals("Select User Status")) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields!");
        return;
    }

    // Check for duplicates
    if (dbc.checkDuplicate("passengers", "p_username", usernameText, 0)) { // Pass 0 for new account
        JOptionPane.showMessageDialog(null, "Username already exists!");
        return;
    }

    if (dbc.checkDuplicate("passengers", "p_email", emailText, 0)) { // Pass 0 for new account
        JOptionPane.showMessageDialog(null, "Email already exists!");
        return;
    }

    // Check if userID field is empty. If empty, it's a new account
    if (userID.getText().trim().isEmpty()) {
        // Insert new account
        String insertQuery = "INSERT INTO passengers (p_fname, p_lname, p_email, p_usertype, p_username, p_password, p_pnumber, p_passport, status) " +
                "VALUES ('" + firstName + "', '" + lastName + "', '" + emailText + "', '" + selectedUserType + "', '" + usernameText + "', '" + passwordText + "', '" + phoneNumber + "', '" + passportNumber + "', '" + selectedUserStatus + "')";

        dbc.insertData(insertQuery);
        JOptionPane.showMessageDialog(null, "Account added successfully!");
    } else {
        // Update existing account
        int idToUpdate;
        try {
            idToUpdate = Integer.parseInt(userID.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid User ID!");
            return;
        }

        String updateQuery = "UPDATE passengers SET " +
                "p_fname = '" + firstName + "', " +
                "p_lname = '" + lastName + "', " +
                "p_email = '" + emailText + "', " +
                "p_usertype = '" + selectedUserType + "', " +
                "p_username = '" + usernameText + "', " +
                "p_password = '" + passwordText + "', " +
                "p_pnumber = '" + phoneNumber + "', " +
                "p_passport = '" + passportNumber + "', " +
                "status = '" + selectedUserStatus + "' " +
                "WHERE p_id = " + idToUpdate;

        dbc.updateData(updateQuery);
        JOptionPane.showMessageDialog(null, "Account updated successfully!");
        
    
    }
         AdminDashboard AdminDashboard = new AdminDashboard();
   AdminDashboard.setVisible(true);

    
    this.dispose();
    }//GEN-LAST:event_addaccActionPerformed

    private void UserType1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserType1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserType1ActionPerformed

    private void fn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fn1ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        usersForm uf = new usersForm();
    uf.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void UserStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserStatusActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
          dbConnect dbc = new dbConnect();

    String firstName = fn1.getText().trim();
    String lastName = ln.getText().trim();
    String emailText = email.getText().trim();
    String selectedUserType = (String) UserType1.getSelectedItem();
    String selectedUserStatus = (String) UserStatus.getSelectedItem();
    String usernameText = username.getText().trim();
    String passwordText = password.getText().trim();
    String phoneNumber = phonenumber.getText().trim();
    String passportNumber = passportnumber.getText().trim();

    int idToUpdate;
    try {
        idToUpdate = Integer.parseInt(userID.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid User ID!");
        return;
    }

    if (firstName.isEmpty() || lastName.isEmpty() || emailText.isEmpty() || usernameText.isEmpty() || passwordText.isEmpty() || phoneNumber.isEmpty() || passportNumber.isEmpty() || selectedUserType == null || selectedUserStatus == null || selectedUserType.equals("Select User Type") || selectedUserStatus.equals("Select User Status")) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields!");
        return;
    }

    if (dbc.checkDuplicate("passengers", "p_username", usernameText, idToUpdate)) {
        JOptionPane.showMessageDialog(null, "Username already exists!");
        return;
    }

    if (dbc.checkDuplicate("passengers", "p_email", emailText, idToUpdate)) {
        JOptionPane.showMessageDialog(null, "Email already exists!");
        return;
    }

    String updateQuery = "UPDATE passengers SET " +
            "p_fname = '" + firstName + "', " +
            "p_lname = '" + lastName + "', " +
            "p_email = '" + emailText + "', " +
            "p_usertype = '" + selectedUserType + "', " +
            "p_username = '" + usernameText + "', " +
            "p_password = '" + passwordText + "', " +
            "p_pnumber = '" + phoneNumber + "', " +
            "p_passport = '" + passportNumber + "', " +
            "status = '" + selectedUserStatus + "' " +
            "WHERE p_id = " + idToUpdate;

    dbc.updateData(updateQuery);

    

    // Navigate back to AdminDashboard
    AdminDashboard adminDashboard = new AdminDashboard();
    adminDashboard.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_updateActionPerformed

    private void Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Delete1ActionPerformed

    private void CLEAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEAR1ActionPerformed
        
        getFn1().setText("");
    ln.setText("");
    email.setText("");
    UserType1.setSelectedIndex(0); 
    UserStatus.setSelectedIndex(0);
    username.setText("");
    password.setText("");
    phonenumber.setText("");
    passportnumber.setText("");
    }//GEN-LAST:event_CLEAR1ActionPerformed

    private void refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh1ActionPerformed
     
    createUserForm newForm = new createUserForm();
    newForm.setVisible(true);

    
    this.dispose();
    }//GEN-LAST:event_refresh1ActionPerformed

    private void userIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDActionPerformed

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
    private javax.swing.JButton CLEAR1;
    private javax.swing.JButton Delete1;
    public javax.swing.JComboBox<String> UserStatus;
    public javax.swing.JComboBox<String> UserType1;
    public javax.swing.JButton addacc;
    private javax.swing.JButton cancel;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField ln;
    private javax.swing.JPanel mainpanel;
    public javax.swing.JTextField passportnumber;
    public javax.swing.JPasswordField password;
    public javax.swing.JTextField phonenumber;
    private javax.swing.JButton refresh1;
    public javax.swing.JButton update;
    public javax.swing.JTextField userID;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
