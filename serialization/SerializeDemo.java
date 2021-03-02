package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
public class SerializeDemo {
    public static void main(String[] args) throws IOException {
        Employee1 e=new Employee1();
        e.id=10;
        //e.name="sarika";
        e.address="delhi";
        e.ssn=123_456;
        Employee1.salary=1000;
            try (FileOutputStream fo = new FileOutputStream("emp111.ser")) //try with resourse
            {
                ObjectOutputStream os=new ObjectOutputStream(fo);
                os.writeObject(e);
                os.close();
            }
            System.out.println("done");
       
//        catch (IOException ex) {
//            ex.printStackTrace();
//        }
        
    }
    
}