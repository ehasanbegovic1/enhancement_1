/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook.fxmForms;

import addressbook.AddressBook;
import addressbook.AddressRecord;
import addressbook.CustomFileReader;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 */
public class CreateNewContactController implements Initializable {

    
    @FXML
    private JFXTextField txt_fname;

    @FXML
    private JFXTextField txt_lname;

    @FXML
    private JFXTextField txt_email;

    @FXML
    private JFXTextField txt_address;

    @FXML
    private JFXTextField txt_phone;

    @FXML
    private JFXButton btn_add;

    @FXML
    void addNewContact(ActionEvent event) {
        
        
            String fname = txt_fname.getText();
            String lname = txt_lname.getText();
            String email = txt_email.getText();
            String address = txt_address.getText();
            String phone = txt_phone.getText();
            
            addContact(fname, lname, address, email, phone);
            
            txt_fname.setText("");
            txt_lname.setText("");
            txt_email.setText("");
            txt_address.setText("");
            txt_phone.setText("");

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    
    
    public void addContact(String fname, String lname, String adress, String email, String phone) {
    
    AddressRecord record = new AddressRecord();
    record.setFname(fname);
    record.setLname(lname);
    record.setAddress(adress);
    record.setEmail(email);
    record.setPhone(phone);
    
    CustomFileReader.addAdderss(record);
    
        AddressBook.setSize(CustomFileReader.getAddressBookSize());
    
    
    }
    
}
