package day7;


interface myInterfaceA{
	void display();

	interface myInterfaceB{
		void myMethod();
	}
}

public class NestedInterface implements myInterfaceA.myInterfaceB{

	@Override
	public void myMethod() {
		System.out.println("Testing nested interface");
	}
	
	public static void main(String[] args) {
		myInterfaceA.myInterfaceB it=new NestedInterface();
		it.myMethod();
	}

}
