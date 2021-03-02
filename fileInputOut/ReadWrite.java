package fileInputOut;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
       //try{
   //     FileOutputStream fout=new FileOutputStream("f://file1.txt");
     //   BufferedOutputStream bout=new BufferedOutputStream(fout);
        
        try (BufferedOutputStream bout=new BufferedOutputStream(
          new FileOutputStream("file1.txt"))){
        	String s="Hello !! Welcome back";
        	byte[] b=new byte[s.length()];
                    b=s.getBytes();
                  //  System.out.println(b);
                    bout.write(b);
                    System.out.println("Done");
                    
            //     bout.close();
            //     fout.close();
                  
        } catch (IOException ex) {
            Logger.getLogger(ReadWrite.class.getName()).log(Level.SEVERE, null, ex);
        }
  
            FileInputStream fi=new FileInputStream("file1.txt");
            BufferedInputStream bin=new BufferedInputStream(fi);    
    int i;    
    while((i=bin.read())!=-1){    
     System.out.print((char)i);    
    }    
    bin.close();
    fi.close();
        
    }
    
}
