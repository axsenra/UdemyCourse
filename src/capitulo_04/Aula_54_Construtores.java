package capitulo_04;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_Construtor;

public class Aula_54_Construtores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a product data: ");
		System.out.print("Nome: ");
		String name = sc.next();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.print("Quantity: ");
		int qty = sc.nextInt();

		Product_Construtor product = new Product_Construtor(name, price, qty); 
		
		System.out.println("Product data: " + product);

		System.out.println("Enter a number of products to be add in stock: ");
		qty = sc.nextInt();
		product.addProducts(qty);

		System.out.println(" Update data: " + product);

		System.out.println("Enter a number of products to be removed from stock: ");
		qty = sc.nextInt();
		product.removeProducts(qty);

		System.out.println(" Update data: " + product);

		sc.close();

	}

}
