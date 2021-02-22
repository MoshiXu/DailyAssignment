package day3;


interface BankInterface{
	int getBalance(int n);
}

class Bank_A implements BankInterface{

	int balance;
	
	@Override
	public int getBalance(int balance) {
		return balance;
	}
}

class Bank_B implements BankInterface{

	int balance;
	
	@Override
	public int getBalance(int balance) {
		return balance;
	}
}

class Bank_C implements BankInterface{

	int balance;
	
	@Override
	public int getBalance(int balance) {
		return balance;
	}
}

public class BankInterfaceExample {

	public static void main(String[] args) {
		Bank_A a=new Bank_A();
		System.out.println(a.getBalance(1000));

		Bank_B b=new Bank_B();
		System.out.println(b.getBalance(1500));
		
		Bank_C c=new Bank_C();
		System.out.println(c.getBalance(2000));
	}

}
