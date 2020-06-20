
package addressbook.fxmForms;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 */
public class MessageDialogController implements Initializable {
    
    
     @FXML
    private Label lbl_message;

    @FXML
    private JFXButton btn_ok;

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public void addMessage(String message){
    
        
        lbl_message.setText(message);
    
    }
    

    @FXML
    void CloseBox(ActionEvent event) {

        
    }
    
}
