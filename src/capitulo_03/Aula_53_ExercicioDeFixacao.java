package capitulo_03;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Aula_53_ExercicioDeFixacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("What is the dollar price:");
		double dollar = sc.nextDouble(); 
		
		System.out.print("How many will be bought?");
		double qty = sc.nextDouble();
		
		System.out.printf("Amount to be paid in R$ is %.2f",CurrencyConverter.reais(dollar, qty));
		
		
		
		sc.close();
		

	}

}
