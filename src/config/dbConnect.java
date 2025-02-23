
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



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



}
