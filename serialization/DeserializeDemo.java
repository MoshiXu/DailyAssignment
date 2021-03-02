package serialization;


import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class DeserializeDemo {
    public static void main(String[] args) {
        FileInputStream fis=null;
         Employee1 e=null;
        try {
            fis = new FileInputStream("emp111.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            e =  (Employee1) ois.readObject();
           // e.mailCheck();
            ois.close();   
             fis.close();
        }
//        catch  (IOException ex) {
//                ex.printStackTrace();
//            
//        }
//        catch(ClassNotFoundException c) {
//         System.out.println("Employee class not found");
//         c.printStackTrace();
//        
//      }
        catch(Exception ex){
        ex.printStackTrace();
        }
        
        System.out.println("Deserialized Employee...");
      //System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("SSN: " + e.ssn);
      System.out.println("Id: " + e.id);
      System.out.println("salary: " + e.salary);
    }
    
}

