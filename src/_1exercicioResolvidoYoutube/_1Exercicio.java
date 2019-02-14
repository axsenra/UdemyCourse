package _1exercicioResolvidoYoutube;

import java.util.Locale;
import java.util.Scanner;

public class _1Exercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Largura do terreno:");
		double largura = sc.nextDouble();
		
		System.out.println("Comprimento do terreno:");
		double comp = sc.nextDouble();
		
		System.out.println("Valor do m² do terreno:");
		double valor = sc.nextDouble();
		
		double area = largura * comp; 
		double valorTotal = area * valor; 
		
		System.out.printf("Area = %.2f%n",area);
		System.out.printf("Valor = %.2f%n",valorTotal);
		
		
		sc.close();
		
	}

}
