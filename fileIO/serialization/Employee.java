package serialization;


import java.io.Serializable;


public class Employee implements Serializable {
    //String name;
    String address;
     transient int ssn;
    int id;
    static int salary;
    
     public void mailCheck() {
   //   System.out.println("Mailing a check to " + name + " " + address);
   }
    
}

