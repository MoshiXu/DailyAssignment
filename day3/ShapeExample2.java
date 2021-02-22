package day3;


public class ShapeExample2 {

	public static void main(String[] args) {
		
		Area[] r=new Area[4];
		for(int i=0;i<4;i++) {
			r[i]=new Area();
			//a.RectangleArea(4, 5);
		}
		
		for(int i=0;i<4;i++) {
			r[i].RectangleArea(4, 5);
		}
		
		for(int j=0;j<4;j++) {
			r[j].SquareArea(5);
		}
		
		Area[] c=new Area[5];
		for(int i=0;i<5;i++) {
			c[i]=new Area();
		}
		for(int i=0;i<5;i++) {
			c[i].CircleArea(6);
		}
		
	}

}
