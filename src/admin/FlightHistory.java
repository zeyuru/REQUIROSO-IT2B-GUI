
package admin;

import config.dbConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class FlightHistory extends javax.swing.JFrame {
private int passengerId;

   public FlightHistory(int passengerId) {
    this.passengerId = passengerId;
    initComponents();
    loadFlightHistory(passengerId); 
    
       
          setLocationRelativeTo(null); 
 
    setResizable(false); 
         
         this.addComponentListener(new java.awt.event.ComponentAdapter() {
        @Override
        public void componentMoved(java.awt.event.ComponentEvent evt) {
            setLocationRelativeTo(null);
        }
    });
    
}

  public static boolean hasFlightHistory(int passengerId) {
        boolean hasHistory = false;
        dbConnect db = new dbConnect();
        String sql = "SELECT 1 FROM bookings WHERE passenger_id = ? LIMIT 1";
        try {
            PreparedStatement ps = db.connect.prepareStatement(sql);
            ps.setInt(1, passengerId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                hasHistory = true;
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return hasHistory;
    }

    private void loadFlightHistory(int passengerId) {
        dbConnect db = new dbConnect();
        String sql = "SELECT b.booking_id, b.flight_id, b.booking_date, b.status " +
                     "FROM bookings b WHERE b.passenger_id = ?";
        try {
            PreparedStatement ps = db.connect.prepareStatement(sql);
            ps.setInt(1, passengerId);
            ResultSet rs = ps.executeQuery();

            if (!rs.isBeforeFirst()) { // no data found
                JOptionPane.showMessageDialog(this, "No flight history found for this user.");
                this.dispose();  // Close window since no data
            } else {
                UserFlightHistory.setModel(DbUtils.resultSetToTableModel(rs));
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error loading flight history: " + ex.getMessage());
        }
    }
    
    
     
     

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserFlightHistory = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER FLIGHT HISTORY");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 440, -1));

        Back.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 90));

        jScrollPane1.setViewportView(UserFlightHistory);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 770, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new usersForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackActionPerformed


    public static void main(String args[]) {
        int passengerId = 1; // your test ID
    if (FlightHistory.hasFlightHistory(passengerId)) {
        java.awt.EventQueue.invokeLater(() -> {
            new FlightHistory(passengerId).setVisible(true);
        });
    } else {
        JOptionPane.showMessageDialog(null, "No flight history found for this user.");
    }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new FlightHistory(passengerId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    public javax.swing.JTable UserFlightHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
