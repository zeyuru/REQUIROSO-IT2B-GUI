
package mygui;
import admin.AdminDashboard;
import passenger.PassengerDashboard;

import config.dbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class loginForm extends javax.swing.JFrame {

 
    public loginForm() {
        initComponents();
        
        jTextField2.setOpaque(false); 
jTextField2.setBackground(new java.awt.Color(0, 0, 0, 0)); 
jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2)); 
jTextField2.setForeground(new java.awt.Color(0, 0, 0)); 
jTextField2.setFont(new java.awt.Font("Verdana", java.awt.Font.BOLD, 14)); 

jPasswordField1.setOpaque(false);
jPasswordField1.setBackground(new java.awt.Color(0, 0, 0, 0));
jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2)); 
jPasswordField1.setForeground(new java.awt.Color(0, 0, 0)); 
jPasswordField1.setFont(new java.awt.Font("Verdana", java.awt.Font.BOLD, 14));

    
    setLocationRelativeTo(null); 
     setSize(950, 600);  
    setResizable(false); 
    
   
    this.addComponentListener(new java.awt.event.ComponentAdapter() {
        @Override
        public void componentMoved(java.awt.event.ComponentEvent evt) {
            setLocationRelativeTo(null); 
        }
    });
    
    }
     private String authenticateUser(String username, String password) {
        dbConnect db = new dbConnect(); 
        String userType = null;
        
       String query = "SELECT p_usertype, status FROM passengers WHERE p_username = ? AND p_password = ?";

    try {
        PreparedStatement pstmt = db.connect.prepareStatement(query);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) { 
            String status = rs.getString("status");
            if (status.equalsIgnoreCase("Active")) { 
                userType = rs.getString("p_usertype"); 
            } else { 
                userType = "Pending"; 
            }
        }

        rs.close();
        pstmt.close();
    } catch (SQLException e) {
        System.out.println("Database Error: " + e.getMessage());
    }

    return userType; 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        navigation = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navigation.setBackground(new java.awt.Color(0, 174, 239));
        navigation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/plane resized.png"))); // NOI18N
        navigation.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 650, 540));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/whitelogo.png"))); // NOI18N
        navigation.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -140, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/purp.png"))); // NOI18N
        navigation.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/Untitled_design__2_-removebg-preview.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        navigation.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 150, 510, 480));

        mainpanel.add(navigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 470, 630));

        jLabel1.setBackground(new java.awt.Color(25, 69, 215));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME TO MATRIX AIRLINES");
        jLabel1.setToolTipText("");
        mainpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 430, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        mainpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Username");
        mainpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        mainpanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 330, 50));

        jButton2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        mainpanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 80, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("New here? Click to Sign Up!");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        mainpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, -1));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        mainpanel.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 330, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/gplayappstore.png"))); // NOI18N
        mainpanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, -1, -1));
        mainpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/icons.png"))); // NOI18N
        mainpanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CONNECT WITH US");
        mainpanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/purp.png"))); // NOI18N
        mainpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
         String username = jTextField2.getText(); 
    String password = new String(jPasswordField1.getPassword()); 

    String userType = authenticateUser(username, password); 

    if (userType == null) { 
       
        JOptionPane.showMessageDialog(this, "Invalid username or password!", "Login Failed", JOptionPane.ERROR_MESSAGE);
    } else if (userType.equals("Pending")) { 
       
        JOptionPane.showMessageDialog(this, "Your account is not yet activated. Please wait for approval.");
    } else { 
        
        if (userType.equals("Admin")) {
            JOptionPane.showMessageDialog(this, "Login Successful! Redirecting to Admin Dashboard.");
            new AdminDashboard().setVisible(true);
        } else if (userType.equals("Passenger")) {
            JOptionPane.showMessageDialog(this, "Login Successful! Redirecting to Passenger Dashboard.");
            new PassengerDashboard().setVisible(true);
        }
        this.dispose(); 
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       
       
        registrationForm rfm = new registrationForm();
        rfm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JPanel navigation;
    // End of variables declaration//GEN-END:variables
}
