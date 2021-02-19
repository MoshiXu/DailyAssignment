package day2;


class Rectangle{
	int length;
	int breath;
	
	Rectangle(int length,int breath){
		this.length=length;
		this.breath=breath;
	}
	
	void printArea() {
		System.out.println("Area: "+length*breath);
	}
	
	void printPerimeter() {
		System.out.println("Perimeter: "+2*(length+breath));
	}
}

class Square extends Rectangle{
	int side;
	Square(int side) {
		super(side, side);
	}
}

public class RectangleExample {

	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(4,5);
		r.printArea();
		r.printPerimeter();
		
		Square s=new Square(5);
		s.printArea();
		s.printPerimeter();

	}

}
