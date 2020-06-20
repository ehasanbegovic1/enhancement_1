/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook.fxmForms;

import addressbook.AddressRecord;
import addressbook.AddressBook;
import addressbook.CustomFileReader;
import java.net.URL;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.util.ArrayList;

/**
 * FXML Controller class
 *
 */
public class LoadContactsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private JFXTextField txt_fileName;

   
    @FXML
    void loadContacts(ActionEvent event) {

        if (!txt_fileName.getText().isEmpty()) {

            String path = txt_fileName.getText().trim() + ".txt";
            
            File file = new File(path);
            
            System.out.println("Path =>"+txt_fileName.getText());

            if (file.exists()) {

                
               AddressBook.setData(txt_fileName.getText()+".txt",CustomFileReader.getNumContacts(txt_fileName.getText()));

                ArrayList<AddressRecord> newBook = CustomFileReader.readFile();
               
                CustomFileReader.setAddressBook(newBook);
                
                

            } else {

                AddressBook.openMessaGEbOX("Address Book Not Found \nCreate a new One");
            }

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
