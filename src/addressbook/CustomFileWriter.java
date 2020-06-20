package addressbook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CustomFileWriter {

    public static void updateTextFile(List<AddressRecord> records, String addressBookName, String path) {

       
        String addressbookname = addressBookName + ".txt";
        String newaddressbookname = "temp.txt";

        try {

            String line;
            try (FileWriter writer = new FileWriter(path + newaddressbookname, true)) {
                for (int x = 0; x < records.size(); x++) {

                    PrintWriter output = new PrintWriter(writer);
                    //add address book size
                    output.println(records.get(x).toString());

                }
            }

            File filetodlt = new File(path + addressbookname);

            //Files.deleteIfExists(Paths.get(filetodlt.getAbsolutePath()));
            if (!filetodlt.delete()) {

                System.out.println("Could not delete file");
            }

            File tempFile = new File(path + newaddressbookname);
            tempFile.renameTo(filetodlt);

        } catch (IOException ex) {

            System.out.println("" + ex);
        }

    }
    
    
     public static void BackUpContacts() {
         
         ArrayList<AddressRecord> records = CustomFileReader.getAddressBook();

        String filename = AddressBook.getBookname();
        String path = "";

        File addressbook = new File(path + filename);

        try {

            //new file has been created, lets set the size of the contact list in line one
            FileWriter writer = new FileWriter(addressbook);
            PrintWriter output = new PrintWriter(writer);
            //add address book size
           for(int x =0; x < records.size() ; x++){
           
               String fname = records.get(x).getFname();
               String lname = records.get(x).getLname();
               String email = records.get(x).getEmail();
               String adress = records.get(x).getAddress();
               String phone = records.get(x).getPhone();
               
               output.println( fname+ "," + lname + "," + email + "," + adress + "," + phone);
           
           }

            writer.close();

        } catch (IOException exc) {

            System.out.println("Error On Wrtting "+exc);
        }

    }

     
     

}
