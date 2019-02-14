package entities;

public class Product_Encap {

	
	private String name;
	private double price;
	private int qty;
	
	
	public Product_Encap() {
		
	}
	
	public Product_Encap(String name, double price, int qty) {
		this.name = name;
		this.price = price; 
		this.qty = qty; 
	}
		
		public Product_Encap(String name, double price) {
			this.name = name;
			this.price = price; 
	}

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name; 
		}
		
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
			this.price = price; 
		}
		
		
		public int getQty() {
			return qty;
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

	
	@Override
	public String toString() {
		return "Product_Encap [name=" + name + ", price=" + price + ", qty=" + qty + ", totalValueInStock()="
				+ totalValueInStock() + "]";
	}
	
}



