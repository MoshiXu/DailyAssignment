
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) throws FileNotFoundException {
            PrintWriter writer =null;
            writer=new PrintWriter(System.out); 
            writer.write("Welcome to India!!!!!!");           
            writer.close();
    
         writer= new PrintWriter(new File("F://testout1.txt"));  
         writer.write("Like Java, Spring, Hibernate, Android, PHP etc.");                                                   
         writer.close();     
    }
    
}
