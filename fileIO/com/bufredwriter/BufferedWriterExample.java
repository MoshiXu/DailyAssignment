
package com.bufredwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedWriterExample {
    public static void main(String[] args) throws IOException{ 
        FileWriter writer=new FileWriter("F://output1.txt");
          BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to javaWorld.");  
    buffer.close();  
    System.out.println("Success"); 
    
    //============================
    try{
    FileReader reader=new FileReader("F://output1.txt");
      BufferedReader b = new BufferedReader(reader);  
//          int b1=0;
//    while((b1=b.read())!=-1){
//                System.out.print((char)b1);
//            }  
        System.out.println(b.readLine());
    b.close();  
}catch(Exception e){}
    }
}
