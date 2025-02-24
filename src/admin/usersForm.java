
package admin;

import config.dbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class usersForm extends javax.swing.JFrame {

    
    public usersForm() {
        initComponents();
        displayData();
        
          
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnSetPending = new javax.swing.JButton();
        jButtonChangeStatus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERS FORM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 320, 50));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 470, 120));

        usersTable.setBackground(new java.awt.Color(102, 204, 255));
        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usersTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 950, 500));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setForeground(new java.awt.Color(51, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CHANGE USER STATUS");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        btnSetPending.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSetPending.setText("Pending");
        btnSetPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetPendingActionPerformed(evt);
            }
        });
        jPanel3.add(btnSetPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 90, 30));

        jButtonChangeStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonChangeStatus.setText("Active");
        jButtonChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeStatusActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonChangeStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BACK");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 490, 120));

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
    private javax.swing.JButton btnSetPending;
    private javax.swing.JButton jButtonChangeStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
