package day7;


class TestJoinMethod1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}

public class ThreadJoin1 {

	public static void main(String[] args) {
		TestJoinMethod1 t1=new TestJoinMethod1();  
		 TestJoinMethod1 t2=new TestJoinMethod1();  
		TestJoinMethod1 t3=new TestJoinMethod1();  
		t1.start();
		try {
			t1.join();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		t2.start();
		try {
			t2.join();
		}catch(Exception e) {
			
		}
		
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
