package entities;

public class Product {
	
	public String name;
	public double price;
	public int qty; 
	
	
	public double totalValueInStock() {
		
		return qty*price;
		
	}
	
	public void addProducts(int qty) {
		this.qty += qty;
	}

	public void removeProducts(int qty) {
		this.qty -= qty; 
	}
	
	public String toString() {
		
		return 	name
				+", R$ "
				+String.format("%.2f",price)
				+", "
				+qty
				+", Total: R$ "
				+String.format("%.2f",totalValueInStock());
		
	}
	
}
