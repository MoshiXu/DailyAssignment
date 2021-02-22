package day3;


abstract class Parent{
	public abstract void message();
}

class Child1 extends Parent{
	@Override
	public void message() {
		System.out.println("This is first subClass");
	}
}

class Child2 extends Parent{
	@Override
	public void message() {
		System.out.println("This is second subClass");
	}
}

public class ParentExample {

	public static void main(String[] args) {
		
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		
		c1.message();
		c2.message();
	}

}
