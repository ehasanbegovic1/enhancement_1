
package addressbook;

import java.util.ArrayList;

public class UserDataStore {
    
    private static ArrayList<Users> users;

    public UserDataStore() {
        
        this.users = new ArrayList<>();
        
        addDefaultUser();
    }
    
    
    
    
    //get user
    public static boolean isMember(String userName, String password){
    
        
        for(Users user:users){
        
            if(user.getUserName().equals(userName) && user.getPassword().equals(password)){
            
                return true;
            }
        }
    
        return false;
    }
    
    public static void addNewMember(Users user){
    
        users.add(user);
    
    }
    
    
    public static boolean checkUserName(String username){
    
        
        for(Users user:users){
        
            if(user.getUserName().equals(username)){
            
                return true;
            }
        }
    
        return false;
    
    }
    
    
    private static void addDefaultUser(){
    
        Users user_1 = new Users("main","111", "Ms Developer");
        Users user_2 = new Users("User_1","2222", "Dr Developer");
        Users user_3 = new Users("User_1","3333", "Mr Developer");
        
        addNewMember(user_3);
        addNewMember(user_2);
        addNewMember(user_1);
    
    }
    
}
