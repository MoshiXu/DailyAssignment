package day8;


class MyThread1 extends Thread{
	public void run() {
		for(int i=1;i<=30;i++) {
			System.out.println("Display "+i);
		}
	}
}

class MyThread2 extends Thread{
	public void run() {
		for(char i='a';i<='z';i++) {
			System.out.println("Show "+i);
		}
	}
}

public class ThreadAssignment {

	public static void main(String[] args) {
	
		MyThread1 t1=new MyThread1();
		t1.run();

		MyThread2 t2=new MyThread2();
		t2.run();
	}

}
