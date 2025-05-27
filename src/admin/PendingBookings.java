
package admin;

import config.dbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PendingBookings extends javax.swing.JFrame {

   
    public PendingBookings() {
        initComponents();
         loadPendingBookings();
        
         
           
          setLocationRelativeTo(null); 
 
    setResizable(false); 
         
         this.addComponentListener(new java.awt.event.ComponentAdapter() {
        @Override
        public void componentMoved(java.awt.event.ComponentEvent evt) {
            setLocationRelativeTo(null);
        }
    });
    }

    
    public void loadPendingBookings() {
    try {
        dbConnect dbc = new dbConnect();
        String query = "SELECT b.booking_id, p.p_fname, p.p_lname, f.flight_number, b.booking_date " +
                       "FROM bookings b " +
                       "JOIN passengers p ON b.passenger_id = p.p_id " +
                       "JOIN flights f ON b.flight_id = f.flight_id " +
                       "WHERE b.status = 'Pending'";

        ResultSet rs = dbc.getData(query);
        DefaultTableModel model = new DefaultTableModel(new String[] {
            "Booking ID", "Passenger", "Flight", "Date"
        }, 0);

        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getInt("booking_id"),
                rs.getString("p_fname") + " " + rs.getString("p_lname"),
                rs.getString("flight_number"),
                rs.getString("booking_date")
            });
        }

        pendingBookings.setModel(model);
        dbc.connect.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error loading pending bookings:\n" + ex.getMessage());
    }
}

    
    private void updateBookingStatus(String status) {
    int selectedRow = pendingBookings.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a booking to " + status.toLowerCase(), "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int bookingId = (int) pendingBookings.getValueAt(selectedRow, 0);

    try {
        dbConnect dbc = new dbConnect();
        String updateQuery = "UPDATE bookings SET status = ? WHERE booking_id = ?";
        PreparedStatement pstmt = dbc.connect.prepareStatement(updateQuery);
        pstmt.setString(1, status);
        pstmt.setInt(2, bookingId);
        int updated = pstmt.executeUpdate();

        if (updated > 0) {
            JOptionPane.showMessageDialog(this, "Booking " + status.toLowerCase() + " successfully!");
            loadPendingBookings(); // Refresh
        }

        pstmt.close();
        dbc.connect.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error updating booking:\n" + ex.getMessage());
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingBookings = new javax.swing.JTable();
        Reject = new javax.swing.JButton();
        Accept1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PENDING BOOKINGS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 400, -1));

        back.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 80, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 100));

        pendingBookings.setBackground(new java.awt.Color(102, 204, 255));
        jScrollPane1.setViewportView(pendingBookings);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 850, 470));

        Reject.setText("Reject");
        Reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectActionPerformed(evt);
            }
        });
        jPanel1.add(Reject, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 120, 30));

        Accept1.setText("Accept");
        Accept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Accept1ActionPerformed(evt);
            }
        });
        jPanel1.add(Accept1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Accept1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Accept1ActionPerformed
       int selectedRow = pendingBookings.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a booking to accept.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int bookingId = (int) pendingBookings.getValueAt(selectedRow, 0);

    try {
        dbConnect dbc = new dbConnect();
        String updateQuery = "UPDATE bookings SET status = 'Accepted' WHERE booking_id = ?";
        PreparedStatement pstmt = dbc.connect.prepareStatement(updateQuery);
        pstmt.setInt(1, bookingId);
        int updated = pstmt.executeUpdate();

        if (updated > 0) {
            JOptionPane.showMessageDialog(this, "Booking accepted successfully.");
            loadPendingBookings(); // Refresh the table
        }

        pstmt.close();
        dbc.connect.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error accepting booking:\n" + ex.getMessage());
    }
    }//GEN-LAST:event_Accept1ActionPerformed

    private void RejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectActionPerformed
        int selectedRow = pendingBookings.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a booking to reject.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int bookingId = (int) pendingBookings.getValueAt(selectedRow, 0);

    try {
        dbConnect dbc = new dbConnect();
        String updateQuery = "UPDATE bookings SET status = 'Rejected' WHERE booking_id = ?";
        PreparedStatement pstmt = dbc.connect.prepareStatement(updateQuery);
        pstmt.setInt(1, bookingId);
        int updated = pstmt.executeUpdate();

        if (updated > 0) {
            JOptionPane.showMessageDialog(this, "Booking rejected.");
            loadPendingBookings(); // Refresh the table
        }

        pstmt.close();
        dbc.connect.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error rejecting booking:\n" + ex.getMessage());
    }

    }//GEN-LAST:event_RejectActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new AdminDashboard().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backActionPerformed

   
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
            java.util.logging.Logger.getLogger(PendingBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendingBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendingBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendingBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendingBookings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept1;
    private javax.swing.JButton Reject;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable pendingBookings;
    // End of variables declaration//GEN-END:variables
}
