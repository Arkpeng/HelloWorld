package Class;

public class Book {
	private String name;
	private String author;
	private double price;
	
	public Book(String name,String author,double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public double getPrice() {
		return this.price;
	}
	private void setName(String name) {
		this.name = name;
	}
	
	private void setAuthor(String author) {
		this.author = author;
	}
	
	private void setPrice(double price) {
		this.price = price;
	}
	public static void main(String[] args) {
		Book book = new Book("Java����","����",100.0);
		System.out.println(book.getName());
	}
}
