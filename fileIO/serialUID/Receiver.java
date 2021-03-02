package serialUID;

import java.io.*; 
class Receiver { 
    public static void main(String[] args) throws IOException, ClassNotFoundException 
    { 
        // Here data30.txt is the file name where the object is 
        // going to Deserialized 
        FileInputStream fis = new FileInputStream("data30.txt"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        A obj = (A)ois.readObject(); 
        System.out.println("Deserialized Object Value:" + obj.i + "..."+obj.j); 
    } 
} 
