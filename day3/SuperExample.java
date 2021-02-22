package day3;

class P2{
	int a,b;
	public void display() {
		System.out.println("Parent");
	}
}

class C2 extends P2{
	int c;
	public void display() {
		super.display();
		// System.out.println("Child");
	}
}

public class SuperExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 c=new C2();
		c.display();
	}

}
