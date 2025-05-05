
package config;


import config.dbConnect;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ActivityLogger {
       public static void logLogin(int pId, String userType) {
        logAction(pId, userType, "LOGIN");
    }
    
    public static void logLogout(int pId, String userType) {
        logAction(pId, userType, "LOGOUT");
    }
    
    private static void logAction(int pId, String userType, String action) {
        try {
            dbConnect dbc = new dbConnect();
            String sql = "INSERT INTO system_logs (p_id, user_type, action) VALUES (?, ?, ?)";
            
            PreparedStatement pstmt = dbc.connect.prepareStatement(sql);
            pstmt.setInt(1, pId);
            pstmt.setString(2, userType);
            pstmt.setString(3, action);
            pstmt.executeUpdate();
            
            pstmt.close();
            dbc.connect.close();
        } catch (SQLException ex) {
            System.err.println("[LOGGER ERROR] " + ex.getMessage());
        }
    }
}
