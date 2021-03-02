package day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadIntoFileExample {

	public static void write(String name) throws IOException {
		FileWriter writer=new FileWriter("output.txt");
		BufferedWriter buffer=new BufferedWriter(writer);
		buffer.write(name);
		buffer.close();
		System.out.println("Success");
	}
	
	public static void read() throws IOException {
		FileReader reader=new FileReader("output.txt");
		BufferedReader b=new BufferedReader(reader);
		System.out.println(b.readLine());
		b.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		String name="Moshi Xu";
		write(name);
		read();
	}

}
