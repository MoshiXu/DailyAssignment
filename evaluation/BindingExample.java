package evaluation;


class Vehicle{
	void start() {
		System.out.println("Vehicle started");
	}
	
	static void stop() {
		System.out.println("Vehicle stopped");
	}
}

class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("Car started");
	}
	
	static void stop() {
		System.out.println("Car stopped");
	}
}

public class BindingExample {

	public static void main(String[] args) {
		
		Vehicle v=new Car();
		
		v.start();
		v.stop();
		
		Vehicle.stop();
		Car.stop();

	}

}
