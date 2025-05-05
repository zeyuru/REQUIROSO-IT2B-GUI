/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;


import config.dbConnect;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Zeyuru
 */
public class FlightsForm extends javax.swing.JFrame {

     private dbConnect db;
       private int currentFlightId;
    
   
    public void setFlightId(int flightId) {
        this.currentFlightId = flightId;
    }
    
    public int getFlightId() {
        return this.currentFlightId;
    }
    
    public static String convertToSqlDateTime(String displayDateTime) throws ParseException {
    SimpleDateFormat displayFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
    SimpleDateFormat sqlFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    return sqlFormat.format(displayFormat.parse(displayDateTime));
}

// Convert SQL datetime to display format
public static String convertToDisplayDateTime(String sqlDateTime) throws ParseException {
    SimpleDateFormat displayFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
    SimpleDateFormat sqlFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    return displayFormat.format(sqlFormat.parse(sqlDateTime));
}
     
     
    public FlightsForm() {
        setLocationRelativeTo(null); 
 
    setResizable(false); 
    
    
    this.addComponentListener(new java.awt.event.ComponentAdapter() {
        @Override
        public void componentMoved(java.awt.event.ComponentEvent evt) {
            setLocationRelativeTo(null);
        }
    });
    
    
        
        initComponents();
      db = new dbConnect();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        FlightNumber = new javax.swing.JTextField();
        ArrivalAirport = new javax.swing.JTextField();
        ArrivalTime = new javax.swing.JTextField();
        DepartureAirport = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        DepartureTime = new javax.swing.JTextField();
        Capacity = new javax.swing.JTextField();
        Airline = new javax.swing.JTextField();
        Status = new javax.swing.JComboBox<>();
        clearFields = new javax.swing.JButton();
        addFlight = new javax.swing.JButton();
        updateFlight = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 2, 36)); // NOI18N
        jLabel1.setText("FLIGHTS FORM");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 280, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("STATUS");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 220, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("FLIGHT NUMBER");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 170, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("DEPARTURE AIRPORT");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 220, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("ARRIVAL AIRPORT");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 220, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("(YYYY-MM-DD HH:MM:SS) ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 170, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("ARRIVAL TIME");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 140, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("AIRLINE");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 220, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("CAPACITY");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 220, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("PRICE");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 220, -1));

        FlightNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightNumberActionPerformed(evt);
            }
        });
        jPanel3.add(FlightNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 210, 40));

        ArrivalAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArrivalAirportActionPerformed(evt);
            }
        });
        jPanel3.add(ArrivalAirport, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 210, 50));

        ArrivalTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArrivalTimeActionPerformed(evt);
            }
        });
        jPanel3.add(ArrivalTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 210, 50));

        DepartureAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartureAirportActionPerformed(evt);
            }
        });
        jPanel3.add(DepartureAirport, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 210, 50));

        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });
        jPanel3.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 210, 50));

        DepartureTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartureTimeActionPerformed(evt);
            }
        });
        jPanel3.add(DepartureTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 210, 50));

        Capacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapacityActionPerformed(evt);
            }
        });
        jPanel3.add(Capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 210, 50));

        Airline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineActionPerformed(evt);
            }
        });
        jPanel3.add(Airline, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 210, 50));

        Status.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scheduled", "Delayed" }));
        jPanel3.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 210, 50));

        clearFields.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clearFields.setText("CLEAR FIELDS");
        clearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldsActionPerformed(evt);
            }
        });
        jPanel3.add(clearFields, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 160, 50));

        addFlight.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addFlight.setText("ADD FLIGHT");
        addFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightActionPerformed(evt);
            }
        });
        jPanel3.add(addFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 150, 50));

        updateFlight.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateFlight.setText("UPDATE FLIGHT");
        updateFlight.setEnabled(false);
        updateFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFlightActionPerformed(evt);
            }
        });
        jPanel3.add(updateFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 150, 50));

        Back.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel3.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 100, 40));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("DEPARTURE TIME ");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 170, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("(YYYY-MM-DD HH:MM:SS) ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FlightNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FlightNumberActionPerformed

    private void ArrivalAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArrivalAirportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArrivalAirportActionPerformed

    private void ArrivalTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArrivalTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArrivalTimeActionPerformed

    private void DepartureAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartureAirportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartureAirportActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void DepartureTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartureTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartureTimeActionPerformed

    private void CapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CapacityActionPerformed

    private void AirlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AirlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AirlineActionPerformed

    private void clearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldsActionPerformed
         FlightNumber.setText("");
    DepartureAirport.setText("");
    ArrivalAirport.setText("");
    DepartureTime.setText("");
    ArrivalTime.setText("");
    Airline.setText("");
    Price.setText("");
    Capacity.setText("");
    Status.setSelectedIndex(0); // Reset to first item if it's a combobox
    }//GEN-LAST:event_clearFieldsActionPerformed

    private void updateFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateFlightActionPerformed
       try {
        String sql = "UPDATE flights SET " +
                   "flight_number = '" + FlightNumber.getText() + "', " +
                   "departure_airport = '" + DepartureAirport.getText() + "', " +
                   "arrival_airport = '" + ArrivalAirport.getText() + "', " +
                   "departure_time = '" + convertToSqlDateTime(DepartureTime.getText()) + "', " +
                   "arrival_time = '" + convertToSqlDateTime(ArrivalTime.getText()) + "', " +
                   "airline = '" + Airline.getText() + "', " +
                   "price = " + Price.getText() + ", " +
                   "capacity = " + Capacity.getText() + ", " +
                   "status = '" + Status.getSelectedItem() + "' " +
                   "WHERE flight_id = " + this.currentFlightId;
        
        db.updateData(sql);
        JOptionPane.showMessageDialog(this, "Flight updated successfully!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error updating flight: " + e.getMessage());
    }
    }//GEN-LAST:event_updateFlightActionPerformed

    private void addFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightActionPerformed
       try {
        // Validate inputs
        if (FlightNumber.getText().isEmpty() || 
            DepartureAirport.getText().isEmpty() ||
            ArrivalAirport.getText().isEmpty() ||
            DepartureTime.getText().isEmpty() ||
            ArrivalTime.getText().isEmpty() ||
            Airline.getText().isEmpty() ||
            Price.getText().isEmpty() ||
            Capacity.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "All fields are required!", 
                    "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create SQL query
        String sql = "INSERT INTO flights (flight_number, departure_airport, arrival_airport, " +
                     "departure_time, arrival_time, airline, price, capacity, status) " +
                     "VALUES ('" + FlightNumber.getText() + "', " +
                     "'" + DepartureAirport.getText() + "', " +
                     "'" + ArrivalAirport.getText() + "', " +
                     "'" + DepartureTime.getText() + "', " +
                     "'" + ArrivalTime.getText() + "', " +
                     "'" + Airline.getText() + "', " +
                     Price.getText() + ", " +
                     Capacity.getText() + ", " +
                     "'" + (String)Status.getSelectedItem() + "')";

        // Execute query using your dbConnect class
        int result = db.insertData(sql);
        
        if (result == 1) {
            JOptionPane.showMessageDialog(this, "Flight added successfully!", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            // Removed the clearFields() call here
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add flight", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Price and Capacity must be numbers!", 
                "Validation Error", JOptionPane.ERROR_MESSAGE);
    }
       
       new FlightsInformation().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_addFlightActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
    new FlightsInformation().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(FlightsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Airline;
    public javax.swing.JTextField ArrivalAirport;
    public javax.swing.JTextField ArrivalTime;
    private javax.swing.JButton Back;
    public javax.swing.JTextField Capacity;
    public javax.swing.JTextField DepartureAirport;
    public javax.swing.JTextField DepartureTime;
    public javax.swing.JTextField FlightNumber;
    public javax.swing.JTextField Price;
    public javax.swing.JComboBox<String> Status;
    public javax.swing.JButton addFlight;
    public javax.swing.JButton clearFields;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JButton updateFlight;
    // End of variables declaration//GEN-END:variables
}
