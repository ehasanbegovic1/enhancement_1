package addressbook.fxmForms;

import addressbook.AddressRecord;
import addressbook.CustomFileReader;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 */
public class ViewContactsController implements Initializable {
    
    
    @FXML
    private VBox data_holder;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
    }

    public void loadData() {

        List<AddressRecord> records = CustomFileReader.getAddressBook();

        for (int x = 0; x < records.size(); x++) {

            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(ViewContactsController.class.getResource("ContactRecordHolder.fxml"));
                StackPane home = loader.load();
                ContactRecordHolderController controller = loader.getController();
                controller.setData(records.get(x));
                data_holder.getChildren().add(home);
                
                System.out.println("All Data Added");
                

           
            } catch (IOException exc) {
                
                
                exc.printStackTrace();
            }

        }

    }

}
