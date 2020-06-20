
package addressbook.fxmForms;

import addressbook.AddressBook;
import addressbook.UserDataStore;
import addressbook.Users;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 */
public class LogInController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private JFXTextField txt_LuserName;

    @FXML
    private JFXPasswordField txt_userpassword;

   
    @FXML
    private JFXTextField txt_fullName;

    @FXML
    private JFXTextField txt_CuserName;

    @FXML
    private JFXPasswordField txt_Lpassword;

    @FXML
    private JFXPasswordField txt_LsecPassword;

    @FXML
    void CheckUser(ActionEvent event) {
        
        
        String username = txt_LuserName.getText();
        String pass = txt_userpassword.getText();
        
        if(UserDataStore.isMember(username, pass)){
        
            //open new form
            AddressBook.AddHomeScreen();
        
        }else{
        
            AddressBook.openMessaGEbOX("Account Not Found");
        
        }

    }

    @FXML
    void createAccount(ActionEvent event) {
        
        String user_name = txt_CuserName.getText();
        String user_pass = txt_Lpassword.getText();
        String user_secPass = txt_LsecPassword.getText();
        String full_name = txt_fullName.getText();
        
        if(user_pass.equals(user_secPass)){
            
            if(!UserDataStore.checkUserName(user_name)){
                
                Users user = new Users(user_name, user_pass, full_name);
                UserDataStore.addNewMember(user);
                AddressBook.openMessaGEbOX("Account Created, Please Log In");
                
            
            }else{
            
                
                AddressBook.openMessaGEbOX("User Name is in Use");
            
            }
            
        
        }else{
        
            AddressBook.openMessaGEbOX("Passwords Do Not Match");
         
        }
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    
    public static void setBookName(){
    
    
    
    }
    
}
