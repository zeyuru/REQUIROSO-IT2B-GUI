
package admin;

import config.dbConnect;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class FlightsInformation extends javax.swing.JFrame {

   
    public FlightsInformation() {
        
        setLocationRelativeTo(null); 
 
    setResizable(false); 
    
    
    this.addComponentListener(new java.awt.event.ComponentAdapter() {
        @Override
        public void componentMoved(java.awt.event.ComponentEvent evt) {
            setLocationRelativeTo(null);
        }
    });
    
    
        initComponents();
        displayData();
    }

     public void displayData(){
        try{
            dbConnect dbc = new dbConnect();
            ResultSet rs = dbc.getData("SELECT * FROM flights");
            FlightsTable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
        
    
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        DeleteFlight = new javax.swing.JPanel();
        del = new javax.swing.JLabel();
        AddFlight = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        EditFlight = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FLIGHTS INFORMATION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        BackButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 80, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteFlightMouseClicked(evt);
            }
        });
        DeleteFlight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        del.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        del.setText("DELETE FLIGHT");
        DeleteFlight.add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 20));

        jPanel2.add(DeleteFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 140, 80));

        AddFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddFlightMouseClicked(evt);
            }
        });
        AddFlight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("ADD FLIGHT");
        AddFlight.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 20));

        jPanel2.add(AddFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 140, 90));

        EditFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditFlightMouseClicked(evt);
            }
        });
        EditFlight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("EDIT FLIGHT");
        EditFlight.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 20));

        jPanel2.add(EditFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 140, 80));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FLIGHTS");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        FlightsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(FlightsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddFlightMouseClicked
       new FlightsForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_AddFlightMouseClicked

    private void EditFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditFlightMouseClicked
         int rowIndex = FlightsTable.getSelectedRow();

    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select a flight first!");
    } else {
        FlightsForm flightsForm = new FlightsForm();
        try {
            dbConnect db = new dbConnect();
            TableModel tbl = FlightsTable.getModel();
            int flightId = (int) tbl.getValueAt(rowIndex, 0);

            ResultSet rs = db.getData("SELECT * FROM flights WHERE flight_id = " + flightId);

            if (rs.next()) {
                // Set basic fields
                flightsForm.setFlightId(flightId);
                flightsForm.FlightNumber.setText(rs.getString("flight_number"));
                flightsForm.DepartureAirport.setText(rs.getString("departure_airport"));
                flightsForm.ArrivalAirport.setText(rs.getString("arrival_airport"));
                flightsForm.Airline.setText(rs.getString("airline"));
                flightsForm.Price.setText(String.valueOf(rs.getInt("price")));
                flightsForm.Capacity.setText(String.valueOf(rs.getInt("capacity")));
                flightsForm.Status.setSelectedItem(rs.getString("status"));

                // Handle dates properly
                SimpleDateFormat displayFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
                
                // Convert SQL dates to display format
                java.sql.Timestamp departureTimestamp = rs.getTimestamp("departure_time");
                java.sql.Timestamp arrivalTimestamp = rs.getTimestamp("arrival_time");
                
                if (departureTimestamp != null) {
                    flightsForm.DepartureTime.setText(displayFormat.format(new Date(departureTimestamp.getTime())));
                }
                if (arrivalTimestamp != null) {
                    flightsForm.ArrivalTime.setText(displayFormat.format(new Date(arrivalTimestamp.getTime())));
                }

                // Set button states
                flightsForm.addFlight.setEnabled(false);
                flightsForm.updateFlight.setEnabled(true);
               
                
                flightsForm.setVisible(true);
                this.dispose();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
        }
    }
   
    }//GEN-LAST:event_EditFlightMouseClicked

    private void loadFlightsData() {
    try {
        dbConnect db = new dbConnect();
        ResultSet rs = db.getData("SELECT * FROM flights");
        
        // Clear existing table data
        DefaultTableModel model = (DefaultTableModel)FlightsTable.getModel();
        model.setRowCount(0);
        
        // Repopulate table
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("flight_id"),
                rs.getString("flight_number"),
                // Add other columns as needed
            });
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    
    
    
    private void DeleteFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteFlightMouseClicked
         int rowIndex = FlightsTable.getSelectedRow();
    
    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(this, "Please select a flight to delete", 
                                    "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Get the flight ID from the selected row (assuming first column contains ID)
    int flightId = (int)FlightsTable.getValueAt(rowIndex, 0);
    String flightNumber = (String)FlightsTable.getValueAt(rowIndex, 1); // Assuming second column is flight number
    
    // Confirmation dialog
    int confirm = JOptionPane.showConfirmDialog(
        this, 
        "Are you sure you want to delete Flight " + flightNumber + "?",
        "Confirm Deletion",
        JOptionPane.YES_NO_OPTION
    );
    
    if (confirm == JOptionPane.YES_OPTION) {
        try {
            dbConnect db = new dbConnect();
            String sql = "DELETE FROM flights WHERE flight_id = " + flightId;
            
            int result = db.insertData(sql); // Or use your updateData method
            
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Flight deleted successfully!");
                // Refresh your flights table/data
                loadFlightsData(); // You'll need to implement this method
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete flight", 
                                            "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error deleting flight: " + e.getMessage(),
                                        "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_DeleteFlightMouseClicked

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
       new AdminDashboard().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(FlightsInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightsInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightsInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightsInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightsInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddFlight;
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel DeleteFlight;
    private javax.swing.JPanel EditFlight;
    private javax.swing.JTable FlightsTable;
    private javax.swing.JLabel del;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
