package day8;

import java.util.Scanner;

class MyThread4 implements Runnable{

	private int num;

	public MyThread4(int num) {
		this.num=num;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+" = "+i*num);
		
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class PrintRunnable {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a number: ");
		int input=sc.nextInt();

		MyThread4 m=new MyThread4(input);
		Thread t1=new Thread(m);
		t1.start();
		t1.join();
		for(int i=0;i<5;i++) {
			System.out.println("Hello WOrld");
		}
		
	}

}
