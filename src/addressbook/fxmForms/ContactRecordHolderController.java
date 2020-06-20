/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook.fxmForms;

import addressbook.AddressRecord;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 */
public class ContactRecordHolderController implements Initializable {

    @FXML
    private Label lbl_name;

    @FXML
    private Label lbl_email;

    @FXML
    private Label lbl_address;

    @FXML
    private Label lbl_phone;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setData(AddressRecord record) {

        lbl_name.setText("Name:"+record.getFname() + " " + record.getLname());
        lbl_email.setText("Email:"+record.getEmail());
        lbl_phone.setText("Phone: "+record.getPhone());
        lbl_address.setText("Address: "+record.getAddress());

    }

}
