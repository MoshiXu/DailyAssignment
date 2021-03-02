package serialUID;

import java.io.*; 
class Sender { 
    public static void main(String[] args) throws IOException 
    { 
        A obj = new A(); 
        // Here data30.txt is the file name where the object is 
        // going to serialize 
        FileOutputStream fos = new FileOutputStream("data30.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(obj); 
    } 
} 
