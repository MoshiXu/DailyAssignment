package day3;


abstract class Bank{
	abstract void getBalance();
}

class BankA extends Bank{
	@Override
	void getBalance() {
		System.out.println("$100 deposited");
	}
}

class BankB extends Bank{
	@Override
	void getBalance() {
		System.out.println("$150 deposited");
	}
}

class BankC extends Bank{
	@Override
	void getBalance() {
		System.out.println("$200 deposited");
	}
}

public class BankExample {

	public static void main(String[] args) {
		BankA a=new BankA();
		BankB b=new BankB();
		BankC c=new BankC();
		
		a.getBalance();
		b.getBalance();
		c.getBalance();
	}

}
