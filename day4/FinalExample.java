package day4;


final class First{
	final int a=10;
	final int x,y;
	static final int z;
	public First() {
		x=100;
	}
	
	//inside block
	private void m1(){
		System.out.println("m1");
	}
	
	//instance block
	{
		int b=2;
		System.out.println(b);
		x=1000;
		b+=y;
		System.out.println(b);
	}
}

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f=new First();
		System.out.println(f.a);
	}

}
