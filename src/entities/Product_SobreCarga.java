package entities;

public class Product_SobreCarga {

	public String name;
	public double price;
	public int qty;

	
	public Product_SobreCarga() {
		
	}
	
	public Product_SobreCarga(String name, double price, int qty) {
		this.name = name;
		this.price = price; 
		this.qty = qty; 
	}
		
		public Product_SobreCarga(String name, double price) {
			this.name = name;
			this.price = price; 
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
