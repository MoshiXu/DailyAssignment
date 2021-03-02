package day6;

public class Computer {

	static int a=10;
	public static void printOuter() {
		System.out.println("a ="+a);
	}
	
	static class HardDrive{
		int ainner=100;
		public void PrintInner() {
			printOuter();
			System.out.println("ainner "+ainner);
			System.out.println("a in inner class "+a);
		}
	}
}
