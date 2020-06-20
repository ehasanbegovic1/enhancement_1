/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook.fxmForms;

import addressbook.AddressRecord;
import addressbook.CustomFileReader;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 */
public class SearchContactController implements Initializable {

    @FXML
    private JFXTextField txt_hint;

    @FXML
    private JFXButton btn_search;

    @FXML
    private VBox vbx_contactHolder;

    @FXML
    private JFXComboBox<String> cmb_searchby;

    @FXML
    void searchContact(ActionEvent event) {

        search();
    }

    public void search() {

        switch (cmb_searchby.getSelectionModel().getSelectedIndex()) {
            case 0:
                SearchByEmail();
                break;
            case 1:
                SearchByPhone();
                break;
            case 2:
                SearchByLocation();
                break;
            case 3:
                SearchByFname();
                break;
            case 4:
                SearchByLname();
                break;
            default:
                break;
        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // TODO
        List<String> list = new ArrayList<>();
        list.add("Email");
        list.add("Phone Number");
        list.add("Location");
        list.add("First Name");
        list.add("Last Name");

        ObservableList<String> observableList = FXCollections.observableList(list);

        cmb_searchby.setItems(observableList);

        cmb_searchby.getSelectionModel().selectFirst();
    }

    public void SearchByEmail() {

        List<AddressRecord> records = CustomFileReader.getAddressBook();

        for (int x = 0; x < records.size(); x++) {

            if (records.get(x).getEmail().equalsIgnoreCase(txt_hint.getText())) {

                try {
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(ViewContactsController.class.getResource("ContactRecordHolder.fxml"));
                    StackPane home = loader.load();
                    ContactRecordHolderController controller = loader.getController();
                    controller.setData(records.get(x));
                    vbx_contactHolder.getChildren().add(home);

                    System.out.println("All Data Added");

                } catch (IOException exc) {

                    exc.printStackTrace();
                }

            }

        }

    }

    public void SearchByPhone() {

        List<AddressRecord> records = CustomFileReader.getAddressBook();

        for (int x = 0; x < records.size(); x++) {

            if (records.get(x).getPhone().equalsIgnoreCase(txt_hint.getText())) {

                try {
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(ViewContactsController.class.getResource("ContactRecordHolder.fxml"));
                    StackPane home = loader.load();
                    ContactRecordHolderController controller = loader.getController();
                    controller.setData(records.get(x));
                    vbx_contactHolder.getChildren().add(home);

                    System.out.println("All Data Added");

                } catch (IOException exc) {

                    exc.printStackTrace();
                }

            }

        }

    }

    public void SearchByLocation() {

        List<AddressRecord> records = CustomFileReader.getAddressBook();

        for (int x = 0; x < records.size(); x++) {

            if (records.get(x).getAddress().equalsIgnoreCase(txt_hint.getText())) {

                try {
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(ViewContactsController.class.getResource("ContactRecordHolder.fxml"));
                    StackPane home = loader.load();
                    ContactRecordHolderController controller = loader.getController();
                    controller.setData(records.get(x));
                    vbx_contactHolder.getChildren().add(home);

                    System.out.println("All Data Added");

                } catch (IOException exc) {

                    exc.printStackTrace();
                }

            }

        }

    }

    public void SearchByFname() {

        List<AddressRecord> records = CustomFileReader.getAddressBook();

        for (int x = 0; x < records.size(); x++) {

            if (records.get(x).getFname().equalsIgnoreCase(txt_hint.getText())) {

                try {
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(ViewContactsController.class.getResource("ContactRecordHolder.fxml"));
                    StackPane home = loader.load();
                    ContactRecordHolderController controller = loader.getController();
                    controller.setData(records.get(x));
                    vbx_contactHolder.getChildren().add(home);

                    System.out.println("All Data Added");

                } catch (IOException exc) {

                    exc.printStackTrace();
                }

            }

        }

    }

    public void SearchByLname() {

        List<AddressRecord> records = CustomFileReader.getAddressBook();

        for (int x = 0; x < records.size(); x++) {

            if (records.get(x).getLname().equalsIgnoreCase(txt_hint.getText())) {

                try {
                    FXMLLoader loader = new FXMLLoader();
                    loader.setLocation(ViewContactsController.class.getResource("ContactRecordHolder.fxml"));
                    StackPane home = loader.load();
                    ContactRecordHolderController controller = loader.getController();
                    controller.setData(records.get(x));
                    vbx_contactHolder.getChildren().add(home);

                    System.out.println("All Data Added");

                } catch (IOException exc) {

                    exc.printStackTrace();
                }

            }

        }

    }

}
