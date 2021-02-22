package day3;


abstract class Animal{
	abstract void cats();
	abstract void dogs();
}

class Cats extends Animal{

	@Override
	void cats() {
		System.out.println("Cats meow");
	}

	@Override
	void dogs() {
		
	}
}

class Dogs extends Animal{

	@Override
	void dogs() {
		System.out.println("Dogs bark");
	}

	@Override
	void cats() {
		
	}
}

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cats c=new Cats();
		c.cats();
		
		Dogs d=new Dogs();
		d.dogs();
	}

}
