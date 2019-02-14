package entities;

public class Product_Construtor {

	public String name;
	public double price;
	public int qty;

	public Product_Construtor(String name, double price, int qty) {
		this.name = name;
		this.price = price; 
		this.qty = qty; 
	}

	public double totalValueInStock() {

		return qty * price;

	}

	public void addProducts(int qty) {
		this.qty += qty;
	}

	public void removeProducts(int qty) {
		this.qty -= qty;
	}

	public String toString() {

		return name + ", R$ " + String.format("%.2f", price) + ", " + qty + ", Total: R$ "
				+ String.format("%.2f", totalValueInStock());

	}

}
