package day3;

abstract class Shape{
	abstract void RectangleArea(int length,int breath);
	abstract void SquareArea(int side);
	abstract void CircleArea(int radius);
}

class Area extends Shape{

	@Override
	void RectangleArea(int length, int breath) {
		System.out.println("The area of rectangle: "+length*breath);
	}

	@Override
	void SquareArea(int side) {
		System.out.println("The area of square: "+side*side);
	}

	@Override
	void CircleArea(int radius) {
		System.out.println("The area of circle: "+Math.PI*radius*radius);
	}
	
}

public class ShapeExample {

	public static void main(String[] args) {
		
		Area a=new Area();
		a.CircleArea(4);
		a.RectangleArea(6, 5);
		a.SquareArea(5);
	}

}
