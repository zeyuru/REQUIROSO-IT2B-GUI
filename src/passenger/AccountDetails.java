
package passenger;

import config.Session;
import config.dbConnect;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AccountDetails extends javax.swing.JFrame {

    
    public AccountDetails() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        backSettings = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        accUser = new javax.swing.JLabel();
        userID = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        changePassword = new javax.swing.JButton();
        OldPass1 = new javax.swing.JPasswordField();
        newPass1 = new javax.swing.JPasswordField();
        confirmPass = new javax.swing.JPasswordField();
        cancelPass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backSettings.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        backSettings.setForeground(new java.awt.Color(255, 255, 255));
        backSettings.setText("BACK");
        backSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backSettingsMouseClicked(evt);
            }
        });
        jPanel2.add(backSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 80, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/airplane-1632598_1280.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -220, 1420, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 1040, 100));

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/bigman.png"))); // NOI18N
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 120));

        accUser.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        accUser.setForeground(new java.awt.Color(255, 255, 255));
        accUser.setText("User");
        jPanel3.add(accUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 130, 40));

        userID.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        userID.setForeground(new java.awt.Color(255, 255, 255));
        userID.setText("ID");
        jPanel3.add(userID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("USER");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User ID");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 680));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setText("CHANGE PASSWORD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Confirm Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Type Old Password:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Enter New Password:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, 30));

        changePassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        changePassword.setText("Change Password");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });
        jPanel1.add(changePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 170, 40));
        jPanel1.add(OldPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 240, 50));
        jPanel1.add(newPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 240, 50));

        confirmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPassActionPerformed(evt);
            }
        });
        jPanel1.add(confirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 240, 50));

        cancelPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelPass.setText("CANCEL");
        cancelPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPassActionPerformed(evt);
            }
        });
        jPanel1.add(cancelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session session = Session.getInstance();
    
    accUser.setText("" + session.getFname());
    
     
    
    userID.setText("" + session.getUid());
    }//GEN-LAST:event_formWindowActivated

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2AncestorAdded

    private void backSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backSettingsMouseClicked
       new PassengerDashboard().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backSettingsMouseClicked

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        String oldPassword = OldPass1.getText();
        String newPassword = newPass1.getText();
        String confirmPassword = confirmPass.getText();

        if (oldPassword.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "New password and confirm password do not match.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Session session = Session.getInstance();
        String userId = session.getUid();

        dbConnect db = new dbConnect();
        String query = "SELECT p_password FROM passengers WHERE p_id = ?";

        try {
            PreparedStatement pstmt = db.connect.prepareStatement(query);
            pstmt.setString(1, userId);
            java.sql.ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String storedHashedPassword = rs.getString("p_password");
                String enteredOldPasswordHash = passwordHasher.hashPassword(oldPassword);

                if (storedHashedPassword.equals(enteredOldPasswordHash)) {
                    String newHashedPassword = passwordHasher.hashPassword(newPassword);
                    String updateQuery = "UPDATE passengers SET p_password = ? WHERE p_id = ?";
                    PreparedStatement updatePstmt = db.connect.prepareStatement(updateQuery);
                    updatePstmt.setString(1, newHashedPassword);
                    updatePstmt.setString(2, userId);
                    updatePstmt.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Password changed successfully.");
                    OldPass1.setText("");
                    newPass1.setText("");
                    confirmPass.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect old password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            rs.close();
            pstmt.close();
        } catch (SQLException | NoSuchAlgorithmException e) {
            JOptionPane.showMessageDialog(this, "Error changing password: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_changePasswordActionPerformed

    private void confirmPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPassActionPerformed

    private void cancelPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPassActionPerformed
       new PassengerDashboard().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_cancelPassActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField OldPass1;
    private javax.swing.JLabel accUser;
    private javax.swing.JLabel backSettings;
    private javax.swing.JButton cancelPass;
    private javax.swing.JButton changePassword;
    private javax.swing.JPasswordField confirmPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField newPass1;
    private javax.swing.JLabel userID;
    // End of variables declaration//GEN-END:variables
}
