package day7;

class TestMultipleTaskOne implements Runnable{
	@Override
	public void run() {
		System.out.println("task one");
	}
}

public class TestMultipleTask1 {

	public static void main(String[] args) {
		TestMultipleTaskOne r1=new TestMultipleTaskOne();
		Thread t1=new Thread(r1);
		t1.start();
		Thread t2=new Thread(r1);
		t2.start();

	}

}
