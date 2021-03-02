import java.io.*;
public class Keyboardinput {

	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("Enter name :");
		String name=br.readLine();
		System.out.println("Hello "+name);

	}

}
