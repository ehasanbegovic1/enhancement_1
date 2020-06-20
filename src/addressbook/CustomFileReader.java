package addressbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CustomFileReader {

    private static String path = "";
    private static String current_path;
    private static ArrayList<AddressRecord> addressbook = new ArrayList<>();

    public static ArrayList<AddressRecord> readFile() {

        int adressBookSize = getNumContacts(current_path);
       
        ArrayList<AddressRecord> array = new ArrayList();

        String addressbookname = current_path + ".txt";

        File file = new File(path + addressbookname);

        try {

            //new file has been created, lets set the size of the contact list in line one
            FileReader reader = new java.io.FileReader(path + addressbookname);

            //Create bufferreader
            BufferedReader br = new BufferedReader(reader);

            String[] line;

            for (int x = 0;; x++) {

                String rdline = br.readLine();

                if (rdline != null) {

                    line = rdline.split(",");

                    AddressRecord record = new AddressRecord();
                    record.setFname(line[0]);
                    record.setLname(line[1]);
                    record.setEmail(line[2]);
                    record.setAddress(line[3]);
                    record.setPhone(line[4]);

                    array.add(record);

                } else {

                    break;
                }

            }

            reader.close();

        } catch (IOException ex) {

            System.out.println("Error 1 " + ex);

        }

        return array;

    }

    public static Object[][] readFile(String username, int adressBookSize) {

        Object[][] data = new Object[adressBookSize][5];

        String addressbookname = username + ".txt";

        File file = new File(path + addressbookname);

        try {

            //new file has been created, lets set the size of the contact list in line one
            FileReader reader = new FileReader(path + addressbookname);

            //Create bufferreader
            BufferedReader br = new BufferedReader(reader);

            String[] line;

            for (int x = 0; x < adressBookSize; x++) {

                String rdline = br.readLine();

                if (rdline != null) {

                    line = rdline.split(",");

                    for (int y = 0; y < line.length; y++) {

                        data[x][y] = line[y];

                    }

                } else {

                    break;
                }

            }

            reader.close();

        } catch (IOException ex) {

            System.out.println("Error 2" + ex);

        }

        return data;

    }

    /*
    This function returns number of contacts in a file
     */
    public static int getNumContacts(String username) {

        String addressbookname = username + ".txt";

        File file = new File(addressbookname);
        
        current_path = username;
        
        System.out.println(username+"   "+addressbookname+"   path -> "+path);

        int count = 0;

        try {

            //new file has been created, lets set the size of the contact list in line one
            FileReader reader = new FileReader(path + addressbookname);

            //Create bufferreader
            BufferedReader br = new BufferedReader(reader);

            while (br.readLine() != null) {

                count++;

            }

            reader.close();

        } catch (IOException ex) {

            System.out.println("Error 3 11 " + ex);

        }
        return count;
    }

    public static void createAddressBook() {

        addressbook = new ArrayList<>();

    }

    public static void addAdderss(AddressRecord records) {

        addressbook.add(records);

    }

    public static ArrayList<AddressRecord> getAddressBook() {

        return addressbook;

    }

    public static int getAddressBookSize() {

        return addressbook.size();

    }
    
    
    public static void removeRecord(int pos){
    
        addressbook.remove(pos);
    
    }
    
    public static void setAddressBook(ArrayList<AddressRecord> records){
    
    addressbook = records;
    
    }

}
