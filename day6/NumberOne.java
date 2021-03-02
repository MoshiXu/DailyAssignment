package day6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NumberOne {
	
	public static void write(String str) throws IOException {
		FileWriter writer=new FileWriter("output.txt");
		BufferedWriter buffer=new BufferedWriter(writer);
		buffer.write(str);
		buffer.close();
		System.out.println("Success");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str="Hello!How you doing?This is Java";
		write(str);
	}

}
