package serialization;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
public class SerializeDemo {
    public static void main(String[] args) throws IOException {
        Employee e=new Employee();
        e.id=10;
        //e.name="sarika";
        e.address="delhi";
        e.ssn=123_456;
        Employee.salary=1000;
            try (FileOutputStream fo = new FileOutputStream("F://emp111.ser")) //try with resourse
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
