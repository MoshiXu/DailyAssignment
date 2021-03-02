package day8;

public class Book {

	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
