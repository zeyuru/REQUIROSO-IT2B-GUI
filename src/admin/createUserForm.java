
package admin;

import config.dbConnect;
import config.passwordHasher;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
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
        CLEAR1 = new javax.swing.JButton();
        refresh1 = new javax.swing.JButton();
        Delete2 = new javax.swing.JButton();
        UserType1 = new javax.swing.JComboBox<>();
        fn1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        UserStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        userID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        select = new javax.swing.JButton();
        SecQuestion = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        SecAnswer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setBackground(new java.awt.Color(153, 153, 153));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Phone Number:");
        mainpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Password:");
        mainpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        passportnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passportnumberActionPerformed(evt);
            }
        });
        mainpanel.add(passportnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 170, 30));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Email:");
        mainpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        mainpanel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 170, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Status:");
        mainpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setText("Last Name:");
        mainpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        mainpanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 170, 30));

        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        mainpanel.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 170, 30));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        mainpanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 170, 30));

        phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberActionPerformed(evt);
            }
        });
        mainpanel.add(phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 170, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Security Questions:");
        mainpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
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

        Delete2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Delete2.setText("DELETE");
        Delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete2ActionPerformed(evt);
            }
        });
        jPanel2.add(Delete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 160, 50));

        mainpanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 140));

        UserType1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Type", "Admin", "Passenger" }));
        UserType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserType1ActionPerformed(evt);
            }
        });
        mainpanel.add(UserType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 170, 30));

        fn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fn1ActionPerformed(evt);
            }
        });
        mainpanel.add(fn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 170, 30));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("First Name:");
        mainpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        UserStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        UserStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserStatusActionPerformed(evt);
            }
        });
        mainpanel.add(UserStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 170, 30));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("USER ID:");
        mainpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, -1));

        userID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userID.setEnabled(false);
        userID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDActionPerformed(evt);
            }
        });
        mainpanel.add(userID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 100, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setText("Username:");
        mainpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setText("User Type:");
        mainpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);
        jPanel1.add(image);
        image.setBounds(20, 10, 270, 220);

        mainpanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 310, 250));

        remove.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        mainpanel.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 150, 50));

        select.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        select.setText("SELECT");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        mainpanel.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 130, 50));

        SecQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What city were you born in? ", "What's your mother's maiden name?", "What was your first pet's name?", " " }));
        mainpanel.add(SecQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 200, 40));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Passport Number:");
        mainpanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        SecAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecAnswerActionPerformed(evt);
            }
        });
        mainpanel.add(SecAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 719, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    
    private String escapeSql(String input) {
    if (input == null) return "";
    return input.replace("'", "''");
}
    
    
    private void addaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addaccActionPerformed
       dbConnect dbc = new dbConnect();

    String firstName = fn1.getText().trim();
    String lastName = ln.getText().trim();
    String emailText = email.getText().trim();
    String selectedUserType = (String) UserType1.getSelectedItem();
    String selectedUserStatus = (String) UserStatus.getSelectedItem();
    String usernameText = username.getText().trim();
    String passwordText = password.getText();
    String phoneNumber = phonenumber.getText().trim();
    String passportNumber = passportnumber.getText().trim();
    String imagePathText = destination;
    
    // Add security question fields (you'll need to add these components to your form)
    String securityQuestion = (String) SecQuestion.getSelectedItem(); // JComboBox
    String securityAnswer = SecAnswer.getText().trim(); // JTextField

    // Validation - add security question checks
    if (firstName.isEmpty() || lastName.isEmpty() || emailText.isEmpty() || 
        usernameText.isEmpty() || passwordText.isEmpty() || phoneNumber.isEmpty() || 
        passportNumber.isEmpty() || selectedUserType == null || selectedUserStatus == null || 
        selectedUserType.equals("Select User Type") || selectedUserStatus.equals("Select User Status") ||
        securityQuestion == null || securityQuestion.isEmpty() || securityAnswer.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all fields including security question!");
        return;
    }

    try {
        String hashedPassword = passwordHasher.hashPassword(passwordText);
        String hashedAnswer = passwordHasher.hashPassword(securityAnswer.toLowerCase());

        if (userID.getText().trim().isEmpty()) {
            // Handle image upload for new user
            if (selectedFile != null) {
                try {
                    Path sourcePath = selectedFile.toPath();
                    Path destinationPath = Paths.get(destination);
                    Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error saving image: " + ex.getMessage());
                    ex.printStackTrace();
                    imagePathText = "";
                }
            }

            // Insert new user with security question
            String insertQuery = "INSERT INTO passengers (p_fname, p_lname, p_email, p_usertype, " +
                               "p_username, p_password, p_pnumber, p_passport, status, p_image, " +
                               "security_question, security_answer) " +
                               "VALUES ('" + escapeSql(firstName) + "', " +
                               "'" + escapeSql(lastName) + "', " +
                               "'" + escapeSql(emailText) + "', " +
                               "'" + escapeSql(selectedUserType) + "', " +
                               "'" + escapeSql(usernameText) + "', " +
                               "'" + escapeSql(hashedPassword) + "', " +
                               "'" + escapeSql(phoneNumber) + "', " +
                               "'" + escapeSql(passportNumber) + "', " +
                               "'" + escapeSql(selectedUserStatus) + "', " +
                               "'" + escapeSql(imagePathText) + "', " +
                               "'" + escapeSql(securityQuestion) + "', " +
                               "'" + escapeSql(hashedAnswer) + "')";

            dbc.insertData(insertQuery);
            JOptionPane.showMessageDialog(null, "Account added successfully!");
        } else {
            // Update existing user
            int idToUpdate;
            try {
                idToUpdate = Integer.parseInt(userID.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid User ID!");
                return;
            }

            String updateQuery = "UPDATE passengers SET " +
                               "p_fname = '" + escapeSql(firstName) + "', " +
                               "p_lname = '" + escapeSql(lastName) + "', " +
                               "p_email = '" + escapeSql(emailText) + "', " +
                               "p_usertype = '" + escapeSql(selectedUserType) + "', " +
                               "p_username = '" + escapeSql(usernameText) + "', " +
                               "p_password = '" + escapeSql(hashedPassword) + "', " +
                               "p_pnumber = '" + escapeSql(phoneNumber) + "', " +
                               "p_passport = '" + escapeSql(passportNumber) + "', " +
                               "status = '" + escapeSql(selectedUserStatus) + "', " +
                               "p_image = '" + escapeSql(imagePathText) + "', " +
                               "security_question = '" + escapeSql(securityQuestion) + "', " +
                               "security_answer = '" + escapeSql(hashedAnswer) + "' " +
                               "WHERE p_id = " + idToUpdate;

            dbc.updateData(updateQuery);
            JOptionPane.showMessageDialog(null, "Account updated successfully!");
        }
        this.dispose();
    } catch (NoSuchAlgorithmException e) {
        JOptionPane.showMessageDialog(null, "Error hashing password: " + e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
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

        String imagePathText = destination; // Get the current destination path

        // If the user removed the image (destination is empty), set p_image to an empty string
        String updateQuery;
        if (destination.isEmpty()) {
            updateQuery = "UPDATE passengers SET " +
                          "p_fname = '" + firstName + "', " +
                          "p_lname = '" + lastName + "', " +
                          "p_email = '" + emailText + "', " +
                          "p_usertype = '" + selectedUserType + "', " +
                          "p_username = '" + usernameText + "', " +
                          "p_password = '" + passwordText + "', " +
                          "p_pnumber = '" + phoneNumber + "', " +
                          "p_passport = '" + passportNumber + "', " +
                          "status = '" + selectedUserStatus + "', " +
                          "p_image = '' " + // Set to empty string
                          "WHERE p_id = " + idToUpdate;
        } else {
            // If a new image was selected or the old one was kept
            if (selectedFile != null) {
                try {
                    Path sourcePath = selectedFile.toPath();
                    Path destinationPath = Paths.get(destination);
                    Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error saving image: " + ex.getMessage());
                    ex.printStackTrace();
                    imagePathText = oldpath; // Revert to old path on error
                }
            } else {
                imagePathText = oldpath; // Keep the old image path if no new image selected
            }

            updateQuery = "UPDATE passengers SET " +
                          "p_fname = '" + firstName + "', " +
                          "p_lname = '" + lastName + "', " +
                          "p_email = '" + emailText + "', " +
                          "p_usertype = '" + selectedUserType + "', " +
                          "p_username = '" + usernameText + "', " +
                          "p_password = '" + passwordText + "', " +
                          "p_pnumber = '" + phoneNumber + "', " +
                          "p_passport = '" + passportNumber + "', " +
                          "status = '" + selectedUserStatus + "', " +
                          "p_image = '" + imagePathText + "' " +
                          "WHERE p_id = " + idToUpdate;
        }

        dbc.updateData(updateQuery);

        // Navigate back to AdminDashboard
         usersForm uf = new usersForm();
        uf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
     remove.setEnabled(false);
     select.setEnabled(true);
     image.setIcon(null);
     destination = "";
     path = "";
    }//GEN-LAST:event_removeActionPerformed

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

    private void Delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Delete2ActionPerformed

    
    public String destination = "";
    File selectedFile;
    
    public String oldpath;
    public String path;
   public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/userimages", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }

   
  public ImageIcon ResizeImage(String imgPath, byte[] BLOBimage, JLabel label) {
    if (imgPath == null || imgPath.isEmpty()) {
        // Return default image when no image is set
        return new ImageIcon(getClass().getResource("/path/to/default/avatar.png"));
    }
    
    try {
        ImageIcon MyImage;
        if (BLOBimage != null) {
            MyImage = new ImageIcon(BLOBimage);
        } else {
            MyImage = new ImageIcon(imgPath);
        }
        
        Image img = MyImage.getImage();
        Image img2 = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(img2);
    } catch (Exception e) {
        // Fallback to default image if there's an error
        return new ImageIcon(getClass().getResource("/path/to/default/avatar.png"));
    }
}
   
   public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
   
    public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }

   
    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
       JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/userimages/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            select.setEnabled(false);
                            remove.setEnabled(true);
                            
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
    }//GEN-LAST:event_selectActionPerformed
    }
    private void SecAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecAnswerActionPerformed
    
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
    private javax.swing.JButton Delete2;
    public javax.swing.JTextField SecAnswer;
    public javax.swing.JComboBox<String> SecQuestion;
    public javax.swing.JComboBox<String> UserStatus;
    public javax.swing.JComboBox<String> UserType1;
    public javax.swing.JButton addacc;
    private javax.swing.JButton cancel;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fn1;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField ln;
    private javax.swing.JPanel mainpanel;
    public javax.swing.JTextField passportnumber;
    public javax.swing.JPasswordField password;
    public javax.swing.JTextField phonenumber;
    private javax.swing.JButton refresh1;
    public javax.swing.JButton remove;
    public javax.swing.JButton select;
    public javax.swing.JButton update;
    public javax.swing.JTextField userID;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
