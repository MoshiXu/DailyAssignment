package day6;


class CreditCard{
	
	void payBill(Payable p) {
		System.out.println("Hello");
		p.pay();
	}
	
}

public class PayableExample {

	public static void main(String[] args) {
		
		CreditCard c=new CreditCard();
		
		c.payBill(new Payable() {

			@Override
			public void pay() {
				System.out.println("World");
			}
			
		});
		
		

	}

}
