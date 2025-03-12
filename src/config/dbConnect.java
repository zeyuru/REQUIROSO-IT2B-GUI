
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class dbConnect {
    
    public Connection connect;

       // constructor to connect to our database
        public dbConnect(){
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/flightdb", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
    
    //Function to save data
        public int insertData(String sql){
            int result;
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                pst.executeUpdate();
                System.out.println("Inserted Successfully!");
                pst.close();
                result =1;
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
                result =0;
            }
            return result;
        }

  
    //Function to retrieve data
        public ResultSet getData(String sql) throws SQLException{
            Statement stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        }
        
     // Function to check for duplicate values in the database
public boolean checkDuplicate(String table, String column, String value) {
    boolean exists = false;
    String query = "SELECT COUNT(*) FROM " + table + " WHERE " + column + " = ?";

    try {
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setString(1, value);
        ResultSet rs = pst.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) {
            exists = true;  // Record found, meaning a duplicate exists
        }

        rs.close();
        pst.close();
    } catch (SQLException ex) {
        System.out.println("Error checking duplicate: " + ex.getMessage());
    }
    return exists;
}

//Function to update data
        public void updateData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                    int rowsUpdated = pst.executeUpdate();
                        if(rowsUpdated > 0){
                            JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
                        }else{
                            System.out.println("Data Update Failed!");
                        }
                        pst.close();
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
            }
        
        }

        public boolean checkDuplicate(String tableName, String columnName, String value, int idToExclude) {
    String sql = "SELECT COUNT(*) FROM " + tableName + " WHERE " + columnName + " = ? AND p_id != ?";
    try (PreparedStatement pst = connect.prepareStatement(sql)) {
        pst.setString(1, value);
        pst.setInt(2, idToExclude);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0;
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return false;
}
        
}
