package day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberTwo {
	
	public static void read() throws IOException {
		FileReader reader=new FileReader("output.txt");
		BufferedReader b=new BufferedReader(reader);
		System.out.println(b.readLine());
		//String str=b.readLine();
		System.out.println(b.readLine() instanceof String);
		b.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read();
	}

}
