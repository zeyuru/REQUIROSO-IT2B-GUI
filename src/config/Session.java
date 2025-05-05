
package config;


public class Session {
    private static Session instance;
        private String uid;
    private String fname;
      private String lname;
        private String email;
          private String username;
          private String type;
          private String status;
    private int p_id;
    private int pId;
    private String userType;
          
          
          private Session(){
              //private cons.prevents instance
              
              
              
          }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }   

    public static synchronized Session getInstance() {
       if(instance == null){
           instance = new Session();
       }
       return instance; 
    }

    public static boolean isInstanceEmpty() {
         return instance == null; 
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
          
         public int getUserId() {
 return this.p_id; // Or whatever stores your passenger ID
} 
       public void setP_id(int p_id) {
        this.p_id = p_id;
    } 
         
        public int getPId() {
        return pId;
    }
    
     public void setPId(int pId) {
        this.pId = pId;
    }
     
    public String getUserType() {
        return userType;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }
}
