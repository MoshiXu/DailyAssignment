package fileInputOut;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
public class WriterExample {
    public static void main(String[] args) {
        FileWriter w = null;
        try {
            w = new FileWriter("java002.txt");
            String content = "I love my country";
            w.write(content);
            w.close();
            System.out.println("Done");
        } catch (IOException ex) {
            System.out.println("ioexception");
        }
        //======================================
        try {
            FileReader r=new FileReader("java002.txt");
            int c;
            while((c=r.read())!=-1){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException ex) { 
        } catch (IOException ex) {}  
    }
}
