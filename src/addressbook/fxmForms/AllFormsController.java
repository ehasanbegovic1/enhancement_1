
package addressbook.fxmForms;

import javafx.fxml.FXMLLoader;

public class AllFormsController {
    
    
    public void openForm(String formName){
    
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(AllFormsController.class.getResource(formName));
    
    }
    
}
