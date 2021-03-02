package fileInputOut;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataOutputExample {

	public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("java111.pdf");  
        DataOutputStream data = new DataOutputStream(file);  
         data.writeInt(65);  //to write primitive       
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
        
  //=========================================================================================
    FileInputStream input = new FileInputStream("java111.pdf");  
    DataInputStream inst = new DataInputStream(input);  
    int count = input.available();  
    byte[] ary = new byte[count];  
    inst.read(ary);  
    for (byte bt : ary) {  
      char k = (char) bt;  
      System.out.println(k);
    }
	}
}
