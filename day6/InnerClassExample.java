package day6;

import day6.Computer.HardDrive;
import static java.lang.Math.sqrt;

public class InnerClassExample {
	
	public static void main(String[] args) {
		
		Computer c=new Computer();
		Computer.printOuter();
		
		Computer.HardDrive hd=new Computer.HardDrive();
		
		hd.PrintInner();
		
		
		HardDrive hdd=new HardDrive();
		hdd.PrintInner();
		
		System.out.println(sqrt(4));
		System.out.println(Math.sqrt(16));
	}

}
