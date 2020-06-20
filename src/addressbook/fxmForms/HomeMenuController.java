/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook.fxmForms;

import addressbook.AddressBook;
import addressbook.CustomFileWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 */
public class HomeMenuController implements Initializable {
    
    
     
    
     @FXML
    void createAddressBook(ActionEvent event) {
        
         AddressBook.CreateNewAddressBook();
    }

    @FXML
    void LoadContacts(ActionEvent event) {
        
        AddressBook.addLoadContactsForm();

    }

    @FXML
    void addNewContact(ActionEvent event) {
        
        AddressBook.addCreateContactsForm();

    }

    @FXML
    void createBackUp(ActionEvent event) {

        CustomFileWriter.BackUpContacts();
        
        AddressBook.openMessaGEbOX("All Contacts Savd To File, Thank you");
    }

    @FXML
    void viewCotact(ActionEvent event) {

        AddressBook.addViewContactsForm();
    }

    
    @FXML
    void searchContact(ActionEvent event) {

        AddressBook.loadSearchModule();
    }

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
