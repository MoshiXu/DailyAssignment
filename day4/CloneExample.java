package day4;


class Test{
	int x,y;
	Test(){
		x=10;
		y=20;
	}
}

public class CloneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		System.out.println(t1.x+" "+t1.y);
		
		
		Test t2=t1;
		System.out.println(t2.x+" "+t2.y);
		
		t2.x=4;
		System.out.println(t1.x);
		System.out.println(t2.x);
		
	}

}
