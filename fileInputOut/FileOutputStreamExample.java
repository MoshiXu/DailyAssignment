package fileInputOut;

import java.io.*;

import java.io.*;
public class FileOutputStreamExample {
	public static void main(String[] args) throws FileNotFoundException,IOException {
        //FileOUTPUTDTREAM
        FileOutputStream fo;
        try { 
        	fo=new FileOutputStream("b20_2.txt");
           //fo.write(99);
        //fo.flush();
         //fo.close();
         //System.out.println("Success");
////=================================================================================================================
            // user BuffredinputStream
        	BufferedOutputStream bf=new BufferedOutputStream(fo);
        	String txt=" Welcome to Java!!";
            byte[] b=txt.getBytes();
            bf.write(b);
            bf.close();
//            fo.close();
  //          System.out.println("success");
//////////            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        catch(IOException e){}
//////  =======================================================================================================================      
        FileInputStream fi=new FileInputStream("b20_2.txt"); 
 //  int a=fi.read();
   //   System.out.println(" a ="+a);
     //fi.close();
        BufferedInputStream bin=new BufferedInputStream(fi);    
        int i;
        while( (i=bin.read())!=-1){
//
        	System.out.print((char)i);    
        }    
   //bin.close();    
  // fi.close(); 
    
    }
    
}
