package day3;


abstract class AA{
	
	AA(){
		System.out.println("This is constructor of abstract class");
	}
	
	abstract void a_method();
	
	void b_method() {
		System.out.println("This is a normal method of abstract class");
	}
}

class SubClass extends AA{

	@Override
	void a_method() {
		System.out.println("This is abstract method");
	}
	
}

public class ConstractorExample {

	public static void main(String[] args) {
		SubClass s=new SubClass();
		s.a_method();
		s.b_method();
	}
}
