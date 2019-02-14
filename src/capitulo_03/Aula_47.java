package capitulo_03;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Aula_47 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		int qty;
		
			System.out.println("Enter a product data: ");
			System.out.print("Nome: ");
			product.name = sc.next();
			
			System.out.print("Price: ");
			product.price = sc.nextDouble();
			
			System.out.print("Quantity: ");
			product.qty = sc.nextInt(); 
			
			
			
			System.out.println("Product data: "+product);
			
			System.out.println("Enter a number of products to be add in stock: ");
			qty = sc.nextInt(); 
			product.addProducts(qty);
			
			System.out.println(" Update data: "+product);
		
			System.out.println("Enter a number of products to be removed from stock: ");
			qty = sc.nextInt(); 
			product.removeProducts(qty);
			
			System.out.println(" Update data: "+product);
			
			
		sc.close();

	}

}
