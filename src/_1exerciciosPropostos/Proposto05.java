package _1exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Proposto05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, num1, cod2, num2; 
		double val1, val2;
		

		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		val1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		val2 = sc.nextDouble();
		
		double sal1 = (double)num1*val1; 
		double sal2 = (double)num2*val2; 
		
		double total = sal1+sal2; 
		
		System.out.printf("Valor a pagar: R$ %.2f%n",total);
		
		
		sc.close();
		

	}

}
