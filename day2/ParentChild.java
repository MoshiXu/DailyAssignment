package day2;


class Parent{
	public void pPrint() {
		System.out.println("This is parent class");
	}
}

class Child extends Parent{
	public void cPrint() {
		System.out.println("This is child class");
	}
}

public class ParentChild {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.pPrint();
		
		Child c=new Child();
		c.cPrint();
		
		c.pPrint();
		//c.cPrint();
		
	}

}
