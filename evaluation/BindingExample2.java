package evaluation;

//early binding
public class BindingExample2 {
	
	public static class superclass{
		static void print() {
			System.out.println("Print in superclass");
		}
	}
	
	public static class subclass extends superclass{
		static void print() {
			System.out.println("print in subclass");
		}
	}

	public static void main(String[] args) {
		superclass A=new superclass();
		superclass B=new subclass();
		
		A.print();
		B.print();
	}
}
