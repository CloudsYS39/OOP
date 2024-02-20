public class User {
    private String username;
    private String password;
    private int id;
    private boolean status;

    public User(String username, String password, int id, boolean b){
        this.username = username;
        this.password = password;
        this.id = id;
        this.status = b;
    }


    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }
 
    public void setId(int id){
    this.id = id;
    }


    public void setBoolean(boolean status){
     this.status=status;   
    }
    
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
        public int getId(){
    return this.id;   
    }

    public boolean getBoolean(){
     return this.status;   
}
}


  
