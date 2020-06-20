package addressbook;

import static addressbook.AddressBook.HomeScreen;
import addressbook.fxmForms.ContactRecordHolderController;
import addressbook.fxmForms.MainScreenController;
import addressbook.fxmForms.ViewContactsController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.LoadException;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class AddressBook extends Application {

    public static BorderPane MainWindow;
    public static BorderPane HomeScreen;
    public static MainScreenController mainCreenController;
    public static Stage mainStage;
    public static String bookname;

    public static String getBookname() {
        return bookname;
    }

    public static void setBookname(String bookname) {
        AddressBook.bookname = bookname;
    }
    
    

    @Override
    public void start(Stage primaryStage) {

        UserDataStore initialiseDat = new UserDataStore();

        try {

            mainStage = primaryStage;
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(AddressBook.class.getResource("fxmForms/LogIn.fxml"));
            MainWindow = loader.load();
            Scene myscene = new Scene(MainWindow, 850, 400);
            mainStage.setScene(myscene);

            mainStage.show();

        } catch (Exception exc) {

            System.out.println(" Error " + exc);
        }

    }

    public static void loadContacts() {

    }

    public static void addHomeMenu() {

        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(AddressBook.class.getResource("fxmForms/HomeMenu.fxml"));
            VBox home = loader.load();
            MainWindow.setLeft(home);

        } catch (Exception exc) {

            System.out.println(" Error " + exc);
        }

    }

    public static void CreateNewAddressBook() {

        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(AddressBook.class.getResource("fxmForms/Home.fxml"));
            StackPane home = loader.load();
            HomeScreen.setCenter(home);

        } catch (Exception exc) {

            System.out.println(" Error " + exc);
        }

    }

    public static void openMessaGEbOX(String message) {

        JOptionPane.showMessageDialog(null, message, "Contact Manage", 0);

    }

    public static void setData(String bookname, int bookSize) {

        mainCreenController.setBookName(bookname);
        mainCreenController.setBookSize(bookSize);
        
        setBookname(bookname);

    }

    public static void setSize(int bookSize) {

        mainCreenController.setBookSize(bookSize);

    }

    public static void addLoadContactsForm() {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(AddressBook.class.getResource("fxmForms/LoadContacts.fxml"));
            StackPane home = loader.load();
            HomeScreen.setCenter(home);

        } catch (Exception exc) {

            System.out.println(" Error " + exc);
        }

    }

    public static void addCreateContactsForm() {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(AddressBook.class.getResource("fxmForms/CreateNewContact.fxml"));
            StackPane home = loader.load();
            HomeScreen.setCenter(home);

        } catch (Exception exc) {

            System.out.println(" Error " + exc);
        }

    }

    public static void addViewContactsForm() {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(AddressBook.class.getResource("fxmForms/ViewContacts.fxml"));
            StackPane home = loader.load();
            ViewContactsController controller = loader.getController();
            controller.loadData();
            HomeScreen.setCenter(home);

        } catch (Exception exc) {

            System.out.println(" Error Here Man" + exc);
        }

    }

    public static FXMLLoader getAddressRecordHolderLoader() {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(AddressBook.class.getResource("fxmForms/ContactRecordHolder.fxml"));

            System.out.println("Loader Added");
            
            return loader;

        } catch (Exception exc) {

            System.out.println(" Error Is Here 11 -> " + exc);
        }

        return null;
    }
    
    
    public static void loadSearchModule(){
    
        
         try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(AddressBook.class.getResource("fxmForms/SearchContact.fxml"));
            StackPane home = loader.load();
            HomeScreen.setCenter(home);

        } catch (Exception exc) {

            System.out.println(" Error Is Here 11 -> " + exc);
        }

    }

    public static void AddHomeScreen() {

        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(AddressBook.class.getResource("fxmForms/MainScreen.fxml"));
            HomeScreen = loader.load();

            System.out.println("Controller Created...");
            mainCreenController = loader.getController();
            MainWindow.setCenter(HomeScreen);
            addHomeMenu();

        } catch (Exception exc) {

            System.out.println("  Error " + exc);

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
