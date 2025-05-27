
package passenger;

import config.ActivityLogger;
import config.Session;
import config.dbConnect;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mygui.loginForm;
import net.proteanit.sql.DbUtils;


public class PassengerDashboard extends javax.swing.JFrame {

    
    public PassengerDashboard() {
        initComponents();
        
           BookFlight.setBackground(new Color(102, 204, 255));
    BookFlight.setForeground(Color.BLACK);
    
      myBookings.setBackground(new Color(102, 204, 255));
   myBookings.setForeground(Color.BLACK);
    logout.setBackground(new Color(102, 204, 255));
   logout.setForeground(Color.BLACK);
    
     setSize(1115, 600);  
    setLocationRelativeTo(null); 
 
    setResizable(false); 
     initializeFlightsTable();
        
        // Load flights data when dashboard opens
        loadFlightsData();
        
  
    this.addComponentListener(new java.awt.event.ComponentAdapter() {
        @Override
        public void componentMoved(java.awt.event.ComponentEvent evt) {
            setLocationRelativeTo(null);
        }
    });
    
    }

         private void initializeFlightsTable() {
        // Define column names matching your database structure
        String[] columnNames = {
            "Flight ID", "Flight Number", "Departure Airport", "Arrival Airport",
            "Departure Time", "Arrival Time", "Airline", "Capacity", "Price", "Status"
        };
        
        // Create a non-editable table model
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        };
        
        availableFlights.setModel(model);
        
