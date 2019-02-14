package _1exerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Proposto04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); 
		int horas = sc.nextInt();
		double vHora = sc.nextDouble();
		
		double sal = (double)horas*vHora;
		
		System.out.println("NUMBER = "+num);
		System.out.printf("SALARY = U$ %.2f",sal);
		
		
		sc.close();
		
	}

}
