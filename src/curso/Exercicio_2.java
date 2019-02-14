package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		
		System.out.println("How many brothers are there in your house?");
		int age = sc.nextInt();
		
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		
		System.out.println("Enter your last name, age and height (same line):");
	
		String lname = sc.next(); 
		int age2 = sc.nextInt();
		double h = sc.nextDouble();
		
		
		System.out.println("----------Resposta------------");
		
		System.out.println(name);
		System.out.println(age);
		System.out.printf("%.2f%n",price);
		System.out.println(lname);
		System.out.println(age2);
		System.out.println(h);
		
		sc.close();

	}

}
