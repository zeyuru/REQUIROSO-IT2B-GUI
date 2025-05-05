
package admin;

import config.Session;
import config.dbConnect;
import java.awt.Color;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class usersForm extends javax.swing.JFrame {

    
    public usersForm() {
        initComponents();
        displayData();
        
          Color hovercolor = new Color(200, 200, 200);
       setSize(950, 600);  
    setLocationRelativeTo(null); 
 
    setResizable(false); 
    
  
    this.addComponentListener(new java.awt.event.ComponentAdapter() {
        @Override
        public void componentMoved(java.awt.event.ComponentEvent evt) {
            setLocationRelativeTo(null);
        }
    });
    
    jButtonChangeStatus = new javax.swing.JButton();
jButtonChangeStatus.setText("Activate User");
jButtonChangeStatus.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonChangeStatusActionPerformed(evt);
    }
});
jPanel1.add(jButtonChangeStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, 150, 30));
    
    }
public void displayData(){
        try{
            dbConnect dbc = new dbConnect();
            try (ResultSet rs = dbc.getData("SELECT p_id, p_fname, p_lname, p_username, p_email, p_passport, p_pnumber, status FROM passengers")) {
                usersTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButtonChangeStatus = new javax.swing.JButton();
        btnSetPending = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        edit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        AddUser = new javax.swing.JLabel();
        print = new javax.swing.JPanel();
        p = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("PASSENGERS FORM");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, 50));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 380, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 470, 120));

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usersTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 730, 500));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setForeground(new java.awt.Color(51, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("CHANGE USER STATUS");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BACK");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 290, 30));

        jButtonChangeStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonChangeStatus.setText("Active");
        jButtonChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeStatusActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonChangeStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, 30));

        btnSetPending.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSetPending.setText("Pending");
        btnSetPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetPendingActionPerformed(evt);
            }
        });
        jPanel3.add(btnSetPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 90, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 490, 120));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edit.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("EDIT");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
        });
        jPanel6.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 120, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/admin/team.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -10, -1, -1));

        acc_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        acc_id.setForeground(new java.awt.Color(255, 255, 255));
        acc_id.setText("ID");
        jPanel4.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Current User: ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PASSENGERS");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 120, 60));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddUser.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        AddUser.setForeground(new java.awt.Color(255, 255, 255));
        AddUser.setText("ADD");
        AddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddUserMouseExited(evt);
            }
        });
        jPanel5.add(AddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 120, 70));

        print.setBackground(new java.awt.Color(153, 153, 153));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        p.setForeground(new java.awt.Color(255, 255, 255));
        p.setText("PRINT");
        p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pMouseEntered(evt);
            }
        });
        print.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel4.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 120, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 220, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       new AdminDashboard().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButtonChangeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeStatusActionPerformed
       int selectedRow = usersTable.getSelectedRow(); // Get selected row

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a user to activate!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String userId = usersTable.getValueAt(selectedRow, 0).toString(); 
    String currentStatus = usersTable.getValueAt(selectedRow, 7).toString(); 

    if ("Active".equalsIgnoreCase(currentStatus)) {
        JOptionPane.showMessageDialog(this, "User is already active!", "Info", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    String newStatus = "Active"; 
    dbConnect db = new dbConnect();
    String sql = "UPDATE passengers SET status = ? WHERE p_id = ?";

    try {
        PreparedStatement pstmt = db.connect.prepareStatement(sql);
        pstmt.setString(1, newStatus);
        pstmt.setString(2, userId);
        int updated = pstmt.executeUpdate();

        if (updated > 0) {
            JOptionPane.showMessageDialog(this, "User status updated successfully!");
            usersTable.setValueAt(newStatus, selectedRow, 7); 
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update status!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        pstmt.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButtonChangeStatusActionPerformed

    private void btnSetPendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetPendingActionPerformed
         dbConnect dbc = new dbConnect();

    int selectedRow = usersTable.getSelectedRow(); 
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a user to update!");
        return;
    }

    String userId = usersTable.getValueAt(selectedRow, 0).toString(); 
    String sql = "UPDATE passengers SET status = 'Pending' WHERE p_id = '" + userId + "'";

    try {
        int result = dbc.connect.createStatement().executeUpdate(sql);
        if (result > 0) {
            JOptionPane.showMessageDialog(this, "User status changed to Pending!");
            displayData(); 
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update status.");
        }
    } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnSetPendingActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session session = Session.getInstance();
    
    acc_id.setText("" + session.getUid());
    }//GEN-LAST:event_formWindowActivated

    private void AddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddUserMouseClicked
        createUserForm crf = new createUserForm();
               crf.setVisible(true);
        crf.remove.setEnabled(false); 
          crf.select.setEnabled(true); 
       this.dispose();
      
       
    }//GEN-LAST:event_AddUserMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowIndex = usersTable.getSelectedRow();

    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please Select an Item!");
    } else {
        createUserForm crf = new createUserForm();
        try {
            dbConnect db = new dbConnect();
            TableModel tbl = usersTable.getModel();
            int userId = (int) tbl.getValueAt(rowIndex, 0); // Get the userID from the first column

            ResultSet rs = db.getData("SELECT * FROM passengers WHERE p_id = " + userId); // Use parameter instead of string concatenation

            if (rs.next()) {
                crf.userID.setText(String.valueOf(userId)); // Set the userID text field

                crf.fn1.setText(rs.getString("p_fname"));
                crf.ln.setText(rs.getString("p_lname"));
                crf.email.setText(rs.getString("p_email"));
                crf.username.setText(rs.getString("p_username"));
                crf.password.setText(rs.getString("p_password"));
                crf.phonenumber.setText(rs.getString("p_pnumber"));
                crf.passportnumber.setText(rs.getString("p_passport"));
                crf.UserType1.setSelectedItem(rs.getString("p_usertype"));
                crf.UserStatus.setSelectedItem(rs.getString("status"));
                crf.image.setIcon(crf.ResizeImage(rs.getString("p_image"),null,crf.image));
                crf.oldpath = rs.getString("p_image");
                crf.path = rs.getString("p_image");
                crf.destination = rs.getString("p_image");
                crf.update.setEnabled(true);
                crf.addacc.setEnabled(false);
                crf.setVisible(true);
                
                if (rs.getString("p_image").isEmpty()){
                    crf.select.setEnabled(true);
                    crf.remove.setEnabled(false);
                       
                }else{
                    crf.select.setEnabled(false);
                    crf.remove.setEnabled(true);
                }
                
                
                this.dispose(); // Moved dispose after setVisible.
            } else {
                JOptionPane.showMessageDialog(null, "Record not found!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
        }
    }
 
    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        
    }//GEN-LAST:event_editMouseEntered

    private void AddUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddUserMouseEntered
        
        
    }//GEN-LAST:event_AddUserMouseEntered

    private void AddUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddUserMouseExited
       
    }//GEN-LAST:event_AddUserMouseExited

    private void pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pMouseClicked

    private void pMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pMouseEntered

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
          int rowIndex = usersTable.getSelectedRow();

    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(this, "Please select a user first!", 
                                    "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        dbConnect db = new dbConnect();
        TableModel tbl = usersTable.getModel();
        int userId = (int) tbl.getValueAt(rowIndex, 0);

        ResultSet rs = db.getData("SELECT * FROM passengers WHERE p_id = " + userId);

        if (rs.next()) {
            individualPrinting ipt = new individualPrinting();
            
            // Set user details
            ipt.uID.setText(String.valueOf(userId));
            ipt.fname.setText(rs.getString("p_fname"));
            ipt.lname.setText(rs.getString("p_lname"));
            ipt.username.setText(rs.getString("p_username"));
            ipt.email.setText(rs.getString("p_email"));
            ipt.phonenumber.setText(rs.getString("p_pnumber"));
            ipt.passport.setText(rs.getString("p_passport"));
            ipt.userType.setText(rs.getString("p_usertype"));  // Changed to setText
            ipt.status.setText(rs.getString("status"));        // Changed to setText
            
            // Show the form
            ipt.setVisible(true);
            
            // Optionally minimize the current window
            this.setExtendedState(JFrame.ICONIFIED);
        } else {
            JOptionPane.showMessageDialog(this, "User record not found!", 
                                       "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(),
                                   "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_printMouseClicked

    
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
            java.util.logging.Logger.getLogger(usersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddUser;
    private javax.swing.JLabel acc_id;
    private javax.swing.JButton btnSetPending;
    private javax.swing.JLabel edit;
    private javax.swing.JButton jButtonChangeStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel p;
    private javax.swing.JPanel print;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
