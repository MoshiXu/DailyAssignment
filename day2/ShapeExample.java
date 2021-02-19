package day2;


class Shape{
	void printShape() {
		System.out.println("This is shape");
	}
}

class Rectangle1 extends Shape{
	void printRectangle() {
		System.out.println("This is rectangle shape");
	}
}

class Circle extends Shape{
	void printCircle() {
		System.out.println("This is circular shape");
	}
}

class Square1 extends Rectangle1{
	void printSquare() {
		System.out.println("Square is a rectangle");
	}
}

public class ShapeExample {

	public static void main(String[] args) {
		Square1 s=new Square1();
		s.printSquare();
		s.printRectangle();
		
	}

}
