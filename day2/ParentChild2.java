package day2;


/*
class Parent2{
	private void pPrint() {
		System.out.println("This is parent class");
	}
}

class Child2 extends Parent2{
	private void cPrint() {
		System.out.println("This is child class");
	}
}
*/

public class ParentChild2 {

	static class Parent2{
		private void pPrint() {
			System.out.println("This is parent class");
		}
	}
	
	static class Child2{
		private void cPrint() {
			System.out.println("This is child class");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 p=new Parent2();
		p.pPrint();
		
		Child2 c=new Child2();
		c.cPrint();
		
		//c.pPrint();
	}

}
