package _1exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Proposto02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor do raio:");
		double raio = sc.nextDouble();
		
		double area1 = Math.PI*raio*raio; 
		double area2 = 3.14159*raio*raio; 
		
		System.out.printf("A=%.4f%n",area1);
		System.out.printf("A=%.4f",area2);
		
		sc.close();
		
		
		
	}

}
