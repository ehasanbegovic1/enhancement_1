/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook.fxmForms;

import addressbook.AddressBook;
import addressbook.CustomFileReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
import java.io.IOException;
import javafx.fxml.FXML;

/**
 * FXML Controller class
 *
 */
public class HomeController implements Initializable {

    String path = "";

    @FXML
    private JFXTextField txt_bookName;

    @FXML
    private JFXButton btn_create;

    

    public void createBook() {

        String addressbookname = txt_bookName.getText() + ".txt";

        File file = new File(addressbookname);
        
        
        System.out.println("Here 1");

        try {
            if (file.createNewFile()) {
                
                
                CustomFileReader.createAddressBook();
                
                 
                AddressBook.setData(addressbookname, CustomFileReader.getAddressBookSize());
                
                 AddressBook.openMessaGEbOX("Book Created..");
                

            } else {

                //DO SOMETHING ELSE
                 AddressBook.openMessaGEbOX("The Book Alread Exits, Just Add Contacts");
            }

        } catch (IOException ex) {

            //The address book name alread exists
            AddressBook.openMessaGEbOX("Failed To Create " + ex+"->Path "+path);

        }

    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