        // Set preferred column widths
        availableFlights.getColumnModel().getColumn(0).setPreferredWidth(60);  // Flight ID
        availableFlights.getColumnModel().getColumn(1).setPreferredWidth(100); // Flight Number
        availableFlights.getColumnModel().getColumn(2).setPreferredWidth(120); // Departure Airport
        availableFlights.getColumnModel().getColumn(3).setPreferredWidth(120); // Arrival Airport
        availableFlights.getColumnModel().getColumn(4).setPreferredWidth(150); // Departure Time
        availableFlights.getColumnModel().getColumn(5).setPreferredWidth(150); // Arrival Time
        availableFlights.getColumnModel().getColumn(6).setPreferredWidth(120); // Airline
        availableFlights.getColumnModel().getColumn(7).setPreferredWidth(70);  // Capacity
        availableFlights.getColumnModel().getColumn(8).setPreferredWidth(80);  // Price
        availableFlights.getColumnModel().getColumn(9).setPreferredWidth(100); // Status
    }
    
         
         private void loadFlightsData() {
         DefaultTableModel model = (DefaultTableModel) availableFlights.getModel();
    model.setRowCount(0); // Clear existing data
    
    dbConnect dbc = null;
    ResultSet rs = null;
    
    try {
        dbc = new dbConnect();
        // Query to get available flights (status = 'Scheduled')
        String query = "SELECT flight_id, flight_number, departure_airport, " +
                     "arrival_airport, departure_time, arrival_time, airline, " +
                     "capacity, price, status FROM flights WHERE status = 'Scheduled'";
        
        rs = dbc.getData(query);
        
        // Populate table with data
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("flight_id"),            // 0 - as Integer
                rs.getString("flight_number"),     // 1
                rs.getString("departure_airport"), // 2
                rs.getString("arrival_airport"),   // 3
                rs.getTimestamp("departure_time").toString().replace(".0", ""), // 4
                rs.getTimestamp("arrival_time").toString().replace(".0", ""),   // 5
                rs.getString("airline"),           // 6
                             // 7 - as raw Integer
                rs.getInt("capacity"), 
                 rs.getInt("price"),  // 8 - as Integer
                rs.getString("status")             // 9
            });
        }
        
        // Set column widths if needed
        availableFlights.getColumnModel().getColumn(7).setPreferredWidth(80);  // Price column
        availableFlights.getColumnModel().getColumn(8).setPreferredWidth(80);  // Capacity column
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this,
            "Error loading flight data: " + ex.getMessage(),
            "Database Error",
            JOptionPane.ERROR_MESSAGE);
        System.err.println("Database error: " + ex.getMessage());
        ex.printStackTrace();
    } finally {
        // Close resources
        try {
            if (rs != null) rs.close();
            if (dbc != null) dbc.connect.close();
        } catch (SQLException ex) {
            System.err.println("Error closing resources: " + ex.getMessage());
        }
    }
    
    // Show message if no flights found
    if (model.getRowCount() == 0) {
        JOptionPane.showMessageDialog(this, 
            "No available flights found.", 
            "Information", 
            JOptionPane.INFORMATION_MESSAGE);
    }
    }
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        accName = new javax.swing.JLabel();
        accSettings = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BookFlight = new javax.swing.JButton();
        myBookings = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableFlights = new javax.swing.JTable();
        logout = new javax.swing.JButton();

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

        accName.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        accName.setForeground(new java.awt.Color(255, 255, 255));
        accName.setText("User ");
        jPanel2.add(accName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 120, 40));

        accSettings.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        accSettings.setText("Settings");
        accSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accSettingsMouseClicked(evt);
            }
        });
        jPanel2.add(accSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/man.png"))); // NOI18N
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagefolder/airplane-1632598_1280.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -220, 1420, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 1040, 100));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setText("Book a Flight");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel5.setText(" See our routes and schedules, and discover more about the experience you can look forward to on board.");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel6.setText("Search for Matrix flights and book online. ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, 40));

        BookFlight.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BookFlight.setText("BOOK FLIGHT");
        BookFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookFlightActionPerformed(evt);
            }
        });
        jPanel3.add(BookFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        myBookings.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        myBookings.setText("MY BOOKINGS");
        myBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myBookingsActionPerformed(evt);
            }
        });
        jPanel3.add(myBookings, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 140, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 1110, 150));

        availableFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(availableFlights);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1110, 360));

        logout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logout.setText("EXIT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 90, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Session session = Session.getInstance();
    
    accName.setText("" + session.getFname());
    }//GEN-LAST:event_formWindowActivated

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2AncestorAdded

    private void accSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accSettingsMouseClicked
        new AccountDetails().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_accSettingsMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       ActivityLogger.logLogout(Session.getInstance().getPId(), "PASSENGER");
        
        new loginForm().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void BookFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookFlightActionPerformed
         int selectedRow = availableFlights.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a flight to book first", "No Flight Selected", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        // Get selected flight details
        int flightId = (int) availableFlights.getValueAt(selectedRow, 0);
        String flightNumber = availableFlights.getValueAt(selectedRow, 1).toString();
        String departure = availableFlights.getValueAt(selectedRow, 2).toString();
        String arrival = availableFlights.getValueAt(selectedRow, 3).toString();
        int capacity = (int) availableFlights.getValueAt(selectedRow, 7);
        int price = (int) availableFlights.getValueAt(selectedRow, 8);

        if (capacity <= 0) {
            JOptionPane.showMessageDialog(this, "This flight is fully booked", "No Capacity", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Session session = Session.getInstance();
        int passengerId = session.getUserId();

        if (passengerId <= 0) {
            JOptionPane.showMessageDialog(this, "Session expired or invalid user. Please log in again.", "Session Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if passenger exists
        dbConnect dbc = new dbConnect();
        ResultSet rs = dbc.getData("SELECT COUNT(*) FROM passengers WHERE p_id = " + passengerId);
        rs.next();
        int count = rs.getInt(1);
        rs.close();

        if (count == 0) {
            JOptionPane.showMessageDialog(this, "Your account is not properly registered in our system", "Account Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if a booking already exists (excluding rejected)
        String checkBookingQuery = "SELECT COUNT(*) FROM bookings WHERE passenger_id = ? AND flight_id = ? AND status != 'Rejected'";
        PreparedStatement checkStmt = dbc.connect.prepareStatement(checkBookingQuery);
        checkStmt.setInt(1, passengerId);
        checkStmt.setInt(2, flightId);
        ResultSet checkRs = checkStmt.executeQuery();
        checkRs.next();
        int existingBookings = checkRs.getInt(1);
        checkRs.close();
        checkStmt.close();

        if (existingBookings > 0) {
            JOptionPane.showMessageDialog(this, "You have already booked this flight. Cannot rebook unless the previous booking was rejected.", "Duplicate Booking", JOptionPane.WARNING_MESSAGE);
            dbc.connect.close();
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Confirm booking for:\n\n" +
                        "Flight: " + flightNumber + "\n" +
                        "Route: " + departure + " to " + arrival + "\n" +
                        "Price: " + price + "\n\n" +
                        "Do you want to proceed?",
                "Confirm Flight Booking",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            // Prompt for payment
            String paymentInput = JOptionPane.showInputDialog(this,
                    "Enter payment amount (Ticket Price: " + price + "):", "Payment", JOptionPane.PLAIN_MESSAGE);

            if (paymentInput == null || paymentInput.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Payment cancelled.", "Cancelled", JOptionPane.WARNING_MESSAGE);
                dbc.connect.close();
                return;
            }

            try {
                double payment = Double.parseDouble(paymentInput);

                if (payment < price) {
                    JOptionPane.showMessageDialog(this, "Insufficient payment. You need at least " + price + ".", "Payment Error", JOptionPane.ERROR_MESSAGE);
                    dbc.connect.close();
                    return;
                }

                // Optional: Calculate and show change
                double change = payment - price;

                // Insert booking
                String insertQuery = "INSERT INTO bookings (passenger_id, flight_id, booking_date, status) " +
                        "VALUES (?, ?, NOW(), 'Pending')";
                PreparedStatement pstmt = dbc.connect.prepareStatement(insertQuery);
                pstmt.setInt(1, passengerId);
                pstmt.setInt(2, flightId);
                int result = pstmt.executeUpdate();

                if (result == 1) {
                    // Update flight capacity
                    String updateQuery = "UPDATE flights SET capacity = capacity - 1 WHERE flight_id = ? AND capacity > 0";
                    PreparedStatement pstmt2 = dbc.connect.prepareStatement(updateQuery);
                    pstmt2.setInt(1, flightId);
                    pstmt2.executeUpdate();

                    loadFlightsData(); // Refresh table

                    JOptionPane.showMessageDialog(this,
                            "Booking confirmed!\n\n" +
                                    "Flight: " + flightNumber + "\n" +
                                    "Reference: FLT-" + flightId + "-" + passengerId + "\n" +
                                    "Amount Paid: " + payment + "\n" +
                                    (change > 0 ? "Change: " + change + "\n" : ""),
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                pstmt.close();

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Invalid payment input. Please enter a numeric value.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        dbc.connect.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error processing booking:\n" + ex.getMessage(), "Booking Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Unexpected error:\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_BookFlightActionPerformed

    private void myBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myBookingsActionPerformed
        new MyBookings().setVisible(true);
    }//GEN-LAST:event_myBookingsActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassengerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookFlight;
    private javax.swing.JLabel accName;
    private javax.swing.JLabel accSettings;
    public javax.swing.JTable availableFlights;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton myBookings;
    // End of variables declaration//GEN-END:variables
}
