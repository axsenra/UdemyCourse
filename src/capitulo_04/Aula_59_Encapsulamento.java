package capitulo_04;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_Encap;

public class Aula_59_Encapsulamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a product data: ");
		System.out.print("Nome: ");
		String name = sc.next();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		Product_Encap product = new Product_Encap(name, price);
		
		// TESTE DO ENCAPSULAMENTO
		product.setName("Computador");
		System.out.println("Nome atualizado: "+product.getName());

		product.setPrice(1200.00);
		System.out.println("Nome atualizado: "+product.getPrice());
		
		
		
		System.out.println("Product data: " + product);

		System.out.println("Enter a number of products to be add in stock: ");
		int qty = sc.nextInt();
		product.addProducts(qty);

		System.out.println(" Update data: " + product);

		System.out.println("Enter a number of products to be removed from stock: ");
		qty = sc.nextInt();
		product.removeProducts(qty);

		System.out.println(" Update data: " + product);

		sc.close();

	}

}
