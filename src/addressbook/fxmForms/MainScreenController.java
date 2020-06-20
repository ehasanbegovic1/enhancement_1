/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook.fxmForms;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 */
public class MainScreenController implements Initializable {

    
    @FXML
    private Label txt_bookname;

    @FXML
    private Label txt_booksize;
    
    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    
    public  void setBookSize(int size){
    
    txt_booksize.setText(""+size+" Contacts");
    
    }
    
    
    public  void setBookName(String bookname){
    
    txt_bookname.setText(bookname);
    
    }
    
}
