package day2;

public class ArrayOfSquares {

	public static void main(String[] args) {
		
		Square[]r=new Square[10];
		int k=5;
		for(int i=0;i<10;i++) {
			r[i]=new Square(k);
			k++;
		}

		for(int i=0;i<10;i++) {
			r[i].printArea();
			r[i].printPerimeter();
		}
	}

}
