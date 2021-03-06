package evaluation;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 
public class SerializationWithInheritance2 {
 
    public static void main(String[] args) {
 
        // creating Privileged Customer object
        PrivilegedCustomer2 serializePrivilegedCustomer = 
                new PrivilegedCustomer2();
 
        // initialize values for privileged customer object
        serializePrivilegedCustomer.customerId = 101;
        serializePrivilegedCustomer.customerName = "SJ";
        serializePrivilegedCustomer.discountRate = 12.5f;
        serializePrivilegedCustomer.bonusPoints = 1000;
 
        // time to play with Serialization and De-Serialization process
 
        // creating output stream variables
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
 
        // creating input stream variables
        FileInputStream fis = null;
        ObjectInputStream ois = null;
 
        // creating customer object reference 
        // to hold values after de-serialization 
        Customer2 deSerializePrivilegedCustomer = null;
 
        try {
            // for writing or saving binary data
            fos = new FileOutputStream("CustomerInheritance.ser");
 
            // converting java-object to binary-format 
            oos = new ObjectOutputStream(fos);
 
            // writing or saving customer object's value to stream
            oos.writeObject(serializePrivilegedCustomer);
            oos.flush();
            oos.close();
 
            System.out.println("Serialization: Privileged Customer "
                    + "object saved to CustomerInheritance.ser file\n");
 
            // reading binary data
            fis = new FileInputStream("CustomerInheritance.ser");
 
            // converting binary-data to java-object
            ois = new ObjectInputStream(fis);
 
            // reading object's value and casting to Customer class
            deSerializePrivilegedCustomer = 
                    (PrivilegedCustomer2) ois.readObject();
            ois.close();
 
            System.out.println("De-Serialization: "
                    + "Privileged Customer object de-serialized "
                    + "from CustomerInheritance.ser file\n");
        } 
        catch (FileNotFoundException fnfex) {
            fnfex.printStackTrace();
        }
        catch (IOException ioex) {
            ioex.printStackTrace();
        }
        catch (ClassNotFoundException ccex) {
            ccex.printStackTrace();
        }
 
        // printing customer object to console using toString() method
        System.out.println("Printing privilege customer values "
                + "from de-serialized object... \n"
                + deSerializePrivilegedCustomer);
    }
}
