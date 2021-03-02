package standard;
import java.io.Console;
import java.io.IOException;

public class ReadPasswordConsole {

	public static void main(String[] args) throws IOException,NullPointerException {
	//	Console c=System.console();
		//if(c!= null){
		//System.out.println("Enter name");
		//String name=null;
		//name=c.readLine();
		//System.out.println("Enter password");
		//char[] ch=c.readPassword();
		//String pass=String.valueOf(ch);
		//System.out.println("Name "+name);
		//System.out.println("Password "+pass);
		Console console = System.console();
	      if (console == null) {
	         System.out.println("Console is not supported");
	         System.exit(1);
	      }
	      System.out.println("Enter your name: ");
	      String name = console.readLine();
		}
	

}
