
package passenger;

import config.Session;
import config.dbConnect;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class MyBookings extends javax.swing.JFrame {

    
    public MyBookings() {
        initComponents();
        loadBookings(); 
        
         setLocationRelativeTo(null); 
  
    setResizable(false); 
    
   
    this.addComponentListener(new java.awt.event.ComponentAdapter() {
        @Override
        public void componentMoved(java.awt.event.ComponentEvent evt) {
            setLocationRelativeTo(null); 
        }
    });
        
    }

     private void loadBookings() {
        try {
            Session session = Session.getInstance();
            int passengerId = session.getUserId();

            if (passengerId <= 0) {
                JOptionPane.showMessageDialog(this,
                    "Please login to view your bookings",
                    "Not Logged In",
                    JOptionPane.WARNING_MESSAGE);
                this.dispose();
                return;
            }

            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Booking ID", "Flight Number", "Departure", "Arrival", "Date", "Status", "Reference"});
            myBookingsTable.setModel(model);

            dbConnect dbc = new dbConnect();
            String query = "SELECT b.booking_id, b.flight_id, b.passenger_id, f.flight_number, f.departure_airport, " +
                           "f.arrival_airport, b.booking_date, b.status " +
                           "FROM bookings b JOIN flights f ON b.flight_id = f.flight_id " +
                           "WHERE b.passenger_id = " + passengerId;

            ResultSet rs = dbc.getData(query);

            while (rs.next()) {
                int bookingId = rs.getInt("booking_id");
                String flightNumber = rs.getString("flight_number");
                String departure = rs.getString("departure_airport");
                String arrival = rs.getString("arrival_airport");
                Date bookingDate = rs.getDate("booking_date");
                String status = rs.getString("status");
                int flightId = rs.getInt("flight_id");
                int pId = rs.getInt("passenger_id");
                String reference = "FLT-" + flightId + "-" + pId;

                model.addRow(new Object[]{bookingId, flightNumber, departure, arrival, bookingDate, status, reference});
            }

            rs.close();
            dbc.connect.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                "Error loading bookings: " + ex.getMessage(),
                "Database Error",
                JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
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
        myBookingsTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setText("BOOKINGS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 220, -1));

        back.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 90, -1));

        myBookingsTable.setBackground(new java.awt.Color(102, 204, 255));
        myBookingsTable.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jScrollPane1.setViewportView(myBookingsTable);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        print.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel3.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 114, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
            int rowIndex = myBookingsTable.getSelectedRow();

    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(this, "Please select a booking first!",
                                      "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        dbConnect db = new dbConnect();
        TableModel tbl = myBookingsTable.getModel();
        int bookingId = (int) tbl.getValueAt(rowIndex, 0); // Assuming booking_id is column 0

        String query = "SELECT b.*, f.flight_number, f.departure_airport, f.arrival_airport " +
                       "FROM bookings b " +
                       "JOIN flights f ON b.flight_id = f.flight_id " +
                       "WHERE b.booking_id = " + bookingId;

        ResultSet rs = db.getData(query);

        if (rs.next()) {
            // Get all data
            String flightId = String.valueOf(rs.getInt("flight_id"));
            String flightNumber = rs.getString("flight_number");
            String departure = rs.getString("departure_airport");
            String arrival = rs.getString("arrival_airport");
            String bookingDate = rs.getString("booking_date");
            String status = rs.getString("status");
            String reference = "REF-" + rs.getInt("booking_id");

            // Open and populate MyBookingsPrinting
            MyBookingsPrinting printForm = new MyBookingsPrinting();
            printForm.fID.setText(flightId);
            printForm.flightnumber.setText(flightNumber);
            printForm.Departure.setText(departure);
            printForm.arrival.setText(arrival);
            printForm.Date.setText(bookingDate);
            printForm.status.setText(status);
            printForm.reference.setText(reference);

            printForm.setVisible(true);
            this.setExtendedState(JFrame.ICONIFIED); // Optional
        } else {
            JOptionPane.showMessageDialog(this, "Booking not found!",
                                          "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(),
                                      "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_printActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       new PassengerDashboard().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(MyBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyBookings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable myBookingsTable;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
