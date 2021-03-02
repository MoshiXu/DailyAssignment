package day5;


class Product{
	private int pID;
	private String name;
	private double price;
	public Product(int pID,String name,double price) {
		this.pID=pID;
		this.name=name;
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
}

class Order{
	private int qty;
	private Product p;
	public Order(int qty,Product p) {
		this.qty=qty;
		this.p=p;
	}
	public double getCost() {
		return qty*p.getPrice();
	}
}

public class OrderOfProduct {
	public static void main(String[] args) {
		
		double totalBill=0;
		Product p1,p2,p3;
		p1=new Product(1,"p1",100);
		p2=new Product(2,"p2",102);
		p3=new Product(3,"p3",110);
		
		Order o1=new Order(2,p1);
		Order o2=new Order(3,p2);
		Order o3=new Order(1,p3);
		
		totalBill+=o1.getCost()+o2.getCost()+o3.getCost();
		System.out.println("Total price: "+totalBill);
	}
}
